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
        String audio_module = "audio.";
        // Ensure we don’t go out of bounds
        if (offset >= trigger.length()) {
            // Extract the substring of length 'trigger.length()' ending at offset
            CharSequence recentText = text.subSequence(offset - trigger.length() - 1, offset).toString().trim();

            // Compare to our trigger
            if (trigger.contentEquals(recentText)) {
                // If it matches, add your completions
                completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.CALLBACKS_KEY));
                completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.MODULES_KEY
                ));
            }

            if (audio_module.contentEquals(recentText)) {
                completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.AUDIO_KEY));

            }
        }

    }
}