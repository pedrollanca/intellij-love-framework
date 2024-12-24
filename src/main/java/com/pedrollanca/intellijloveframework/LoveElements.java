package com.pedrollanca.intellijloveframework;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;

import java.util.Arrays;
import java.util.List;

public class LoveElements {
    private static final LookupElement LOVE_LOAD_CALLBACK = LookupElementBuilder.create("load").bold().withTypeText("Callback").withIcon(LoveIcons.LOVE_ICON);
    private static final LookupElement LOVE_UPDATE_CALLBACK = LookupElementBuilder.create("update").bold().withTypeText("Callback").withIcon(LoveIcons.LOVE_ICON);
    private static final LookupElement LOVE_DRAW_CALLBACK = LookupElementBuilder.create("draw").bold().withTypeText("Callback").withIcon(LoveIcons.LOVE_ICON);

    public static final List<LookupElement> LOVE_CALLBACKS = Arrays.asList(LOVE_LOAD_CALLBACK, LOVE_UPDATE_CALLBACK, LOVE_DRAW_CALLBACK);

}
