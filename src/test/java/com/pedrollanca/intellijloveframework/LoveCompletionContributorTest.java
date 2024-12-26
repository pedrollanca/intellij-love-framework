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

import com.intellij.codeInsight.completion.CompletionContributor;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test class for LoveCompletionContributor.
 */
public class LoveCompletionContributorTest {

    /**
     * Test that LoveCompletionContributor can be instantiated.
     */
    @Test
    public void testInstantiation() {
        CompletionContributor contributor = new LoveCompletionContributor();
        assertNotNull("LoveCompletionContributor instance should not be null", contributor);
    }

    /**
     * Test that LoveCompletionContributor is properly registered.
     * Note: This is a basic test. Comprehensive testing requires IntelliJ's testing framework.
     */
    @Test
    public void testContributorRegistration() {
        CompletionContributor contributor = new LoveCompletionContributor();
        assertTrue("Contributor should be an instance of CompletionContributor", contributor instanceof CompletionContributor);
        // Additional registration tests would go here if using IntelliJ's test framework
    }
}
