/*
 * RubyTag.java
 *
 * Copyright (C) 2002 Jens Luedicke <jens@irs-net.com>
 * based on PythonTag.java
 * $Id: RubyTag.java,v 1.1.1.1 2002/09/24 16:08:19 piso Exp $
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

package org.armedbear.j;

public final class RubyTag extends LocalTag
{
    public RubyTag(String name, Position pos, int type)
    {
        super(name, pos, type);
    }

    @Override
	public String getLongName()
    {
        if (name.startsWith("class "))
            return name;
        String s = signature.trim();
        if (s.startsWith("def ") || s.startsWith("def\t"))
            s = s.substring(4).trim();
        // Strip comment if any.
        int index = s.indexOf('#');
        if (index >= 0)
            s = s.substring(0, index).trim();
        index = s.indexOf(')');
        if (index >= 0)
            s = s.substring(0, index+1);
        if (s.endsWith("("))
            s = s.substring(0, s.length()-1);
        return s;
    }
}
