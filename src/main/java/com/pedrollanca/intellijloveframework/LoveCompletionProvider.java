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

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Provides custom code completion features for the IntelliJ Love Framework.
 */
public class LoveCompletionProvider extends CompletionProvider<CompletionParameters> {
    /**
     * Regular expression to match lines starting with 'love.' or 'love.<module>.'.
     */
    private static final Pattern LOVE_LINE_PATTERN = Pattern.compile("^\\s*love\\.(\\w*)\\.?$");

    /**
     * Adds completion suggestions based on the current context in the editor.
     *
     * @param completionParameters the parameters for code completion
     * @param processingContext    the processing context
     * @param completionResultSet  the result set to add completion elements to
     */
    @Override
    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                  @NotNull ProcessingContext processingContext,
                                  @NotNull CompletionResultSet completionResultSet) {

        try {
            Editor editor = completionParameters.getEditor();
            Document document = editor.getDocument();
            int offset = completionParameters.getOffset();

            int lineStartOffset = document.getLineStartOffset(document.getLineNumber(offset));
            String lineText = document.getText().substring(lineStartOffset, offset).trim();

            Matcher matcher = LOVE_LINE_PATTERN.matcher(lineText);

            if (matcher.matches()) {
                String moduleOrEmpty = matcher.group(1);

                if (moduleOrEmpty.isEmpty()) {
                    completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.CALLBACKS_KEY));
                    completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.MODULES_KEY));
                } else {
                    if (lineText.endsWith(".")) {
                        completionResultSet.addAllElements(LoveElements.getElementsFor(moduleOrEmpty));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}