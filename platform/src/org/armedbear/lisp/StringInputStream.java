/*
 * StringInputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
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

import java.io.IOException;
import java.io.StringReader;

public final class StringInputStream extends Stream
{
    private final StringReader stringReader;
    private final int start;
    private final String subString;

    public StringInputStream(String s)
    {
        this(s, 0, s.length());
    }

    public StringInputStream(String s, int start)
    {
        this(s, start, s.length());
    }

    public StringInputStream(String s, int start, int end)
    {
        super(Symbol.STRING_INPUT_STREAM, Keyword.INPUT_KEYWORD);
        setStreamElementType(Symbol.CHARACTER);
        setExternalFormat(keywordDefault);
        eolStyle = EolStyle.RAW;

        this.start = start;
      if(true) { // DONT REGRESS (true = OLD-WORKS)
        stringReader = new StringReader(s.substring(start, end));
        subString = null;
      } else {
        // NEW-BROKEN
        subString = s.substring(start, end);
        stringReader = new StringReader(subString);
      }
        initAsCharacterInputStream(stringReader);
    }

    @Override
	public LispObject typeOf()
    {
        return Symbol.STRING_INPUT_STREAM;
    }

    @Override
	public LispObject classOf()
    {
        return BuiltInClass.STRING_INPUT_STREAM;
    }

    @Override
	public LispObject typep(LispObject type)
    {
        if (type == Symbol.STRING_INPUT_STREAM)
            return T;
        if (type == Symbol.STRING_STREAM)
            return T;
        if (type == BuiltInClass.STRING_INPUT_STREAM)
            return T;
        if (type == BuiltInClass.STRING_STREAM)
            return T;
        return super.typep(type);
    }

    @Override
	public int getOffset() {
       // DONT REGRESS (true = OLD-WORKS)
        if(true) {return start + super.getOffset();}
        return start + offset;
    }

    @Override
	protected long _getFilePosition() {
       // DONT REGRESS (true = OLD-WORKS)
       if(true) { return super._getFilePosition(); }
       return getOffset();
    }

    @Override
	protected boolean _setFilePosition(LispObject arg) {
        // DONT REGRESS (true = OLD-WORKS)
        if(true) { return super._setFilePosition(arg); }
        try {
            int offset;

            if (arg == Keyword.START)
                offset = 0;
            else if (arg == Keyword.END)
                offset = subString.length();
            else {
                long n = Fixnum.getValue(arg);
                if (n < 0 || n > subString.length())
                    error(new StreamError(this, "FILE-POSITION got out of bounds argument."));
                offset = (int) n; // FIXME arg might be a bignum
            }

            stringReader.reset();
            stringReader.skip(offset);
            initAsCharacterInputStream(stringReader);

            this.offset = offset;
        }
        catch (IOException e) {
            error(new StreamError(this, e));
        }

        return true;
    }

    // ### make-string-input-stream
    // make-string-input-stream string &optional start end => string-stream
    private static final Primitive MAKE_STRING_INPUT_STREAM =
        new Primitive("make-string-input-stream", "string &optional start end")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            return new StringInputStream(arg.getStringValue());
        }

        @Override
		public LispObject execute(LispObject first, LispObject second)

        {
            String s = first.getStringValue();
            int start = Fixnum.getValue(second);
            return new StringInputStream(s, start);
        }

        @Override
		public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)

        {
            String s = first.getStringValue();
            int start = Fixnum.getValue(second);
            if (third == NIL)
                return new StringInputStream(s, start);
            int end = Fixnum.getValue(third);
            return new StringInputStream(s, start, end);
        }
    };

    // ### string-input-stream-current
    private static final Primitive STRING_INPUT_STREAM_CURRENT =
        new Primitive("string-input-stream-current", PACKAGE_EXT, true, "stream")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            if (arg instanceof StringInputStream)
                return Fixnum.getInstance(((StringInputStream)arg).getOffset());
            return error(new TypeError(String.valueOf(arg) +
                                        " is not a string input stream."));
        }
    };
}
