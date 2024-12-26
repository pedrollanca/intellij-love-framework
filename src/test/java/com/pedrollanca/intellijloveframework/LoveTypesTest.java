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

package com.pedrollanca.intellijloveframework;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test class for LoveTypes.
 */
public class LoveTypesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test that all type text constants are not null or empty.
     */
    @Test
    public void testTypeTextConstants() {
        assertNotNull("CALLBACK should not be null", LoveTypes.CALLBACK);
        assertFalse("CALLBACK should not be empty", LoveTypes.CALLBACK.isEmpty());

        assertNotNull("MODULE should not be null", LoveTypes.MODULE);
        assertFalse("MODULE should not be empty", LoveTypes.MODULE.isEmpty());

        assertNotNull("FUNCTION should not be null", LoveTypes.FUNCTION);
        assertFalse("FUNCTION should not be empty", LoveTypes.FUNCTION.isEmpty());
    }

    /**
     * Test that all map key constants are not null or empty.
     */
    @Test
    public void testMapKeyConstants() {
        assertNotNull("CALLBACKS_KEY should not be null", LoveTypes.CALLBACKS_KEY);
        assertFalse("CALLBACKS_KEY should not be empty", LoveTypes.CALLBACKS_KEY.isEmpty());

        assertNotNull("MODULES_KEY should not be null", LoveTypes.MODULES_KEY);
        assertFalse("MODULES_KEY should not be empty", LoveTypes.MODULES_KEY.isEmpty());

        // Add similar assertions for other map keys as needed
        assertNotNull("AUDIO_KEY should not be null", LoveTypes.AUDIO_KEY);
        assertFalse("AUDIO_KEY should not be empty", LoveTypes.AUDIO_KEY.isEmpty());

        assertNotNull("DATA_KEY should not be null", LoveTypes.DATA_KEY);
        assertFalse("DATA_KEY should not be empty", LoveTypes.DATA_KEY.isEmpty());

        // Continue for all other keys...
    }

    /**
     * Test that MODULE_KEYS list contains all module key constants.
     */
    @Test
    public void testModuleKeysList() {
        List<String> moduleKeys = LoveTypes.MODULE_KEYS;
        assertNotNull("MODULE_KEYS should not be null", moduleKeys);
        assertFalse("MODULE_KEYS should not be empty", moduleKeys.isEmpty());

        // Verify that each module key constant is present in MODULE_KEYS list
        assertTrue("MODULE_KEYS should contain AUDIO_KEY", moduleKeys.contains(LoveTypes.AUDIO_KEY));
        assertTrue("MODULE_KEYS should contain DATA_KEY", moduleKeys.contains(LoveTypes.DATA_KEY));
        assertTrue("MODULE_KEYS should contain EVENT_KEY", moduleKeys.contains(LoveTypes.EVENT_KEY));
        assertTrue("MODULE_KEYS should contain FILESYSTEM_KEY", moduleKeys.contains(LoveTypes.FILESYSTEM_KEY));
        assertTrue("MODULE_KEYS should contain FONT_KEY", moduleKeys.contains(LoveTypes.FONT_KEY));
        assertTrue("MODULE_KEYS should contain GRAPHICS_KEY", moduleKeys.contains(LoveTypes.GRAPHICS_KEY));
        assertTrue("MODULE_KEYS should contain IMAGE_KEY", moduleKeys.contains(LoveTypes.IMAGE_KEY));
        assertTrue("MODULE_KEYS should contain JOYSTICK_KEY", moduleKeys.contains(LoveTypes.JOYSTICK_KEY));
        assertTrue("MODULE_KEYS should contain KEYBOARD_KEY", moduleKeys.contains(LoveTypes.KEYBOARD_KEY));
        assertTrue("MODULE_KEYS should contain MATH_KEY", moduleKeys.contains(LoveTypes.MATH_KEY));
        assertTrue("MODULE_KEYS should contain MOUSE_KEY", moduleKeys.contains(LoveTypes.MOUSE_KEY));
        assertTrue("MODULE_KEYS should contain PHYSICS_KEY", moduleKeys.contains(LoveTypes.PHYSICS_KEY));
        assertTrue("MODULE_KEYS should contain SOUND_KEY", moduleKeys.contains(LoveTypes.SOUND_KEY));
        assertTrue("MODULE_KEYS should contain SYSTEM_KEY", moduleKeys.contains(LoveTypes.SYSTEM_KEY));
        assertTrue("MODULE_KEYS should contain THREAD_KEY", moduleKeys.contains(LoveTypes.THREAD_KEY));
        assertTrue("MODULE_KEYS should contain TIMER_KEY", moduleKeys.contains(LoveTypes.TIMER_KEY));
        assertTrue("MODULE_KEYS should contain TOUCH_KEY", moduleKeys.contains(LoveTypes.TOUCH_KEY));
        assertTrue("MODULE_KEYS should contain VIDEO_KEY", moduleKeys.contains(LoveTypes.VIDEO_KEY));
        assertTrue("MODULE_KEYS should contain WINDOW_KEY", moduleKeys.contains(LoveTypes.WINDOW_KEY));

        // Additionally, ensure there are no extra keys
        assertEquals("MODULE_KEYS should contain exactly 19 keys", 19, moduleKeys.size());
    }

    /**
     * Test that the LoveTypes class cannot be instantiated.
     */
    @Test
    public void testCannotInstantiateLoveTypes() throws Exception {
        Constructor<LoveTypes> constructor = LoveTypes.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        thrown.expect(InvocationTargetException.class);
        constructor.newInstance();
    }
}