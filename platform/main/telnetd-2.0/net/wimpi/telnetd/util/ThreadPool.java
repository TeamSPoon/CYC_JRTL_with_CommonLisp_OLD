/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
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
package net.wimpi.telnetd.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing a simple thread pool.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public class ThreadPool {

  //instance attributes and associations
  private LinkedQueue m_TaskPool;
  private int m_Size = 1;
  private boolean m_Active = false;
  private List m_Threads;

  /**
   * Constructs a new <tt>ThreadPool</tt> instance.
   *
   * @param size the size of the thread pool.
   */
  public ThreadPool(int size) {
    m_Size = size;
    m_TaskPool = new LinkedQueue();
    m_Threads = new ArrayList(size);
  }//constructor

  /**
   * Execute the <tt>Runnable</tt> instance
   * through a thread in this <tt>ThreadPool</tt>.
   *
   * @param task the <tt>Runnable</tt> to be executed.
   */
  public void execute(Runnable task) {
    if (!m_Active) {
      throw new IllegalStateException("pool.inactive");
    }
    try {
      m_TaskPool.put(task);
    } catch (InterruptedException ex) {
      //FIXME: Handle!?
    }
  }//execute

  /**
   * Initializes the pool, populating it with
   * n started threads.
   */
  public void activate() {
    m_Active = true;
    for (int i = m_Size; i > 0; i--) {
      final PoolThread pt = new PoolThread();
      m_Threads.add(pt);
      pt.start();
    }
  }//activate

  public void deactivate() {
    //System.err.println("Deactivate");
    //1. Flag and block queue
    m_Active = false;
    for (int i = 0; i < m_Size; i++) {
      try {
        m_TaskPool.put(new Runnable() {
          public void run() {
          }
        });
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    //m_Threads.clear();
    //m_Threads = null;
  }//deactivate

  /**
   * Inner class implementing a thread that can be
   * run in a <tt>ThreadPool</tt>.
   *
   * @author Dieter Wimberger
   * @version @version@ (@date@)
   */
  private class PoolThread extends Thread {

    /**
     * Runs the <tt>PoolThread</tt>.
     * <p/>
     * This method will infinitely loop, picking
     * up available tasks from the <tt>LinkedQueue</tt>.
     */
    public void run() {
      //System.out.println("Running PoolThread");
      do {
        try {
          ((Runnable) m_TaskPool.take()).run();
        } catch (Exception ex) {
          //FIXME: Handle somehow!?
          ex.printStackTrace();
        }
      } while (m_Active);
      m_Threads.remove(this);
      //System.err.println("Removed me " + this.toString());
    }
  }//PoolThread

}//class ThreadPool