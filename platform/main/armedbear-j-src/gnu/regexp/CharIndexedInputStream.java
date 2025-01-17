/*
 *  gnu/regexp/CharIndexedReader.java
 *  Copyright (C) 1998-2001 Wes Biggs
 *
 *  This library is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation; either version 2.1 of the License, or
 *  (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package gnu.regexp;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

// TODO: move(x) shouldn't rely on calling next() x times

class CharIndexedInputStream implements CharIndexed {
    private static final int BUFFER_INCREMENT = 1024;
    private static final int UNKNOWN = Integer.MAX_VALUE; // value for end
    
    private BufferedInputStream br;

    // so that we don't try to reset() right away
    private int index = -1;

    private int bufsize = BUFFER_INCREMENT;

    private int end = UNKNOWN;

    private char cached = OUT_OF_BOUNDS;

    // Big enough for a \r\n pair
    // lookBehind[0] = most recent
    // lookBehind[1] = second most recent
    private char[] lookBehind = new char[] { OUT_OF_BOUNDS, OUT_OF_BOUNDS }; 
    
    CharIndexedInputStream(InputStream str, int index) {
	if (str instanceof BufferedInputStream) br = (BufferedInputStream) str;
	else br = new BufferedInputStream(str,BUFFER_INCREMENT);
	next();
	if (index > 0) move(index);
    }
    
    private boolean next() {
	if (end == 1) return false;
	end--; // closer to end

	try {
	    if (index != -1) {
		br.reset();
	    }
	    int i = br.read();
	    br.mark(bufsize);
	    if (i == -1) {
		end = 1;
		cached = OUT_OF_BOUNDS;
		return false;
	    }
	    cached = (char) i;
	    index = 1;
	} catch (IOException e) { 
	    e.printStackTrace();
	    cached = OUT_OF_BOUNDS;
	    return false; 
	}
	return true;
    }
    
    @Override
	public char charAt(int index) {
	if (index == 0) {
	    return cached;
	} else if (index >= end) {
	    return OUT_OF_BOUNDS;
	} else if (index == -1) {
	    return lookBehind[0];
	} else if (index == -2) {
	    return lookBehind[1];
	} else if (index < -2) {
	    return OUT_OF_BOUNDS;
	} else if (index >= bufsize) {
	    // Allocate more space in the buffer.
	    try {
		while (bufsize <= index) bufsize += BUFFER_INCREMENT;
		br.reset();
		br.mark(bufsize);
		br.skip(index-1);
	    } catch (IOException e) { }
	} else if (this.index != index) {
	    try {
		br.reset();
		br.skip(index-1);
	    } catch (IOException e) { }
	}
	char ch = OUT_OF_BOUNDS;
	
	try {
	    int i = br.read();
	    this.index = index+1; // this.index is index of next pos relative to charAt(0)
	    if (i == -1) {
		// set flag that next should fail next time?
		end = index;
		return ch;
	    }
	    ch = (char) i;
	} catch (IOException ie) { }
	
	return ch;
    }
    
    @Override
	public boolean move(int index) {
	// move read position [index] clicks from 'charAt(0)'
	boolean retval = true;
	while (retval && (index-- > 0)) retval = next();
	return retval;
    }
    
    @Override
	public boolean isValid() {
	return (cached != OUT_OF_BOUNDS);
    }
}

