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

import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A utility class that holds constants for type texts and map keys used in LookupElements.
 */
public class LoveElements {

    /**
     * A Map that stores all LookupElement lists categorized by their keys.
     * Keys include:
     * - "callbacks" -> LOVE_CALLBACKS
     * - "modules"   -> LOVE_MODULES
     * - "audio"     -> LOVE_AUDIO_FUNCTIONS
     * - "data"      -> LOVE_DATA_FUNCTIONS
     * - "event"     -> LOVE_EVENT_FUNCTIONS
     * - "filesystem"-> LOVE_FILESYSTEM_FUNCTIONS
     * - "font"      -> LOVE_FONT_FUNCTIONS
     * - "graphics"  -> LOVE_GRAPHICS_FUNCTIONS
     * - "image"     -> LOVE_IMAGE_FUNCTIONS
     * - ... (add more as needed)
     */
    public static final Map<String, List<LookupElement>> LOVE_LOOKUP_MAP;

    // Callbacks
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

    // Modules
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

    // Audio Functions
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

    // Data Functions
    private static final LookupElement DATA_COMPRESS =
            createElement("compress", LoveTypes.FUNCTION);

    private static final LookupElement DATA_DECODE =
            createElement("decode", LoveTypes.FUNCTION);

    private static final LookupElement DATA_DECOMPRESS =
            createElement("decompress", LoveTypes.FUNCTION);

    private static final LookupElement DATA_ENCODE =
            createElement("encode", LoveTypes.FUNCTION);

    private static final LookupElement DATA_GET_PACKED_SIZE =
            createElement("getPackedSize", LoveTypes.FUNCTION);

    private static final LookupElement DATA_HASH =
            createElement("hash", LoveTypes.FUNCTION);

    private static final LookupElement DATA_NEW_BYTE_DATA =
            createElement("newByteData", LoveTypes.FUNCTION);

    private static final LookupElement DATA_NEW_DATA_VIEW =
            createElement("newDataView", LoveTypes.FUNCTION);

    private static final LookupElement DATA_PACK =
            createElement("pack", LoveTypes.FUNCTION);

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

    // Event Functions
    private static final LookupElement EVENT_CLEAR =
            createElement("clear", LoveTypes.FUNCTION);

    private static final LookupElement EVENT_POLL =
            createElement("poll", LoveTypes.FUNCTION);

    private static final LookupElement EVENT_PUMP =
            createElement("pump", LoveTypes.FUNCTION);

    private static final LookupElement EVENT_PUSH =
            createElement("push", LoveTypes.FUNCTION);

    private static final LookupElement EVENT_QUIT =
            createElement("quit", LoveTypes.FUNCTION);

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

