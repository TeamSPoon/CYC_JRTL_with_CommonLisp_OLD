/*
 * MouseAdapter.java
 *
 * Copyright (C) 2003 Peter Graves
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

package org.armedbear.lisp.java.swing;

import java.awt.Component;
import java.awt.event.MouseEvent;

import org.armedbear.lisp.JHandler;

public class MouseAdapter extends java.awt.event.MouseAdapter 
{
    public static synchronized void addTo(Component component) {
        component.addMouseListener(new MouseAdapter());
    }

    private void call(String s, MouseEvent mouseevent) {
        int ai[] = {
            mouseevent.getModifiers(), 
	    mouseevent.isPopupTrigger() ? 1 : 0, 
	    mouseevent.getClickCount(), 
	    mouseevent.getX(), 
	    mouseevent.getY()
        };
        JHandler.callLisp(s, mouseevent.getComponent(), mouseevent.paramString(), ai);
    }

    @Override
	public void mouseClicked(MouseEvent mouseevent) {
        call("MOUSECLICKED", mouseevent);
    }

    @Override
	public void mousePressed(MouseEvent mouseevent) {
        call("MOUSEPRESSED", mouseevent);
    }

    @Override
	public void mouseReleased(MouseEvent mouseevent) {
        call("MOUSERELEASED", mouseevent);
    }

    @Override
	public void mouseEntered(MouseEvent mouseevent) {
        call("MOUSEENTERED", mouseevent);
    }

    @Override
	public void mouseExited(MouseEvent mouseevent) {
        call("MOUSEEXITED", mouseevent);
    }
}
