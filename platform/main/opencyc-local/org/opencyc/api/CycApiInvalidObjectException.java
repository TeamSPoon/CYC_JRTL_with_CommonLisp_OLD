package org.opencyc.api;

public class CycApiInvalidObjectException extends CycApiServerSideException
{
    public CycApiInvalidObjectException() {
    }
    
    public CycApiInvalidObjectException(final String s) {
        super(s);
    }
    
    public CycApiInvalidObjectException(final String s, final Throwable cause) {
        super(s, cause);
    }
    
    public CycApiInvalidObjectException(final Throwable cause) {
        super(cause);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 7 ms
	
	Decompiled with Procyon 0.5.32.
*/