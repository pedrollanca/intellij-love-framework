package com.pedrollanca.intellijloveframework;

import java.util.List;

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
    public static final String DATA_KEY = "data";
    public static final String EVENT_KEY = "event";
    public static final String FILESYSTEM_KEY = "filesystem";
    public static final String FONT_KEY = "font";
    public static final String GRAPHICS_KEY = "graphics";
    public static final String IMAGE_KEY = "image";
    public static final String JOYSTICK_KEY = "joystick";
    public static final String KEYBOARD_KEY = "keyboard";
    public static final String MATH_KEY = "math";
    public static final String MOUSE_KEY = "mouse";
    public static final String PHYSICS_KEY = "physics";
    public static final String SOUND_KEY = "sound";
    public static final String SYSTEM_KEY = "system";
    public static final String THREAD_KEY = "thread";
    public static final String TIMER_KEY = "timer";
    public static final String TOUCH_KEY = "touch";
    public static final String VIDEO_KEY = "video";
    public static final String WINDOW_KEY = "window";

    // ------------------------------
    // List of All Module Keys
    // ------------------------------
    /**
     * A list containing all module key constants.
     * This facilitates operations that need to iterate over all modules.
     */
    public static final List<String> MODULE_KEYS = List.of(AUDIO_KEY, DATA_KEY, EVENT_KEY, FILESYSTEM_KEY, FONT_KEY, GRAPHICS_KEY, IMAGE_KEY, JOYSTICK_KEY, KEYBOARD_KEY, MATH_KEY, MOUSE_KEY, PHYSICS_KEY, SOUND_KEY, SYSTEM_KEY, THREAD_KEY, TIMER_KEY, TOUCH_KEY, VIDEO_KEY, WINDOW_KEY);
}