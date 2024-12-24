package com.pedrollanca.intellijloveframework;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class LoveCompletionProvider extends CompletionProvider<CompletionParameters> {
    @Override
    protected void addCompletions(@NotNull CompletionParameters completionParameters, @NotNull ProcessingContext processingContext, @NotNull CompletionResultSet completionResultSet) {

        Editor editor = completionParameters.getEditor();
        Document document = editor.getDocument();
        int offset = completionParameters.getOffset();

        CharSequence text = document.getCharsSequence();

        String trigger = "love.";

        // Ensure we don’t go out of bounds
        if (offset >= trigger.length()) {
            // Extract the substring of length 'trigger.length()' ending at offset
            CharSequence recentText = text.subSequence(offset - trigger.length(), offset);

            // Compare to our trigger
            if (trigger.contentEquals(recentText)) {
                // If it matches, add your completions
                completionResultSet.addAllElements(LoveElements.LOVE_CALLBACKS);
            }
        }

    }
}