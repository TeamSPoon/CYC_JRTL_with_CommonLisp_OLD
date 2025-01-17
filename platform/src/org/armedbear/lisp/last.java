/*
 * last.java
 *
 * Copyright (C) 2003-2006 Peter Graves
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
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

// ### last list &optional n => tail
public final class last extends Primitive
{
  public last()
  {
    super("last", "list &optional n");
  }

  @Override
public LispObject execute(LispObject arg)
  {
    if (arg == NIL)
      return NIL;
    if (arg instanceof Cons)
      {
        while (true)
          {
            LispObject cdr = ((Cons)arg).cdr;
            if (!(cdr instanceof Cons))
              return arg;
            arg = cdr;
          }
      }
    else
      return type_error(arg, Symbol.LIST);
  }

  @Override
public LispObject execute(LispObject first, LispObject second)

  {
    LispObject list = checkList(first);
    if (second instanceof Fixnum)
      {
        int n = ((Fixnum)second).value;
        if (n >= 0) {
          if (list == NIL)
            return NIL;
          LispObject result = list;
          while (list instanceof Cons)
            {
              list = list.cdr();
              if (n-- <= 0)
                result = result.cdr();
            }
          return result;
        }
      }
    else if (second instanceof Bignum)
      {
        if (list == NIL)
          return NIL;
        LispObject n = second;
        LispObject result = list;
        while (list instanceof Cons)
          {
            list = list.cdr();
            if (!n.plusp())
              result = result.cdr();
            n = n.decr();
          }
        return result;
      }
    return type_error(second, Symbol.UNSIGNED_BYTE);
  }

  private static final Primitive LAST = new last();
}
