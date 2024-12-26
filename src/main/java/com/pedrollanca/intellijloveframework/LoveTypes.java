package com.pedrollanca.intellijloveframework;

/**
 * A utility class that holds constants for type texts and map keys used in LookupElements.
 */
public final class LoveTypes {

    // Prevent instantiation
    private LoveTypes() {
        throw new UnsupportedOperationException("LoveTypes is a utility class and cannot be instantiated.");
    }

    // ------------------------------
    // Type text constants
    // ------------------------------
    public static final String CALLBACK = "Callback";
    public static final String MODULE = "Module";
    public static final String FUNCTION = "Function";

    // ------------------------------
    // Map key constants
    // ------------------------------
    public static final String CALLBACKS_KEY = "callbacks";
    public static final String MODULES_KEY = "modules";
    public static final String AUDIO_KEY = "audio";

}