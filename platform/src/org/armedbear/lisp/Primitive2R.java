/*
 * Primitive2R.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: Primitive2R.java,v 1.2 2007/02/23 21:17:34 piso Exp $
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
 */

package org.armedbear.lisp;

public class Primitive2R extends Function
{
    public Primitive2R(LispObject name)
    {
        super(name);
    }

    public Primitive2R(String name)
    {
        super(name);
    }

    public Primitive2R(String name, String arglist)
    {
        super(name, arglist);
    }

    public Primitive2R(LispObject name, LispObject lambdaList)
    {
        super(name, lambdaList);
    }

    public Primitive2R(String name, Package pkg)
    {
        super(name, pkg);
    }

    public Primitive2R(String name, Package pkg, boolean exported)
    {
        super(name, pkg, exported);
    }

    public Primitive2R(String name, Package pkg, boolean exported,
                     String arglist)
    {
        super(name, pkg, exported, arglist);
    }

    public Primitive2R(String name, Package pkg, boolean exported,
                     String arglist, String docstring)
    {
        super(name, pkg, exported, arglist, docstring);
    }

    @Override
	public LispObject typeOf()
    {
        return Symbol.COMPILED_FUNCTION;
    }

    @Override
	public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return _execute(first, second, NIL);
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return _execute(first, second, new Cons(third));
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return _execute(first, second, list2(third, fourth));
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth)
        throws ConditionThrowable
    {
        return _execute(first, second, list3(third, fourth, fifth));
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth)
        throws ConditionThrowable
    {
        return _execute(first, second, list4(third, fourth, fifth, sixth));
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh)
        throws ConditionThrowable
    {
        return _execute(first, second, list5(third, fourth, fifth, sixth,
                                             seventh));
    }

    @Override
	public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth,
                              LispObject fifth, LispObject sixth,
                              LispObject seventh, LispObject eighth)
        throws ConditionThrowable
    {
        return _execute(first, second, list6(third, fourth, fifth, sixth,
                                             seventh, eighth));
    }

    @Override
	public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        LispObject list = NIL;
        for (int i = args.length; i-- > 2;)
            list = new Cons(args[i], list);
        return _execute(args[0], args[1], list);
    }

    protected LispObject _execute(LispObject first, LispObject second,
                                  LispObject third)
        throws ConditionThrowable
    {
        return error(new LispError("Not implemented."));
    }
}
