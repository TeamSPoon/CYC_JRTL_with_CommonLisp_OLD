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
package eu.larkc.core.pluginManager.local;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.reason.Reasoner;

/**
 * LocalReasonManager is a LocalPluginManager for Reasoner plugins
 * 
 * It will generate an InformationSet on the output queue for each SetOfStatements that comes in 
 * on the input stream
 * 
 * @author Mick Kerrigan, Barry Bishop
 */
public class LocalReasonManager extends LocalPluginManager <SetOfStatements, InformationSet> {
	
	/**
	 * The Reasoner plugin to be managed
	 */
	private final Reasoner mReasoner;
	
	/**
	 * The Query to executed over each of the input SetOfStatements
	 */
	private final Query mQuery;

	/**
	 * Constructor thats takes the plugin to be manages, the input, and the output queues as input
	 * 
	 * @param reasoner The Reasoner plugin to be managed
	 * @param query The Query to executed over each of the input SetOfStatements
	 * @param inputQueue The queue from which input messages will come from the previous plugin in the pipeline 
	 * @param outputQueue The queue onto which output messages should be put to send them to the next plugin in the pipeline 
	 */
	public LocalReasonManager(Reasoner reasoner, Query query, Queue<SetOfStatements> inputQueue, Queue<InformationSet> outputQueue) {
		super(inputQueue, outputQueue);
		mReasoner = reasoner;
		mQuery = query;
		super.setThread(new ReasonThread());
	}

	/**
	 * The Thread within which the Reasoner Management occurs
	 * 
	 * @author Mick Kerrigan, Barry Bishop
	 */
	class ReasonThread extends Thread {
		ReasonThread() {
			super("Reason");
		}

		@Override
		public void run() {
			mReasoner.initialise();
			Context context = mReasoner.createContext();
			for (;;) {
				PluginManager.Message controlMessage = getNextControlMessage();

				if (controlMessage.equals(PluginManager.Message.NEXT)) {
					alertPrevious();

					SetOfStatements statements = getNextInput();

					if (statements == null) {
						putNextOutput(null);
						break;
					}

					SPARQLQuery sparqlQuery = (SPARQLQuery) mQuery;

					InformationSet result = null;
					if (sparqlQuery.isSelect()) {
						result = mReasoner.sparqlSelect(sparqlQuery, statements, new SimpleContract(), context);
					} 
					else if (sparqlQuery.isConstruct()) {
						result = mReasoner.sparqlConstruct(sparqlQuery, statements, new SimpleContract(), context);
					} 
					else if (sparqlQuery.isDescribe()) {
						result = mReasoner.sparqlDescribe(sparqlQuery, statements, new SimpleContract(), context);
					} 
					else if (sparqlQuery.isAsk()) {
						result = mReasoner.sparqlAsk(sparqlQuery, statements, new SimpleContract(), context);
					}

					putNextOutput(result);
				} 
				else if (controlMessage.equals(PluginManager.Message.STOP)) {
					break;
				}
			}
			stopPrevious();
			mReasoner.shutdown();
		}
	}
}
