package org.opencyc.cycobject;

public interface CycSentence extends CycObject
{
    boolean isConditionalSentence();
    
    boolean isConjunction();
    
    boolean isLogicalConnectorSentence();
    
    boolean isExistential();
    
    boolean isUniversal();
    
    boolean isNegated();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 3 ms
	
	Decompiled with Procyon 0.5.32.
*/