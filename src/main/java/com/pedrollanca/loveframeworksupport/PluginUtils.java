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

import com.intellij.lang.Language;
import com.intellij.openapi.extensions.PluginDescriptor;
import com.intellij.openapi.extensions.PluginId;
import com.intellij.ide.plugins.PluginManagerCore;

public class PluginUtils {
    /**
     * Checks if EmmyLua plugin is installed and enabled.
     *
     * @return true if EmmyLua is active, false otherwise.
     */
    public static boolean isEmmyLuaActive() {
        PluginId emmyLuaPluginId = PluginId.getId("com.tang");
        PluginDescriptor descriptor = PluginManagerCore.getPlugin(emmyLuaPluginId);
        return descriptor != null && descriptor.isEnabled();
    }

    /**
     * Retrieves the LuaLanguage instance from EmmyLua.
     *
     * @return LuaLanguage instance if available, null otherwise.
     */
    public static Language getLuaLanguage() {
        if (!isEmmyLuaActive()) {
            return null;
        }
        // Attempt to find the Lua language by ID
        Language luaLanguage = Language.findLanguageByID("Lua");
        if (luaLanguage == null) {
            // Fallback: Attempt to find by name
            luaLanguage = Language.findLanguageByID("Lua");
        }
        return luaLanguage;
    }
}