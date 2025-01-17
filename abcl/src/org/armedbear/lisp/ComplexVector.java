/*
 * ComplexVector.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id$
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

// A vector that is displaced to another array, has a fill pointer, and/or is
// expressly adjustable. It can hold elements of any type.
public final class ComplexVector extends AbstractVector
{
    private int capacity;
    private int fillPointer = -1; // -1 indicates no fill pointer.
    private boolean isDisplaced;

    // For non-displaced arrays.
    private LispObject[] elements;

    // For displaced arrays.
    private AbstractArray array;
    private int displacement;

    public ComplexVector(int capacity)
    {
        elements = new LispObject[capacity];
        for (int i = capacity; i-- > 0;)
            elements[i] = Fixnum.ZERO;
        this.capacity = capacity;
    }

    public ComplexVector(int capacity, AbstractArray array, int displacement)
    {
        this.capacity = capacity;
        this.array = array;
        this.displacement = displacement;
        isDisplaced = true;
    }

    @Override
    public LispObject typeOf()
    {
        return list(Symbol.VECTOR, T, Fixnum.getInstance(capacity));
    }

    @Override
    public LispObject classOf()
    {
        return BuiltInClass.VECTOR;
    }

    @Override
    public boolean hasFillPointer()
    {
        return fillPointer >= 0;
    }

    @Override
    public int getFillPointer()
    {
        return fillPointer;
    }

    @Override
    public void setFillPointer(int n)
    {
        fillPointer = n;
    }

    @Override
    public void setFillPointer(LispObject obj)
    {
        if (obj == T)
            fillPointer = capacity();
        else {
            int n = Fixnum.getValue(obj);
            if (n > capacity()) {
                StringBuffer sb = new StringBuffer("The new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the capacity of the vector (");
                sb.append(capacity());
                sb.append(").");
                error(new LispError(sb.toString()));
            } else if (n < 0) {
                StringBuffer sb = new StringBuffer("The new fill pointer (");
                sb.append(n);
                sb.append(") is negative.");
                error(new LispError(sb.toString()));
            } else
                fillPointer = n;
        }
    }

    @Override
    public boolean isDisplaced()
    {
        return isDisplaced;
    }

    @Override
    public LispObject arrayDisplacement()
    {
        LispObject value1, value2;
        if (array != null) {
            value1 = array;
            value2 = Fixnum.getInstance(displacement);
        } else {
            value1 = NIL;
            value2 = Fixnum.ZERO;
        }
        return LispThread.currentThread().setValues(value1, value2);
    }

    @Override
    public LispObject getArrayElementType()
    {
        return T;
    }

    @Override
    public boolean isSimpleVector()
    {
        return false;
    }

    @Override
    public int capacity()
    {
        return capacity;
    }

    @Override
    public int cl_length()
    {
        return fillPointer >= 0 ? fillPointer : capacity;
    }

    @Override
    public LispObject elt(int index)
    {
        final int limit = cl_length();
        if (index < 0 || index >= limit)
            badIndex(index, limit);
        return AREF(index);
    }

    // Ignores fill pointer.
    @Override
    public LispObject AREF(int index)
    {
        if (elements != null) {
            try {
                return elements[index];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                badIndex(index, elements.length);
                return NIL; // Not reached.
            }
        } else {
            // Displaced array.
            if (index < 0 || index >= capacity)
                badIndex(index, capacity);
            return array.AREF(index + displacement);
        }
    }

    @Override
    public void aset(int index, LispObject newValue)
    {
        if (elements != null) {
            try {
                elements[index] = newValue;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                badIndex(index, elements.length);
            }
        } else {
            // Displaced array.
            if (index < 0 || index >= capacity)
                badIndex(index, capacity);
            else
                array.aset(index + displacement, newValue);
        }
    }

    @Override
    public LispObject subseq(int start, int end)
    {
        SimpleVector v = new SimpleVector(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                v.aset(j++, AREF(i++));
            return v;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return error(new TypeError("Array index out of bounds: " + i + "."));
        }
    }

    @Override
    public void fill(LispObject obj)
    {
        for (int i = capacity; i-- > 0;)
            elements[i] = obj;
    }

    @Override
    public void shrink(int n)
    {
        if (elements != null) {
            if (n < elements.length) {
                LispObject[] newArray = new LispObject[n];
                System.arraycopy(elements, 0, newArray, 0, n);
                elements = newArray;
                capacity = n;
                return;
            }
            if (n == elements.length)
                return;
        }
        error(new LispError());
    }

    @Override
    public LispObject reverse()
    {
        int length = cl_length();
        SimpleVector result = new SimpleVector(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.aset(i, AREF(j));
        return result;
    }

    @Override
    public LispObject nreverse()
    {
        if (elements != null) {
            int i = 0;
            int j = cl_length() - 1;
            while (i < j) {
                LispObject temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                ++i;
                --j;
            }
        } else {
            // Displaced array.
            int length = cl_length();
            LispObject[] data = new LispObject[length];
            int i, j;
            for (i = 0, j = length - 1; i < length; i++, j--)
                data[i] = AREF(j);
            elements = data;
            capacity = length;
            array = null;
            displacement = 0;
            isDisplaced = false;
            fillPointer = -1;
        }
        return this;
    }

    @Override
    public void vectorPushExtend(LispObject element)

    {
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= capacity) {
            // Need to extend vector.
            ensureCapacity(capacity * 2 + 1);
        }
        aset(fillPointer++, element);
    }

    @Override
    public LispObject VECTOR_PUSH_EXTEND(LispObject element)

    {
        vectorPushExtend(element);
        return Fixnum.getInstance(fillPointer - 1);
    }

    @Override
    public LispObject VECTOR_PUSH_EXTEND(LispObject element, LispObject extension)

    {
        int ext = Fixnum.getValue(extension);
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= capacity) {
            // Need to extend vector.
            ext = Math.max(ext, capacity + 1);
            ensureCapacity(capacity + ext);
        }
        aset(fillPointer, element);
        return Fixnum.getInstance(fillPointer++);
    }

    private final void ensureCapacity(int minCapacity)
    {
        if (elements != null) {
            if (capacity < minCapacity) {
                LispObject[] newArray = new LispObject[minCapacity];
                System.arraycopy(elements, 0, newArray, 0, capacity);
                elements = newArray;
                capacity = minCapacity;
            }
        } else {
            // Displaced array.
            Debug.assertTrue(array != null);
            if (capacity < minCapacity ||
                array.getTotalSize() - displacement < minCapacity)
            {
                // Copy array.
                elements = new LispObject[minCapacity];
                final int limit =
                    Math.min(capacity, array.getTotalSize() - displacement);
                for (int i = 0; i < limit; i++)
                    elements[i] = array.AREF(displacement + i);
                capacity = minCapacity;
                array = null;
                displacement = 0;
                isDisplaced = false;
            }
        }
    }

    @Override
    public AbstractVector adjustArray(int newCapacity,
                                       LispObject initialElement,
                                       LispObject initialContents)

    {
        if (initialContents != null) {
            // "If INITIAL-CONTENTS is supplied, it is treated as for MAKE-
            // ARRAY. In this case none of the original contents of array
            // appears in the resulting array."
            LispObject[] newElements = new LispObject[newCapacity];
            if (initialContents.listp()) {
                LispObject list = initialContents;
                for (int i = 0; i < newCapacity; i++) {
                    newElements[i] = list.car();
                    list = list.cdr();
                }
            } else if (initialContents.vectorp()) {
                for (int i = 0; i < newCapacity; i++)
                    newElements[i] = initialContents.elt(i);
            } else
                type_error(initialContents, Symbol.SEQUENCE);
            elements = newElements;
        } else {
            if (elements == null) {
                // Displaced array. Copy existing elements.
                elements = new LispObject[newCapacity];
                final int limit = Math.min(capacity, newCapacity);
                for (int i = 0; i < limit; i++)
                    elements[i] = array.AREF(displacement + i);
            } else if (capacity != newCapacity) {
                LispObject[] newElements = new LispObject[newCapacity];
                System.arraycopy(elements, 0, newElements, 0,
                                 Math.min(capacity, newCapacity));
                elements = newElements;
            }
            // Initialize new elements (if any).
            if (initialElement != null)
                for (int i = capacity; i < newCapacity; i++)
                    elements[i] = initialElement;
        }
        capacity = newCapacity;
        array = null;
        displacement = 0;
        isDisplaced = false;
        return this;
    }

    @Override
    public AbstractVector adjustArray(int newCapacity,
                                       AbstractArray displacedTo,
                                       int displacement)

    {
        capacity = newCapacity;
        array = displacedTo;
        this.displacement = displacement;
        elements = null;
        isDisplaced = true;
        return this;
    }
}
