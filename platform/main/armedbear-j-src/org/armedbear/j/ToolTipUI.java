/*
 * ToolTipUI.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ToolTipUI.java,v 1.1 2003/07/27 00:03:08 piso Exp $
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

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

public final class ToolTipUI extends BasicToolTipUI
{
    private static final ToolTipUI sharedInstance = new ToolTipUI();

    public static ComponentUI createUI(JComponent c)
    {
        return sharedInstance;
    }

    @Override
	public void paint(Graphics g, JComponent c)
    {
        Display.setRenderingHints(g);
        super.paint(g, c);
    }
}
