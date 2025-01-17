/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.io.toolkit;/** * Provides a class for a {@link Component} instance * dimension on the terminal. * <p/> * Geometrically this describes a rectangle * of width <em>n</em> columns height <em>m</em> rows. * </p> * * @author Dieter Wimberger * @version @version@ (@date@) */public class Dimension {  //Members  private int m_Height;  private int m_Width;  /**   * Constructs an instance with zero width and zero height.   */  public Dimension() {    m_Height = 0;    m_Width = 0;  }//constructor  /**   * Constructs an instance with width and height.   *   * @param width  Integer that represents a width in amount of columns.   * @param height Integer that represents a height in amount of rows.   */  public Dimension(int width, int height) {    m_Height = height;    m_Width = width;  }//constructor  /**   * Accessor method for the width.   *   * @return int that represents the width in number of columns.   */  public int getWidth() {    return m_Width;  }//getWidth  /**   * Mutator method for the width.   *   * @param width Integer that represents a width in numbers of columns.   */  public void setWidth(int width) {    m_Width = width;  }//setWidth  /**   * Accessor method for the height.   *   * @return int that represents the height in number of rows.   */  public int getHeight() {    return m_Height;  }//getHeight  /**   * Mutator method for the height.   *   * @param height Integer that represents a height in numer of rows.   */  public void setHeight(int height) {    m_Height = height;  }//setHeight}//class Dimension