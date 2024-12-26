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

public class LoveCompletionProvider extends CompletionProvider<CompletionParameters> {
    // Regular expression to match lines starting with 'love.' or 'love.<module>.'
    private static final Pattern LOVE_LINE_PATTERN = Pattern.compile("^\\s*love\\.(\\w*)\\.?$");

    @Override
    protected void addCompletions(@NotNull CompletionParameters completionParameters,
                                  @NotNull ProcessingContext processingContext,
                                  @NotNull CompletionResultSet completionResultSet) {

        Editor editor = completionParameters.getEditor();
        Document document = editor.getDocument();
        int offset = completionParameters.getOffset();

        // Get the text from the start of the line to the current cursor position
        int lineStartOffset = document.getLineStartOffset(document.getLineNumber(offset));
        String lineText = document.getText().substring(lineStartOffset, offset).trim();

        Matcher matcher = LOVE_LINE_PATTERN.matcher(lineText);

        if (matcher.matches()) {
            String moduleOrEmpty = matcher.group(1);

            if (moduleOrEmpty.isEmpty()) {
                // User has typed 'love.'
                // Suggest callbacks and modules
                completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.CALLBACKS_KEY));
                completionResultSet.addAllElements(LoveElements.getElementsFor(LoveTypes.MODULES_KEY));
            } else {
                // User has typed 'love.<module>'
                // Now, wait for the '.' to trigger function suggestions
                // Since this method is triggered on '.', ensure that the last character is '.'
                if (lineText.endsWith(".")) {
                    // User has typed 'love.<module>.'
                    // Suggest functions related to the module
                    completionResultSet.addAllElements(LoveElements.getElementsFor(moduleOrEmpty));
                }
                // Else, do not suggest anything (require full module name)
            }
        }
    }
}