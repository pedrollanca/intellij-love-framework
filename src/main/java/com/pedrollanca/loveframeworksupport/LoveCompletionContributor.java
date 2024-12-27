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

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.lang.Language;

import static com.intellij.patterns.PlatformPatterns.psiElement;

/**
 * Provides custom code completion features for the IntelliJ Love Framework.
 */
final public class LoveCompletionContributor extends CompletionContributor {
    LoveCompletionContributor() {

        Language luaLanguage = PluginUtils.getLuaLanguage();
        if (luaLanguage != null) {
            extend(
                    CompletionType.BASIC,
                    psiElement().withLanguage(luaLanguage),
                    new LoveCompletionProvider()
            );
        } else {
            extend(CompletionType.BASIC, psiElement().withLanguage(Language.ANY), new LoveCompletionProvider());
        }

    }
}