package eu.larkc.core.data;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.data.util.SetOfStatementsMerger;
import eu.larkc.core.query.SPARQLQuery;

public class SpeicialSPARQLQueries extends ORDITestCase {

	private final static DataFactory df = DataFactory.INSTANCE;

	@Test
	public void testInMemorySelect() {
		RdfGraph graph = df.createRemoteRdfGraph(new URIImpl(
				RDFProviders.TOPIC_URL));
		SPARQLQuery query = df.createSPARQLQuery("SELECT * WHERE {?s ?p ?o}");
		SPARQLQueryExecutor executor = new SPARQLQueryExecutor();

		VariableBinding result = executor.executeSelect(query, graph);
		CloseableIterator<Binding> iter = result.iterator();
		int count = 0;
		while (iter.hasNext()) {
			count++;
			iter.next();
		}
		assertEquals(count, RDFProviders.TOPIC_COUNT);
	}

	@Test
	public void testRdfDataMerge() {
		Logger log = LoggerFactory.getLogger(SpeicialSPARQLQueries.class);
		RdfGraph graph = df.createRemoteRdfGraph(new URIImpl(
				RDFProviders.TOPIC_URL));
		RdfGraph graph2 = df.createRemoteRdfGraph(new URIImpl(
				"http://dbpedia.org/resource/Knowledge_Engineering"));
		
		SetOfStatementsMerger merge = new SetOfStatementsMerger();
		merge.add(graph);
		merge.add(graph2);
		
		SPARQLQuery query = df.createSPARQLQuery("SELECT * WHERE {?s ?p ?o}");
		SPARQLQueryExecutor executor = new SPARQLQueryExecutor();
		VariableBinding result = executor.executeSelect(query, merge);
		CloseableIterator<Binding> iter = result.iterator();
		
		int count = 0;
		while (iter.hasNext()) {
			count++;
			log.info("" + iter.next());
		}
		assertEquals(count, RDFProviders.TOPIC_COUNT + 1);
	}
}
