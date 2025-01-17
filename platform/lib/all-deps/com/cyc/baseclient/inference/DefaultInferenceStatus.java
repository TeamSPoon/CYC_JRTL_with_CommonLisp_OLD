package com.cyc.baseclient.inference;

//// Internal Imports
import com.cyc.base.inference.InferenceStatus;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.base.cycobject.CycSymbolI;

//// External Imports
import java.util.*;

/**
 * <P>DefaultInferenceStatus is designed to...

 <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal, tbrussea
 * @date July 27, 2005, 12:23 PM
 * @version $Id: DefaultInferenceStatus.java 150734 2014-04-24 22:32:49Z nwinant $
 */
public final class DefaultInferenceStatus extends CycSymbol implements InferenceStatus {

    private final boolean indicatesDone;

    private DefaultInferenceStatus(String name) {
        this(name, false);
    }

    private DefaultInferenceStatus(String name, boolean indicatesDone) {
        super(name);
        this.indicatesDone = indicatesDone;
    }

    public static DefaultInferenceStatus findInferenceStatus(CycSymbolI symbol) {
        return (DefaultInferenceStatus) inferenceStatuses.get(symbol);
    }

    /**
     * Does this status indicate that the inference is done? It may be
     * continuable, but no further work will be performed on it until
     * instructed.
     *
     * @return true iff this status indicates that the inference is done.
     */
  @Override
    public boolean indicatesDone() {
        return this.indicatesDone;
    }
    // should probably try to gracefully find a way to get these from the KB. (*inference-statuses*)
    public final static DefaultInferenceStatus NOT_STARTED = new DefaultInferenceStatus(":NOT-STARTED");
    public final static DefaultInferenceStatus STARTED = new DefaultInferenceStatus(":STARTED");
    public final static DefaultInferenceStatus NEW = new DefaultInferenceStatus(":NEW");
    public final static DefaultInferenceStatus PREPARED = new DefaultInferenceStatus(":PREPARED");
    public final static DefaultInferenceStatus READY = new DefaultInferenceStatus(":READY");
    public final static DefaultInferenceStatus RUNNING = new DefaultInferenceStatus(":RUNNING");
    public final static DefaultInferenceStatus SUSPENDED = new DefaultInferenceStatus(":SUSPENDED", true);
    public final static DefaultInferenceStatus DEAD = new DefaultInferenceStatus(":DEAD", true);
    public final static DefaultInferenceStatus TAUTOLOGY = new DefaultInferenceStatus(":TAUTOLOGY", true);
    public final static DefaultInferenceStatus CONTRADICTION = new DefaultInferenceStatus(":CONTRADICTION", true);
    public final static DefaultInferenceStatus ILL_FORMED = new DefaultInferenceStatus(":ILL-FORMED", true);
    public final static DefaultInferenceStatus FORMATTING = new DefaultInferenceStatus(":FORMATTING");
    private static HashMap inferenceStatuses = new HashMap();

    static {
        inferenceStatuses.put(NOT_STARTED, NOT_STARTED);
        inferenceStatuses.put(STARTED, STARTED);
        inferenceStatuses.put(NEW, NEW);
        inferenceStatuses.put(PREPARED, PREPARED);
        inferenceStatuses.put(READY, READY);
        inferenceStatuses.put(RUNNING, RUNNING);
        inferenceStatuses.put(SUSPENDED, SUSPENDED);
        inferenceStatuses.put(DEAD, DEAD);
        inferenceStatuses.put(TAUTOLOGY, TAUTOLOGY);
        inferenceStatuses.put(CONTRADICTION, CONTRADICTION);
        inferenceStatuses.put(ILL_FORMED, ILL_FORMED);
        inferenceStatuses.put(FORMATTING, FORMATTING);
    }
}
