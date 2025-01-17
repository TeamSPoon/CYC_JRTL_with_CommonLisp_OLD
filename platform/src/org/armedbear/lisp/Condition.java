/*
 * Condition.java
 *
 * Copyright (C) 2003-2007 Peter Graves
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

import java.util.List;

import org.jpl7.Term;
import org.logicmoo.system.SystemCurrent;

public class Condition extends StandardObject
{
    public boolean isDontTrack() {
	   return true;
    }
	@Override
	public Term toProlog(List s)
	{
		return new org.jpl7.Atom(printReadableObject(true));
	}
	
  protected String message;

  protected void assertSlotsLength(int i) {
	  if(slots!=null) {
		  if(slots.length==i) return;
		  Debug.assertViolation("Slots!="+i + " on " + this);
	  } else {
		  Debug.assertViolation("Slots null on" + this);
		  slots = new LispObject[i];
	  }
	}

  public Condition()
  {
    super(StandardClass.CONDITION);
    assertSlotsLength( 2);
    setFormatArguments(NIL);
    marKCondition();
  }

  protected Condition(LispClass cls)
  {
    super(cls);
//    assertSlotsLength( 2);
    setFormatArguments(NIL);
    marKCondition();
  }

  public Condition(LispClass cls, int length)
  {
    super(cls, length);
    marKCondition();
  }

  public Condition(LispObject initArgs)
  {
    super(StandardClass.CONDITION);
    assertSlotsLength( 2);
    initialize(initArgs);
    marKCondition();
  }

  private void marKCondition() {
	  // maybe save a java stack trace here someday?
  }

protected void initialize(LispObject initArgs)
  {
    LispObject control = null;
    LispObject arguments = null;
    LispObject first, second;
    while (initArgs instanceof Cons)
      {
        first = initArgs.car();
        initArgs = initArgs.cdr();
        second = initArgs.car();
        initArgs = initArgs.cdr();
        if (first == Keyword.FORMAT_CONTROL)
          {
            if (control == null)
              control = second;
          }
        else if (first == Keyword.FORMAT_ARGUMENTS)
          {
            if (arguments == null)
              arguments = second;
          }
      }
    if (control != null)
      setFormatControl(control);
    if (arguments == null)
      arguments = NIL;
    setFormatArguments(arguments);
  }

  public Condition(String message)
  {
    super(StandardClass.CONDITION);
    assertSlotsLength( 2);
    setFormatControl(message.replaceAll("~","~~"));
    setFormatArguments(NIL);
  }

  public final LispObject getFormatControl()
  {
      return getInstanceSlotValue(Symbol.FORMAT_CONTROL);
  }

  public final void setFormatControl(LispObject formatControl)

  {
    setInstanceSlotValue(Symbol.FORMAT_CONTROL, formatControl);
  }

  public final void setFormatControl(String s)
  {
    setFormatControl(new SimpleString(s));
  }

  public final LispObject getFormatArguments()
  {
    return getInstanceSlotValue(Symbol.FORMAT_ARGUMENTS);
  }

  public final void setFormatArguments(LispObject formatArguments)

  {
    setInstanceSlotValue(Symbol.FORMAT_ARGUMENTS, formatArguments);
  }

  /**
   * Extending classes should override this method if they want to
   * customize how they will be printed.
   */
  public String getMessage()
  {
    return null;// "Some condition";
  }

  @Override
public LispObject typeOf()
  {
    LispObject c = getLispClass();
    if (c instanceof LispClass)
        return ((LispClass)c).getLispClassName();
    else if (c != null)
      return Symbol.CLASS_NAME.execute(c);
    return Symbol.CONDITION;
  }

  @Override
public LispObject classOf()
  {
    LispObject c = null;
    if (layout != null) {
      c =  layout.getLispClass();
    }
    if (c != null)
      return c;
    return StandardClass.CONDITION;
  }

  @Override
public LispObject typep(LispObject type)
  {
    if (type == Symbol.CONDITION)
      return T;
    if (type == StandardClass.CONDITION)
      return T;
    return super.typep(type);
  }

  public String getConditionReport()
  {
    String s = getMessage();
    if (s != null)
      return s;
    LispObject formatControl = getFormatControl();
    if (formatControl != NIL)
      {
        return format(formatControl, getFormatArguments());
      }
    return unreadableString(typeOf().princToString());
  }

  @Override
public final String printObjectImpl()
  {
    final LispThread thread = LispThread.currentThread();
    if (Symbol.PRINT_ESCAPE.symbolValue(thread) == NIL)
      {
        String s = getMessage();
        if (s != null)
          return s;
        LispObject formatControl = getFormatControl();
        if ((Object)formatControl instanceof Function)
          {
            StringOutputStream stream = new StringOutputStream();
            Symbol.APPLY.execute(formatControl, stream, getFormatArguments());
            return stream.getBufferString().getStringValue();
          }
        if (formatControl instanceof AbstractString)
          {
            LispObject f = Symbol.FORMAT.getSymbolFunction();
            if (f == null || (Object)f instanceof Autoload)
              return format(formatControl, getFormatArguments());
            return Symbol.APPLY.execute(f, NIL, formatControl, getFormatArguments()).getStringValue();
          }
        if(formatControl == UNBOUND_VALUE) {
          if(debug) SystemCurrent.originalSystemErr.println( "formatControl == " + formatControl );
        }
      }
    final int maxLevel;
    LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
    if (printLevel instanceof Fixnum)
      maxLevel = ((Fixnum)printLevel).value;
    else
      maxLevel = Integer.MAX_VALUE;
    LispObject currentPrintLevel =
      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
    int currentLevel = ((Fixnum)currentPrintLevel).value;
    if (currentLevel >= maxLevel)
      return "#";
    return unreadableString(typeOf().princToString());
  }
}
