/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.core.query;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;

/**
 * GraphResultBase is an abstract class to implement asynchronous streaming of
 * RDF statements. All implementing classes must: 1. Put the next statements
 * from the stream with results.put(X) 2. For the final statement to put
 * results.put(new FinalStatement())
 * 
 * @author vassil
 * 
 */
public abstract class GraphResultBase implements SetOfStatements {

	protected transient boolean isClosed = false;
	protected transient BlockingQueue<Statement> results;
	protected transient CloseableIterator<Statement> iterator;
	private final static long serialVersionUID = 1L;

	public GraphResultBase() {
		this.results = new ArrayBlockingQueue<Statement>(1024);
	}

	public synchronized void close() {
		isClosed = true;
	}

	@Override
	public synchronized CloseableIterator<Statement> getStatements() {
		if (iterator == null) {
			iterator = new BlockingQueueIterator();
		}
		return iterator;
	}

	/**
	 * Helper class to iterate the blocking queue used to simulate asynchrnous
	 * streaming of RDF statements.
	 * 
	 * @author vassil
	 * 
	 */
	public class BlockingQueueIterator implements CloseableIterator<Statement> {

		private Statement next;

		@Override
		public synchronized boolean hasNext() {
			while (next == null) {
				try {
					next = results.take();
				} catch (InterruptedException ie) {
				}
			}
			if (next instanceof FinalStatement) {
				return false;
			}
			return true;
		}

		@Override
		public synchronized Statement next() {
			if (hasNext() == false) {
				throw new NoSuchElementException();
			}
			Statement result = next;
			next = null;
			return result;
		}

		@Override
		public void remove() {
		}

		@Override
		public synchronized void close() {
			isClosed = true;
		}

		@Override
		public synchronized boolean isClosed() {
			return isClosed;
		}
	}

	/**
	 * Helper class to denote the end of streamed statements.
	 * 
	 * @author vassil
	 * 
	 */
	public class FinalStatement implements Statement {

		private static final long serialVersionUID = 1L;

		@Override
		public Resource getSubject() {
			throw new UnsupportedOperationException();
		}

		@Override
		public URI getPredicate() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Value getObject() {
			throw new UnsupportedOperationException();
		}

		@Override
		public Resource getContext() {
			throw new UnsupportedOperationException();
		}
	}
}
