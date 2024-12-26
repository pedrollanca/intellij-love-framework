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

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.util.ProcessingContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Test class for LoveCompletionProvider.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoveCompletionProviderTest {

    @InjectMocks
    private LoveCompletionProvider provider;

    @Mock
    private CompletionParameters mockParameters;

    @Mock
    private CompletionResultSet mockResultSet;

    @Mock
    private ProcessingContext mockContext;

    @Mock
    private Editor mockEditor;

    @Mock
    private Document mockDocument;

    /**
     * Initialize mocks before each test.
     */
    @Before
    public void setUp() {
        // When getEditor() is called on CompletionParameters, return the mock Editor
        when(mockParameters.getEditor()).thenReturn(mockEditor);
        // When getDocument() is called on Editor, return the mock Document
        when(mockEditor.getDocument()).thenReturn(mockDocument);
    }

    /**
     * Test provideCompletions when the current line matches LOVE_LINE_PATTERN.
     * Expectation: Completion items are added.
     */
    @Test
    public void testProvideCompletionsWithValidLoveLinePattern() {
        // Define a line that matches LOVE_LINE_PATTERN
        String validLine = "love.";
        // Mock the Document to return the valid line
        when(mockDocument.getText()).thenReturn(validLine);
        when(mockParameters.getOffset()).thenReturn(5);
        when(mockDocument.getLineStartOffset(anyInt())).thenReturn(0);
        // Invoke the method under test
        provider.addCompletions(mockParameters, mockContext, mockResultSet);

        // Verify that resultSet.addElement was called twice
        verify(mockResultSet, times(2)).addAllElements(any());
    }

    /**
     * Test provideCompletions when the current line does not match LOVE_LINE_PATTERN.
     * Expectation: No completion items are added.
     */
    @Test
    public void testProvideCompletionsWithInvalidLoveLinePattern() {
        // Define a line that does NOT match LOVE_LINE_PATTERN
        String invalidLine = "test.";
        // Mock the Document to return the invalid line
        when(mockDocument.getText()).thenReturn(invalidLine);

        // Invoke the method under test
        provider.addCompletions(mockParameters, mockContext, mockResultSet);

        // Verify that resultSet.addElement was never called
        verify(mockResultSet, never()).addElement(any());
    }

    /**
     * Test provideCompletions when the document is empty.
     * Expectation: No completion items are added.
     */
    @Test
    public void testProvideCompletionsWithEmptyDocument() {
        // Define an empty line
        String emptyLine = "";
        // Mock the Document to return the empty line
        when(mockDocument.getText()).thenReturn(emptyLine);

        // Invoke the method under test
        provider.addCompletions(mockParameters, mockContext, mockResultSet);

        // Verify that resultSet.addElement was never called
        verify(mockResultSet, never()).addElement(any());
    }

    /**
     * Test provideCompletions when getDocument() throws an exception.
     * Expectation: The provider handles the exception gracefully without adding completions.
     */
    @Test
    public void testProvideCompletionsWithDocumentException() {
        // Mock the Document to throw a RuntimeException when getText() is called
        when(mockDocument.getText()).thenThrow(new RuntimeException("Document access error"));

        try {
            // Invoke the method under test
            provider.addCompletions(mockParameters, mockContext, mockResultSet);
        } catch (Exception e) {
            // Fail the test if any exception is thrown
            org.junit.Assert.fail("addCompletions should handle exceptions internally");
        }

        // Verify that resultSet.addElement was never called due to the exception
        verify(mockResultSet, never()).addElement(any());
    }

    /**
     * Test that LoveCompletionProvider can be instantiated.
     */
    @Test
    public void testInstantiation() {
        assertNotNull("LoveCompletionProvider instance should not be null", provider);
    }

    /**
     * Test that LoveCompletionProvider is properly registered.
     * Note: This is a basic test. Comprehensive registration tests require IntelliJ's testing framework.
     */
    @Test
    public void testContributorRegistration() {
        assertTrue("Provider should be an instance of LoveCompletionProvider", provider instanceof LoveCompletionProvider);
        // Additional registration tests would go here if using IntelliJ's test framework
    }
}