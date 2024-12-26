package com.pedrollanca.intellijloveframework;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class LoveElements {

    // -------------------------------------------------------------------
    // 1) Helper Method
    // -------------------------------------------------------------------
    /**
     * Helper to create a LookupElement with consistent style:
     *  - Bold text
     *  - Uses the LoveIcons.LOVE_ICON
     *  - Sets the given type text (e.g., "Callback", "Module", "Function")
     *
     * @param name      The display text of the completion item.
     * @param typeText  The type text (from LoveTypes) displayed alongside the item.
     * @return A styled LookupElement.
     */
    private static LookupElement createElement(String name, String typeText) {
        return LookupElementBuilder.create(name)
                .bold()
                .withTypeText(typeText)
                .withIcon(LoveIcons.LOVE_ICON);
    }

    // -------------------------------------------------------------------
    // 2) Callbacks (load, update, draw)
    // -------------------------------------------------------------------
    private static final LookupElement LOVE_LOAD_CALLBACK =
            createElement("load", LoveTypes.CALLBACK);

    private static final LookupElement LOVE_UPDATE_CALLBACK =
            createElement("update", LoveTypes.CALLBACK);

    private static final LookupElement LOVE_DRAW_CALLBACK =
            createElement("draw", LoveTypes.CALLBACK);

    /**
     * A List containing all callbacks (load, update, draw).
     */
    private static final List<LookupElement> LOVE_CALLBACKS = Arrays.asList(
            LOVE_LOAD_CALLBACK,
            LOVE_UPDATE_CALLBACK,
            LOVE_DRAW_CALLBACK
    );

    // -------------------------------------------------------------------
    // 3) Modules (no "love." prefix, all marked as "Module")
    // -------------------------------------------------------------------
    private static final LookupElement LOVE_AUDIO_MODULE =
            createElement("audio", LoveTypes.MODULE);

    private static final LookupElement LOVE_DATA_MODULE =
            createElement("data", LoveTypes.MODULE);

    private static final LookupElement LOVE_EVENT_MODULE =
            createElement("event", LoveTypes.MODULE);

    private static final LookupElement LOVE_FILESYSTEM_MODULE =
            createElement("filesystem", LoveTypes.MODULE);

    private static final LookupElement LOVE_FONT_MODULE =
            createElement("font", LoveTypes.MODULE);

    private static final LookupElement LOVE_GRAPHICS_MODULE =
            createElement("graphics", LoveTypes.MODULE);

    private static final LookupElement LOVE_IMAGE_MODULE =
            createElement("image", LoveTypes.MODULE);

    private static final LookupElement LOVE_JOYSTICK_MODULE =
            createElement("joystick", LoveTypes.MODULE);

    private static final LookupElement LOVE_KEYBOARD_MODULE =
            createElement("keyboard", LoveTypes.MODULE);

    private static final LookupElement LOVE_MATH_MODULE =
            createElement("math", LoveTypes.MODULE);

    private static final LookupElement LOVE_MOUSE_MODULE =
            createElement("mouse", LoveTypes.MODULE);

    private static final LookupElement LOVE_PHYSICS_MODULE =
            createElement("physics", LoveTypes.MODULE);

    private static final LookupElement LOVE_SOUND_MODULE =
            createElement("sound", LoveTypes.MODULE);

    private static final LookupElement LOVE_SYSTEM_MODULE =
            createElement("system", LoveTypes.MODULE);

    private static final LookupElement LOVE_THREAD_MODULE =
            createElement("thread", LoveTypes.MODULE);

    private static final LookupElement LOVE_TIMER_MODULE =
            createElement("timer", LoveTypes.MODULE);

    private static final LookupElement LOVE_TOUCH_MODULE =
            createElement("touch", LoveTypes.MODULE);

    private static final LookupElement LOVE_VIDEO_MODULE =
            createElement("video", LoveTypes.MODULE);

    private static final LookupElement LOVE_WINDOW_MODULE =
            createElement("window", LoveTypes.MODULE);

    /**
     * A List containing all module names.
     */
    private static final List<LookupElement> LOVE_MODULES = Arrays.asList(
            LOVE_AUDIO_MODULE,
            LOVE_DATA_MODULE,
            LOVE_EVENT_MODULE,
            LOVE_FILESYSTEM_MODULE,
            LOVE_FONT_MODULE,
            LOVE_GRAPHICS_MODULE,
            LOVE_IMAGE_MODULE,
            LOVE_JOYSTICK_MODULE,
            LOVE_KEYBOARD_MODULE,
            LOVE_MATH_MODULE,
            LOVE_MOUSE_MODULE,
            LOVE_PHYSICS_MODULE,
            LOVE_SOUND_MODULE,
            LOVE_SYSTEM_MODULE,
            LOVE_THREAD_MODULE,
            LOVE_TIMER_MODULE,
            LOVE_TOUCH_MODULE,
            LOVE_VIDEO_MODULE,
            LOVE_WINDOW_MODULE
    );

    // -------------------------------------------------------------------
    // 4) Audio Functions (no "love.audio." prefix, marked as "Function")
    // -------------------------------------------------------------------
    private static final LookupElement AUDIO_GET_ACTIVE_EFFECTS =
            createElement("getActiveEffects", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_ACTIVE_SOURCE_COUNT =
            createElement("getActiveSourceCount", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_DISTANCE_MODEL =
            createElement("getDistanceModel", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_DOPPLER_SCALE =
            createElement("getDopplerScale", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_EFFECT =
            createElement("getEffect", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_MAX_SCENE_EFFECTS =
            createElement("getMaxSceneEffects", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_MAX_SOURCE_EFFECTS =
            createElement("getMaxSourceEffects", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_NUM_SOURCES =
            createElement("getNumSources", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_ORIENTATION =
            createElement("getOrientation", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_RECORDING_DEVICES =
            createElement("getRecordingDevices", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_SOURCE_COUNT =
            createElement("getSourceCount", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_VELOCITY =
            createElement("getVelocity", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_GET_VOLUME =
            createElement("getVolume", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_IS_EFFECTS_SUPPORTED =
            createElement("isEffectsSupported", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_NEW_QUEUEABLE_SOURCE =
            createElement("newQueueableSource", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_NEW_SOURCE =
            createElement("newSource", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_PAUSE =
            createElement("pause", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_PLAY =
            createElement("play", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_RESUME =
            createElement("resume", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_REWIND =
            createElement("rewind", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_DISTANCE_MODEL =
            createElement("setDistanceModel", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_DOPPLER_SCALE =
            createElement("setDopplerScale", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_EFFECT =
            createElement("setEffect", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_MIX_WITH_SYSTEM =
            createElement("setMixWithSystem", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_ORIENTATION =
            createElement("setOrientation", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_POSITION =
            createElement("setPosition", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_VELOCITY =
            createElement("setVelocity", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_SET_VOLUME =
            createElement("setVolume", LoveTypes.FUNCTION);

    private static final LookupElement AUDIO_STOP =
            createElement("stop", LoveTypes.FUNCTION);

    /**
     * A List containing all audio-specific functions.
     */
    private static final List<LookupElement> LOVE_AUDIO_FUNCTIONS = Arrays.asList(
            AUDIO_GET_ACTIVE_EFFECTS,
            AUDIO_GET_ACTIVE_SOURCE_COUNT,
            AUDIO_GET_DISTANCE_MODEL,
            AUDIO_GET_DOPPLER_SCALE,
            AUDIO_GET_EFFECT,
            AUDIO_GET_MAX_SCENE_EFFECTS,
            AUDIO_GET_MAX_SOURCE_EFFECTS,
            AUDIO_GET_NUM_SOURCES,
            AUDIO_GET_ORIENTATION,
            AUDIO_GET_POSITION,
            AUDIO_GET_RECORDING_DEVICES,
            AUDIO_GET_SOURCE_COUNT,
            AUDIO_GET_VELOCITY,
            AUDIO_GET_VOLUME,
            AUDIO_IS_EFFECTS_SUPPORTED,
            AUDIO_NEW_QUEUEABLE_SOURCE,
            AUDIO_NEW_SOURCE,
            AUDIO_PAUSE,
            AUDIO_PLAY,
            AUDIO_RESUME,
            AUDIO_REWIND,
            AUDIO_SET_DISTANCE_MODEL,
            AUDIO_SET_DOPPLER_SCALE,
            AUDIO_SET_EFFECT,
            AUDIO_SET_MIX_WITH_SYSTEM,
            AUDIO_SET_ORIENTATION,
            AUDIO_SET_POSITION,
            AUDIO_SET_VELOCITY,
            AUDIO_SET_VOLUME,
            AUDIO_STOP
    );

    // -------------------------------------------------------------------
    // 5) Central Map to Retrieve Items by Key (or everything at once)
    // -------------------------------------------------------------------
    /**
     * A Map that stores all LookupElement lists categorized by their keys.
     * Keys include:
     *   - "callbacks" -> LOVE_CALLBACKS
     *   - "modules"   -> LOVE_MODULES
     *   - "audio"     -> LOVE_AUDIO_FUNCTIONS
     *   - ... (add more as needed)
     */
    public static final Map<String, List<LookupElement>> LOVE_LOOKUP_MAP;

    static {
        Map<String, List<LookupElement>> map = new HashMap<>();

        // Put callbacks under the "callbacks" key
        map.put(LoveTypes.CALLBACKS_KEY, LOVE_CALLBACKS);

        // Put all module names under the "modules" key
        map.put(LoveTypes.MODULES_KEY, LOVE_MODULES);

        // Put audio functions under the "audio" key
        map.put(LoveTypes.AUDIO_KEY, LOVE_AUDIO_FUNCTIONS);

        // If you have more modules (data, event, etc.), add them similarly:
        // map.put(LoveTypes.DATA_KEY, LOVE_DATA_FUNCTIONS);
        // map.put(LoveTypes.EVENT_KEY, LOVE_EVENT_FUNCTIONS);
        // ...

        // Make the map unmodifiable to prevent runtime modifications
        LOVE_LOOKUP_MAP = Collections.unmodifiableMap(map);
    }

    // -------------------------------------------------------------------
    // 6) Convenience Methods
    // -------------------------------------------------------------------

    /**
     * Returns a list of all LookupElements across every entry in the map.
     * This includes callbacks, modules, audio functions, etc.
     *
     * @return A combined list of all LookupElements.
     */
    public static List<LookupElement> getAllElements() {
        return LOVE_LOOKUP_MAP.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    /**
     * Returns the LookupElements associated with a specific key,
     * or an empty list if that key doesn't exist.
     *
     * <p>Example keys:
     * <ul>
     *   <li>"callbacks" → load, update, draw</li>
     *   <li>"modules"   → audio, data, event, etc.</li>
     *   <li>"audio"     → getActiveEffects, etc.</li>
     * </ul>
     *
     * @param key The category or module name to retrieve LookupElements for.
     * @return A list of LookupElements associated with the key, or empty list if none found.
     */
    public static List<LookupElement> getElementsFor(String key) {
        return LOVE_LOOKUP_MAP.getOrDefault(key, Collections.emptyList());
    }
}