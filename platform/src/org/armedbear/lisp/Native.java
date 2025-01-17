/*
 * Native.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: Native.java,v 1.1 2005/02/14 18:59:01 piso Exp $
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

public class Native
{
    public static native void installControlCHandler();

    public static native long getCurrentThreadUserTime();
    public static native long getCurrentThreadSystemTime();

    public static void callback()
    {
        Lisp.setInterrupted(true);
    }

    public static void initialize()
    {
        Runnable r = new Runnable() {
            @Override
			public void run()
            {
                installControlCHandler(); // Never returns.
            }
        };
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}
