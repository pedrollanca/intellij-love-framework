/*
 * MIT License
 *
 * Copyright (c) 2024 - Pedro Chamorro Llanca
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.pedrollanca.loveframeworksupport;

import java.util.List;

/**
 * A utility class that holds constants for type texts and map keys used in LookupElements.
 */
public final class LoveTypes {

    /**
     * Represents the type text for callbacks.
     */
    public static final String CALLBACK = "Callback";

    /**
     * Represents the type text for modules.
     */
    public static final String MODULE = "Module";

    /**
     * Represents the type text for functions.
     */
    public static final String FUNCTION = "Function";

    /**
     * Key constant for callbacks.
     */
    public static final String CALLBACKS_KEY = "callbacks";

    /**
     * Key constant for modules.
     */
    public static final String MODULES_KEY = "modules";

    /**
     * Key constant for audio.
     */
    public static final String AUDIO_KEY = "audio";

    /**
     * Key constant for data.
     */
    public static final String DATA_KEY = "data";

    /**
     * Key constant for event.
     */
    public static final String EVENT_KEY = "event";

    /**
     * Key constant for filesystem.
     */
    public static final String FILESYSTEM_KEY = "filesystem";

    /**
     * Key constant for font.
     */
    public static final String FONT_KEY = "font";

    /**
     * Key constant for graphics.
     */
    public static final String GRAPHICS_KEY = "graphics";

    /**
     * Key constant for image.
     */
    public static final String IMAGE_KEY = "image";

    /**
     * Key constant for joystick.
     */
    public static final String JOYSTICK_KEY = "joystick";

    /**
     * Key constant for keyboard.
     */
    public static final String KEYBOARD_KEY = "keyboard";

    /**
     * Key constant for math.
     */
    public static final String MATH_KEY = "math";

    /**
     * Key constant for mouse.
     */
    public static final String MOUSE_KEY = "mouse";

    /**
     * Key constant for physics.
     */
    public static final String PHYSICS_KEY = "physics";

    /**
     * Key constant for sound.
     */
    public static final String SOUND_KEY = "sound";

    /**
     * Key constant for system.
     */
    public static final String SYSTEM_KEY = "system";

    /**
     * Key constant for thread.
     */
    public static final String THREAD_KEY = "thread";

    /**
     * Key constant for timer.
     */
    public static final String TIMER_KEY = "timer";

    /**
     * Key constant for touch.
     */
    public static final String TOUCH_KEY = "touch";

    /**
     * Key constant for video.
     */
    public static final String VIDEO_KEY = "video";

    /**
     * Key constant for window.
     */
    public static final String WINDOW_KEY = "window";

    /**
     * A list containing all module key constants.
     * This facilitates operations that need to iterate over all modules.
     */
    public static final List<String> MODULE_KEYS = List.of(
            AUDIO_KEY,
            DATA_KEY,
            EVENT_KEY,
            FILESYSTEM_KEY,
            FONT_KEY,
            GRAPHICS_KEY,
            IMAGE_KEY,
            JOYSTICK_KEY,
            KEYBOARD_KEY,
            MATH_KEY,
            MOUSE_KEY,
            PHYSICS_KEY,
            SOUND_KEY,
            SYSTEM_KEY,
            THREAD_KEY,
            TIMER_KEY,
            TOUCH_KEY,
            VIDEO_KEY,
            WINDOW_KEY
    );

    /**
     * Prevents instantiation of the LoveTypes utility class.
     *
     * @throws UnsupportedOperationException always thrown to prevent instantiation
     */
    private LoveTypes() {
        throw new UnsupportedOperationException("LoveTypes is a utility class and cannot be instantiated.");
    }
}