    // Filesystem Functions
    private static final LookupElement FILESYSTEM_APPEND =
            createElement("append", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_ARE_SYMLINKS_ENABLED =
            createElement("areSymlinksEnabled", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_CREATE_DIRECTORY =
            createElement("createDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_ENUMERATE =
            createElement("enumerate", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_EXISTS =
            createElement("exists", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_APPDATA_DIRECTORY =
            createElement("getAppdataDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_C_REQUIRE_PATH =
            createElement("getCRequirePath", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_DIRECTORY_ITEMS =
            createElement("getDirectoryItems", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_IDENTITY =
            createElement("getIdentity", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_INFO =
            createElement("getInfo", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_LAST_MODIFIED =
            createElement("getLastModified", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_REAL_DIRECTORY =
            createElement("getRealDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_REQUIRE_PATH =
            createElement("getRequirePath", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_SAVE_DIRECTORY =
            createElement("getSaveDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_SIZE =
            createElement("getSize", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_SOURCE =
            createElement("getSource", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_SOURCE_BASE_DIRECTORY =
            createElement("getSourceBaseDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_USER_DIRECTORY =
            createElement("getUserDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_GET_WORKING_DIRECTORY =
            createElement("getWorkingDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_INIT =
            createElement("init", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_IS_DIRECTORY =
            createElement("isDirectory", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_IS_FILE =
            createElement("isFile", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_IS_FUSED =
            createElement("isFused", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_IS_SYMLINK =
            createElement("isSymlink", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_LINES =
            createElement("lines", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_LOAD =
            createElement("load", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_MKDIR =
            createElement("mkdir", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_MOUNT =
            createElement("mount", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_NEW_FILE =
            createElement("newFile", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_NEW_FILE_DATA =
            createElement("newFileData", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_READ =
            createElement("read", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_REMOVE =
            createElement("remove", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_SET_C_REQUIRE_PATH =
            createElement("setCRequirePath", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_SET_IDENTITY =
            createElement("setIdentity", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_SET_REQUIRE_PATH =
            createElement("setRequirePath", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_SET_SOURCE =
            createElement("setSource", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_SET_SYMLINKS_ENABLED =
            createElement("setSymlinksEnabled", LoveTypes.FUNCTION);

    private static final LookupElement FILESYSTEM_UNMOUNT =
            createElement("unmount", LoveTypes.FUNCTION);

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

    // Font Functions
    private static final LookupElement FONT_NEW_BM_FONT_RASTERIZER =
            createElement("newBMFontRasterizer", LoveTypes.FUNCTION);

    private static final LookupElement FONT_NEW_FONT_DATA =
            createElement("newFontData", LoveTypes.FUNCTION);

    private static final LookupElement FONT_NEW_GLYPH_DATA =
            createElement("newGlyphData", LoveTypes.FUNCTION);

    private static final LookupElement FONT_NEW_IMAGE_RASTERIZER =
            createElement("newImageRasterizer", LoveTypes.FUNCTION);

    private static final LookupElement FONT_NEW_RASTERIZER =
            createElement("newRasterizer", LoveTypes.FUNCTION);

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

    // Graphics Functions
    private static final LookupElement GRAPHICS_SET_COLOR =
            createElement("setColor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_BACKGROUND_COLOR =
            createElement("setBackgroundColor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_IMAGE =
            createElement("newImage", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_DRAW =
            createElement("draw", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_RECTANGLE =
            createElement("rectangle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_CIRCLE =
            createElement("circle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_PRINT =
            createElement("print", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_FONT =
            createElement("setFont", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_FONT =
            createElement("newFont", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_LINE_WIDTH =
            createElement("setLineWidth", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_LINE_STYLE =
            createElement("setLineStyle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_BLEND_MODE =
            createElement("setBlendMode", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_CANVAS =
            createElement("newCanvas", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_CANVAS =
            createElement("setCanvas", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_CANVAS =
            createElement("getCanvas", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_SCISSOR =
            createElement("setScissor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_SCISSOR =
            createElement("getScissor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_CLEAR =
            createElement("clear", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_PRESENT =
            createElement("present", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_PUSH =
            createElement("push", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_POP =
            createElement("pop", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_ORIGIN =
            createElement("origin", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SCALE =
            createElement("scale", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_ROTATE =
            createElement("rotate", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SHEAR =
            createElement("shear", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_TRANSLATE =
            createElement("translate", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_SCISSOR_BOX =
            createElement("setScissor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_RESET_SCISSOR =
            createElement("resetScissor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_QUAD =
            createElement("newQuad", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_MESH =
            createElement("newMesh", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_MESH_DRAW_MODE =
            createElement("setMeshDrawMode", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_COLOR =
            createElement("getColor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_BACKGROUND_COLOR =
            createElement("getBackgroundColor", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_FONT =
            createElement("getFont", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_IMAGE_DATA =
            createElement("newImageData", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_SHADER =
            createElement("newShader", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_SHADER =
            createElement("setShader", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_SHADER =
            createElement("getShader", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_BLEND_MODE =
            createElement("getBlendMode", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_LINE_WIDTH =
            createElement("getLineWidth", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_LINE_STYLE =
            createElement("getLineStyle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_POINT_SIZE =
            createElement("setPointSize", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_POINT_SIZE =
            createElement("getPointSize", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_POINT_STYLE =
            createElement("setPointStyle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_POINT_STYLE =
            createElement("getPointStyle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_LINE_JOIN =
            createElement("setLineJoin", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_LINE_JOIN =
            createElement("getLineJoin", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_SET_LINE_CAP =
            createElement("setLineCap", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_GET_LINE_CAP =
            createElement("getLineCap", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_POLYGON =
            createElement("polygon", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_ARC =
            createElement("arc", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_LINE =
            createElement("line", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_POINTS =
            createElement("points", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_TRIANGLE =
            createElement("triangle", LoveTypes.FUNCTION);

    private static final LookupElement GRAPHICS_NEW_SPRITE_BATCH =
            createElement("newSpriteBatch", LoveTypes.FUNCTION);

    /**
     * A List containing all graphics module functions.
     */
    private static final List<LookupElement> LOVE_GRAPHICS_FUNCTIONS = Arrays.asList(
            GRAPHICS_SET_COLOR,
            GRAPHICS_SET_BACKGROUND_COLOR,
            GRAPHICS_NEW_IMAGE,
            GRAPHICS_DRAW,
            GRAPHICS_RECTANGLE,
            GRAPHICS_CIRCLE,
            GRAPHICS_PRINT,
            GRAPHICS_SET_FONT,
            GRAPHICS_NEW_FONT,
            GRAPHICS_SET_LINE_WIDTH,
            GRAPHICS_SET_LINE_STYLE,
            GRAPHICS_SET_BLEND_MODE,
            GRAPHICS_NEW_CANVAS,
            GRAPHICS_SET_CANVAS,
            GRAPHICS_GET_CANVAS,
            GRAPHICS_SET_SCISSOR,
            GRAPHICS_GET_SCISSOR,
            GRAPHICS_CLEAR,
            GRAPHICS_PRESENT,
            GRAPHICS_PUSH,
            GRAPHICS_POP,
            GRAPHICS_ORIGIN,
            GRAPHICS_SCALE,
            GRAPHICS_ROTATE,
            GRAPHICS_SHEAR,
            GRAPHICS_TRANSLATE,
            GRAPHICS_SET_SCISSOR_BOX,
            GRAPHICS_RESET_SCISSOR,
            GRAPHICS_NEW_QUAD,
            GRAPHICS_NEW_MESH,
            GRAPHICS_SET_MESH_DRAW_MODE,
            GRAPHICS_GET_COLOR,
            GRAPHICS_GET_BACKGROUND_COLOR,
            GRAPHICS_GET_FONT,
            GRAPHICS_NEW_IMAGE_DATA,
            GRAPHICS_NEW_SHADER,
            GRAPHICS_SET_SHADER,
            GRAPHICS_GET_SHADER,
            GRAPHICS_GET_BLEND_MODE,
            GRAPHICS_GET_LINE_WIDTH,
            GRAPHICS_GET_LINE_STYLE,
            GRAPHICS_SET_POINT_SIZE,
            GRAPHICS_GET_POINT_SIZE,
            GRAPHICS_SET_POINT_STYLE,
            GRAPHICS_GET_POINT_STYLE,
            GRAPHICS_SET_LINE_JOIN,
            GRAPHICS_GET_LINE_JOIN,
            GRAPHICS_SET_LINE_CAP,
            GRAPHICS_GET_LINE_CAP,
            GRAPHICS_POLYGON,
            GRAPHICS_ARC,
            GRAPHICS_LINE,
            GRAPHICS_POINTS,
            GRAPHICS_TRIANGLE,
            GRAPHICS_NEW_SPRITE_BATCH
    );

    // Image Functions
    private static final LookupElement IMAGE_IS_COMPRESSED =
            createElement("isCompressed", LoveTypes.FUNCTION);

    private static final LookupElement IMAGE_NEW_COMPRESSED_DATA =
            createElement("newCompressedData", LoveTypes.FUNCTION);

    private static final LookupElement IMAGE_NEW_ENCODED_IMAGE_DATA =
            createElement("newEncodedImageData", LoveTypes.FUNCTION);

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

    // Joystick Functions
    private static final LookupElement JOYSTICK_CLOSE =
            createElement("close", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_AXES =
            createElement("getAxes", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_AXIS =
            createElement("getAxis", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_BALL =
            createElement("getBall", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_GAMEPAD_MAPPING_STRING =
            createElement("getGamepadMappingString", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_HAT =
            createElement("getHat", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_JOYSTICK_COUNT =
            createElement("getJoystickCount", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_JOYSTICKS =
            createElement("getJoysticks", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NAME =
            createElement("getName", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NUM_AXES =
            createElement("getNumAxes", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NUM_BALLS =
            createElement("getNumBalls", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NUM_BUTTONS =
            createElement("getNumButtons", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NUM_HATS =
            createElement("getNumHats", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_GET_NUM_JOYSTICKS =
            createElement("getNumJoysticks", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_IS_OPEN =
            createElement("isOpen", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_LOAD_GAMEPAD_MAPPINGS =
            createElement("loadGamepadMappings", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_OPEN =
            createElement("open", LoveTypes.FUNCTION);

    private static final LookupElement JOYSTICK_SAVE_GAMEPAD_MAPPINGS =
            createElement("saveGamepadMappings", LoveTypes.FUNCTION);

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

    // Keyboard Functions
    private static final LookupElement KEYBOARD_GET_KEY_FROM_SCANCODE =
            createElement("getKeyFromScancode", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_GET_KEY_REPEAT =
            createElement("getKeyRepeat", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_GET_SCANCODE_FROM_KEY =
            createElement("getScancodeFromKey", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_HAS_KEY_REPEAT =
            createElement("hasKeyRepeat", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_HAS_SCREEN_KEYBOARD =
            createElement("hasScreenKeyboard", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_HAS_TEXT_INPUT =
            createElement("hasTextInput", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_IS_SCANCODE_DOWN =
            createElement("isScancodeDown", LoveTypes.FUNCTION);

    private static final LookupElement KEYBOARD_SET_KEY_REPEAT =
            createElement("setKeyRepeat", LoveTypes.FUNCTION);

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

    // Math Functions
    private static final LookupElement MATH_COLOR_FROM_BYTES =
            createElement("colorFromBytes", LoveTypes.FUNCTION);

    private static final LookupElement MATH_COLOR_TO_BYTES =
            createElement("colorToBytes", LoveTypes.FUNCTION);

    private static final LookupElement MATH_COMPRESS =
            createElement("compress", LoveTypes.FUNCTION);

    private static final LookupElement MATH_DECOMPRESS =
            createElement("decompress", LoveTypes.FUNCTION);

    private static final LookupElement MATH_GAMMA_TO_LINEAR =
            createElement("gammaToLinear", LoveTypes.FUNCTION);

    private static final LookupElement MATH_GET_RANDOM_SEED =
            createElement("getRandomSeed", LoveTypes.FUNCTION);

    private static final LookupElement MATH_GET_RANDOM_STATE =
            createElement("getRandomState", LoveTypes.FUNCTION);

    private static final LookupElement MATH_IS_CONVEX =
            createElement("isConvex", LoveTypes.FUNCTION);

    private static final LookupElement MATH_LINEAR_TO_GAMMA =
            createElement("linearToGamma", LoveTypes.FUNCTION);

    private static final LookupElement MATH_NEW_BEZIER_CURVE =
            createElement("newBezierCurve", LoveTypes.FUNCTION);

    private static final LookupElement MATH_NEW_RANDOM_GENERATOR =
            createElement("newRandomGenerator", LoveTypes.FUNCTION);

    private static final LookupElement MATH_NEW_TRANSFORM =
            createElement("newTransform", LoveTypes.FUNCTION);

    private static final LookupElement MATH_NOISE =
            createElement("noise", LoveTypes.FUNCTION);

    private static final LookupElement MATH_RANDOM =
            createElement("random", LoveTypes.FUNCTION);

    private static final LookupElement MATH_RANDOM_NORMAL =
            createElement("randomNormal", LoveTypes.FUNCTION);

    private static final LookupElement MATH_SET_RANDOM_SEED =
            createElement("setRandomSeed", LoveTypes.FUNCTION);

    private static final LookupElement MATH_SET_RANDOM_STATE =
            createElement("setRandomState", LoveTypes.FUNCTION);

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

    // Mouse Functions
    private static final LookupElement MOUSE_GET_CURSOR =
            createElement("getCursor", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_GET_RELATIVE_MODE =
            createElement("getRelativeMode", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_GET_SYSTEM_CURSOR =
            createElement("getSystemCursor", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_GET_X =
            createElement("getX", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_GET_Y =
            createElement("getY", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_HAS_CURSOR =
            createElement("hasCursor", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_IS_CURSOR_SUPPORTED =
            createElement("isCursorSupported", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_IS_DOWN =
            createElement("isDown", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_IS_GRABBED =
            createElement("isGrabbed", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_IS_VISIBLE =
            createElement("isVisible", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_NEW_CURSOR =
            createElement("newCursor", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_CURSOR =
            createElement("setCursor", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_GRAB =
            createElement("setGrab", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_GRABBED =
            createElement("setGrabbed", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_POSITION =
            createElement("setPosition", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_RELATIVE_MODE =
            createElement("setRelativeMode", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_VISIBLE =
            createElement("setVisible", LoveTypes.FUNCTION);

    private static final LookupElement MOUSE_SET_X =
            createElement("setX", LoveTypes.FUNCTION);

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

    // Physics Functions
    private static final LookupElement PHYSICS_GET_DISTANCE =
            createElement("getDistance", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_GET_METER =
            createElement("getMeter", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_BODY =
            createElement("newBody", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_CHAIN_SHAPE =
            createElement("newChainShape", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_CIRCLE_SHAPE =
            createElement("newCircleShape", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_DISTANCE_JOINT =
            createElement("newDistanceJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_EDGE_SHAPE =
            createElement("newEdgeShape", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_FIXTURE =
            createElement("newFixture", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_FRICTION_JOINT =
            createElement("newFrictionJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_GEAR_JOINT =
            createElement("newGearJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_MOTOR_JOINT =
            createElement("newMotorJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_MOUSE_JOINT =
            createElement("newMouseJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_POLYGON_SHAPE =
            createElement("newPolygonShape", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_PRISMATIC_JOINT =
            createElement("newPrismaticJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_PULLEY_JOINT =
            createElement("newPulleyJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_RECTANGLE_SHAPE =
            createElement("newRectangleShape", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_REVOLUTE_JOINT =
            createElement("newRevoluteJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_ROPE_JOINT =
            createElement("newRopeJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_WELD_JOINT =
            createElement("newWeldJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_WHEEL_JOINT =
            createElement("newWheelJoint", LoveTypes.FUNCTION);

    private static final LookupElement PHYSICS_NEW_WORLD =
            createElement("newWorld", LoveTypes.FUNCTION);

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

    // Sound Functions
    private static final LookupElement SOUND_NEW_DECODER =
            createElement("newDecoder", LoveTypes.FUNCTION);

    private static final LookupElement SOUND_NEW_SOUND_DATA =
            createElement("newSoundData", LoveTypes.FUNCTION);

    /**
     * A List containing all sound module functions.
     */
    private static final List<LookupElement> LOVE_SOUND_FUNCTIONS = Arrays.asList(
            SOUND_NEW_DECODER,
            SOUND_NEW_SOUND_DATA
    );

    // System Functions
    private static final LookupElement SYSTEM_GET_CLIPBOARD_TEXT =
            createElement("getClipboardText", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_GET_OS =
            createElement("getOS", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_GET_POWER_INFO =
            createElement("getPowerInfo", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_GET_PROCESSOR_COUNT =
            createElement("getProcessorCount", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_HAS_BACKGROUND_MUSIC =
            createElement("hasBackgroundMusic", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_OPEN_URL =
            createElement("openURL", LoveTypes.FUNCTION);

    private static final LookupElement SYSTEM_SET_CLIPBOARD_TEXT =
            createElement("setClipboardText", LoveTypes.FUNCTION);

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

    // Thread Functions
    private static final LookupElement THREAD_GET_CHANNEL =
            createElement("getChannel", LoveTypes.FUNCTION);

    private static final LookupElement THREAD_GET_THREAD =
            createElement("getThread", LoveTypes.FUNCTION);

    private static final LookupElement THREAD_GET_THREADS =
            createElement("getThreads", LoveTypes.FUNCTION);

    private static final LookupElement THREAD_NEW_CHANNEL =
            createElement("newChannel", LoveTypes.FUNCTION);

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

    // Timer Functions
    private static final LookupElement TIMER_GET_AVERAGE_DELTA =
            createElement("getAverageDelta", LoveTypes.FUNCTION);

    private static final LookupElement TIMER_GET_DELTA =
            createElement("getDelta", LoveTypes.FUNCTION);

    private static final LookupElement TIMER_GET_FPS =
            createElement("getFPS", LoveTypes.FUNCTION);

    private static final LookupElement TIMER_GET_MICRO_TIME =
            createElement("getMicroTime", LoveTypes.FUNCTION);

    private static final LookupElement TIMER_GET_TIME =
            createElement("getTime", LoveTypes.FUNCTION);

    private static final LookupElement TIMER_SLEEP =
            createElement("sleep", LoveTypes.FUNCTION);

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

    // Touch Functions
    private static final LookupElement TOUCH_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    private static final LookupElement TOUCH_GET_PRESSURE =
            createElement("getPressure", LoveTypes.FUNCTION);

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

    // Video Functions
    private static final LookupElement VIDEO_NEW_VIDEO_STREAM =
            createElement("newVideoStream", LoveTypes.FUNCTION);

    /**
     * A List containing all video module functions.
     */
    private static final List<LookupElement> LOVE_VIDEO_FUNCTIONS = List.of(
            VIDEO_NEW_VIDEO_STREAM
    );

    // Window Functions
    private static final LookupElement WINDOW_CLOSE =
            createElement("close", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_FROM_PIXELS =
            createElement("fromPixels", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DPI_SCALE =
            createElement("getDPIScale", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DESKTOP_DIMENSIONS =
            createElement("getDesktopDimensions", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DIMENSIONS =
            createElement("getDimensions", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DISPLAY_COUNT =
            createElement("getDisplayCount", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DISPLAY_NAME =
            createElement("getDisplayName", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_DISPLAY_ORIENTATION =
            createElement("getDisplayOrientation", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_FULLSCREEN =
            createElement("getFullscreen", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_FULLSCREEN_MODES =
            createElement("getFullscreenModes", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_HEIGHT =
            createElement("getHeight", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_ICON =
            createElement("getIcon", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_MODE =
            createElement("getMode", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_PIXEL_SCALE =
            createElement("getPixelScale", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_POSITION =
            createElement("getPosition", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_SAFE_AREA =
            createElement("getSafeArea", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_TITLE =
            createElement("getTitle", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_VSYNC =
            createElement("getVSync", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_GET_WIDTH =
            createElement("getWidth", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_HAS_FOCUS =
            createElement("hasFocus", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_HAS_MOUSE_FOCUS =
            createElement("hasMouseFocus", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_CREATED =
            createElement("isCreated", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_DISPLAY_SLEEP_ENABLED =
            createElement("isDisplaySleepEnabled", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_MAXIMIZED =
            createElement("isMaximized", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_MINIMIZED =
            createElement("isMinimized", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_OPEN =
            createElement("isOpen", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_IS_VISIBLE =
            createElement("isVisible", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_MAXIMIZE =
            createElement("maximize", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_MINIMIZE =
            createElement("minimize", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_REQUEST_ATTENTION =
            createElement("requestAttention", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_RESTORE =
            createElement("restore", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_DISPLAY_SLEEP_ENABLED =
            createElement("setDisplaySleepEnabled", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_FULLSCREEN =
            createElement("setFullscreen", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_ICON =
            createElement("setIcon", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_MODE =
            createElement("setMode", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_POSITION =
            createElement("setPosition", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_TITLE =
            createElement("setTitle", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SET_VSYNC =
            createElement("setVSync", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_SHOW_MESSAGE_BOX =
            createElement("showMessageBox", LoveTypes.FUNCTION);

    private static final LookupElement WINDOW_TO_PIXELS =
            createElement("toPixels", LoveTypes.FUNCTION);

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

    // Image Functions (continued)
    private static final LookupElement IMAGE_NEW_IMAGE =
            createElement("newImage", LoveTypes.FUNCTION);

    /**
     * A List containing all image module functions.
     */
    private static final List<LookupElement> LOVE_IMAGE_FUNCTIONS_LIST = Arrays.asList(
            IMAGE_IS_COMPRESSED,
            IMAGE_NEW_COMPRESSED_DATA,
            IMAGE_NEW_ENCODED_IMAGE_DATA,
            IMAGE_NEW_IMAGE_DATA
    );

    // Central Map Initialization
    static {
        Map<String, List<LookupElement>> map = new HashMap<>();

        // Callbacks
        map.put(LoveTypes.CALLBACKS_KEY, LOVE_CALLBACKS);

        // Modules
        map.put(LoveTypes.MODULES_KEY, LOVE_MODULES);

        // Functions by module
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

    /**
     * Creates a LookupElement with consistent styling:
     * - Bold text
     * - Uses the LoveIcons.LOVE_ICON
     * - Sets the given type text (e.g., "Callback", "Module", "Function")
     *
     * @param name     The display text of the completion item.
     * @param typeText The type text (from LoveTypes) displayed alongside the item.
     * @return A styled LookupElement.
     */
    private static LookupElement createElement(String name, String typeText) {
        LookupElement element = LookupElementBuilder.create(name)
                .bold()
                .withTypeText(typeText)
                .withIcon(LoveIcons.LOVE_ICON);

        return PrioritizedLookupElement.withPriority(element, 1000);
    }

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