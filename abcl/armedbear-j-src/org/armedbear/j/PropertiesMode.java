/*  
 * PropertiesMode.java
 *
 * Copyright (C) 2000-2002 Peter Graves
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

import java.awt.event.KeyEvent;

public final class PropertiesMode extends AbstractMode implements Constants, Mode
{
    private static final PropertiesMode mode = new PropertiesMode();

    private PropertiesMode()
    {
        super(PROPERTIES_MODE, PROPERTIES_MODE_NAME);
    }

    public static final PropertiesMode getMode()
    {
        return mode;
    }

    @Override
	public final Formatter getFormatter(Buffer buffer)
    {
        return new PropertiesFormatter(buffer);
    }

    @Override
	protected void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_F12, 0, "wrapComment");
        // Duplicate mapping to support IBM 1.3 for Linux.
        km.mapKey(0xffc9, 0, "wrapComment"); // F12
    }
}
