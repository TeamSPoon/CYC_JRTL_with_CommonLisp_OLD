/*
 */
package com.cyc.baseclient.inference.metrics;

import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.metrics.InferenceMetric;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycSymbol;

/**
 * An enumeration of inference metrics that are commonly used.
 *
 * @author baxter
 */
public enum StandardInferenceMetric implements InferenceMetric {

  /** The number of answers found for the inference. * */
  ANSWER_COUNT(":ANSWER-COUNT"),
  /** The amount of time, in seconds, spent hypothesizing before starting the inference proper. * */
  HYPOTHESIZATION_TIME(":HYPOTHESIZATION-TIME"),
  /** The number of links created for this inference. * */
  LINK_COUNT(":LINK-COUNT"),
  /** The number of problems created for this inference. * */
  PROBLEM_COUNT(":PROBLEM-COUNT"),
  /** The number of problems in this inference's problem store. * */
  PROBLEM_STORE_PROBLEM_COUNT(":PROBLEM-STORE-PROBLEM-COUNT"),
  /** The number of proofs in this inference's problem store. * */
  PROBLEM_STORE_PROOF_COUNT(":PROBLEM-STORE-PROOF-COUNT"),
  /** The number of proofs created for this inference. * */
  PROOF_COUNT(":PROOF-COUNT"),
  /** The start times for each SKSI query, in elapsed seconds after the start of the
   * inference proper.
   * */
  SKSI_QUERY_START_TIMES(":SKSI-QUERY-START-TIMES"),
  /** The total time in seconds spent performing SKSI queries. * */
  SKSI_QUERY_TOTAL_TIME(":SKSI-QUERY-TOTAL-TIME"),
  /** The number of tactics created for this inference. * */
  TACTIC_COUNT(":TACTIC-COUNT"),
  /** The average time required to compute each answer. Equivalent to
   * the total time divided by the answer count.
   * */
  TIME_PER_ANSWER(":TIME-PER-ANSWER"),
  /** The number of elapsed seconds before the first answer was found. * */
  TIME_TO_FIRST_ANSWER(":TIME-TO-FIRST-ANSWER"),
  /** The number of elapsed seconds before the last answer was found. * */
  TIME_TO_LAST_ANSWER(":TIME-TO-LAST-ANSWER"),
  /** The number of elapsed seconds used by the inference so far.
   * This does not include time spent preparing the inference, e.g.
   * canonicalization, wff-checking, and setting up any hypothetical context.
   * */
  TOTAL_TIME(":TOTAL-TIME"),
  /** The number of elapsed seconds between when the last answer was found and
   * the end of the inference. Equivalent to total time minus time to last answer.
   * */
  WASTED_TIME_AFTER_LAST_ANSWER(":WASTED-TIME-AFTER-LAST-ANSWER");

  /**
   * Return the standard inference metric with the specified name, if there is one.
   * @param name
   * @return the metric, or null if none.
   */
  public static StandardInferenceMetric fromCycSymbol(CycSymbolI name) {
    for (final StandardInferenceMetric metric : values()) {
      if (name.equals(metric.getName())) {
        return metric;
      }
    }
    return null;
  }
  private final CycSymbol name;

  @Override
  public CycSymbol getName() {
    return name;
  }

  @Override
  public String toString() {
    return name.toCanonicalString();
  }

  private StandardInferenceMetric(String nameString) {
    this.name = CycObjectFactory.makeCycSymbol(nameString);
  }
}
