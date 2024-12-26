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

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoveElementsTest {
    @Test
    public void testCallbackCount() {
        assertEquals(3, LoveElements.getElementsFor(LoveTypes.CALLBACKS_KEY).size());
    }

    @Test
    public void testModulesCount() {
        assertEquals(19, LoveElements.getElementsFor(LoveTypes.MODULES_KEY).size());
    }

    @Test
    public void testFunctionsCount() {
        assertEquals(30, LoveElements.getElementsFor(LoveTypes.AUDIO_KEY).size());
        assertEquals(10, LoveElements.getElementsFor(LoveTypes.DATA_KEY).size());
        assertEquals(6, LoveElements.getElementsFor(LoveTypes.EVENT_KEY).size());
        assertEquals(39, LoveElements.getElementsFor(LoveTypes.FILESYSTEM_KEY).size());
        assertEquals(6, LoveElements.getElementsFor(LoveTypes.FONT_KEY).size());
        assertEquals(55, LoveElements.getElementsFor(LoveTypes.GRAPHICS_KEY).size());
        assertEquals(4, LoveElements.getElementsFor(LoveTypes.IMAGE_KEY).size());
        assertEquals(20, LoveElements.getElementsFor(LoveTypes.JOYSTICK_KEY).size());
        assertEquals(10, LoveElements.getElementsFor(LoveTypes.KEYBOARD_KEY).size());
        assertEquals(18, LoveElements.getElementsFor(LoveTypes.MATH_KEY).size());
        assertEquals(20, LoveElements.getElementsFor(LoveTypes.MOUSE_KEY).size());
        assertEquals(22, LoveElements.getElementsFor(LoveTypes.PHYSICS_KEY).size());
        assertEquals(2, LoveElements.getElementsFor(LoveTypes.SOUND_KEY).size());
        assertEquals(8, LoveElements.getElementsFor(LoveTypes.SYSTEM_KEY).size());
        assertEquals(5, LoveElements.getElementsFor(LoveTypes.THREAD_KEY).size());
        assertEquals(7, LoveElements.getElementsFor(LoveTypes.TIMER_KEY).size());
        assertEquals(3, LoveElements.getElementsFor(LoveTypes.TOUCH_KEY).size());
        assertEquals(1, LoveElements.getElementsFor(LoveTypes.VIDEO_KEY).size());
        assertEquals(41, LoveElements.getElementsFor(LoveTypes.WINDOW_KEY).size());
    }
}