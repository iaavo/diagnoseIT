package org.diagnoseit.rules;

/**
 * @author Alexander Wert
 *
 */
public interface RuleConstants {
	// Session variable names
	String VAR_BASELINE = "baseline";

	// Tags
	String TAG_GLOBAL_CONTEXT = "GLOBAL_CONTEXT_TAG";
	String TAG_TIME_WASTING_OPERATIONS = "TIME_WASTING_OPERATIONS_TAG";
	String TAG_PROBLEM_CONTEXT = "PROBLEM_CONTEXT_TAG";
	String TAG_PROBLEM_CAUSE = "PROBLEM_CAUSE_TAG";
	String TAG_CAUSE_STRUCTURE = "CAUSE_STRUCTURE_TAG";
	String TAG_SUBTRACE = "SUBTRACE_TAG";

	// Timeseries Tags
	String TAG_RAMP = "RAMP_TAG";
	String TAG_THE_RAMP = "THE_RAMP_TAG";
	String TAG_APPLICATION_HICCUPS = "APPLICATION_HICCUPS_TAG";
	String TAG_APP_HICCUPS = "APP_HICCUPS_TAG";
	String TAG_GARBAGE_COLLECTION_HICCUPS = "GARBAGE_COLLECTION_HICCUPS_TAG";
	String TAG_G_C_HICCUPS = "G_C_HICCUPS_TAG";
	String TAG_TRIGGER_TIMESERIES_RULES = "TRIGGER_TIMESERIES_RULES_TAG";
	String TAG_MORE_IS_LESS = "MORE_IS_LESS_TAG";
	String TAG_TRAFFIC_JAM = "TRAFFIC_JAM_TAG";

	// Anti-pattern Tags
	String TAG_N_PLUS_ONE = "N_PLUS_ONE_TAG";
	String TAG_THE_STIFLE = "THE_STIFLE_TAG";
	String TAG_PHANTOM_LOGGING = "PHANTOM_LOGGING_TAG";
	String TAG_EXPENSIVE_COMPUTATION = "EXPENSIVE_COMPUTATION_TAG";
	String TAG_EXCESSIVE_LOGGING = "EXCESSIVE_LOGGING_TAG";
	
	// Mobile Anti-patterns Tags
	String TAG_REMOTE_INVOCATION = "REMOTE_INVOCATION_TAG";
}
