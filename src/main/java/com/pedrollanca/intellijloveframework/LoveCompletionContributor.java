package com.pedrollanca.intellijloveframework;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.lang.Language;

import static com.intellij.patterns.PlatformPatterns.psiElement;

final public class LoveCompletionContributor extends CompletionContributor {
    LoveCompletionContributor() {
        extend(CompletionType.BASIC, psiElement().withLanguage(Language.ANY), new LoveCompletionProvider());
    }
}
