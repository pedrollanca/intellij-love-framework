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
import com.intellij.lang.Language;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test class for LoveCompletionContributor.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoveCompletionContributorTest {

    private MockedStatic<PluginUtils> mockedPluginUtils;

    @Before
    public void setUp() {
        // Initialize the mock for PluginUtils
        mockedPluginUtils = Mockito.mockStatic(PluginUtils.class);
    }

    @After
    public void tearDown() {
        // Close the mock to avoid memory leaks
        mockedPluginUtils.close();
    }

    /**
     * Test that LoveCompletionContributor can be instantiated when EmmyLua is not active.
     */
    @Test
    public void testInstantiationWithEmmyLuaInactive() {
        // Mock PluginUtils.getLuaLanguage() to return null, simulating EmmyLua being inactive
        mockedPluginUtils.when(PluginUtils::isEmmyLuaActive).thenReturn(false);
        mockedPluginUtils.when(PluginUtils::getLuaLanguage).thenReturn(null);

        // Instantiate the contributor
        CompletionContributor contributor = new LoveCompletionContributor();

        // Assertions
        assertNotNull("LoveCompletionContributor instance should not be null", contributor);
        assertTrue("Contributor should be an instance of CompletionContributor", contributor instanceof CompletionContributor);
    }

    /**
     * Test that LoveCompletionContributor can be instantiated when EmmyLua is active.
     */
    @Test
    public void testInstantiationWithEmmyLuaActive() {
        // Mock PluginUtils.getLuaLanguage() to return a mock Language instance
        // Assuming LoveLanguage is a subclass of Language; otherwise, replace with an appropriate mock
        Language mockLanguage = Mockito.mock(Language.class);
        mockedPluginUtils.when(PluginUtils::isEmmyLuaActive).thenReturn(true);
        mockedPluginUtils.when(PluginUtils::getLuaLanguage).thenReturn(mockLanguage);

        // Instantiate the contributor
        CompletionContributor contributor = new LoveCompletionContributor();

        // Assertions
        assertNotNull("LoveCompletionContributor instance should not be null", contributor);
        assertTrue("Contributor should be an instance of CompletionContributor", contributor instanceof CompletionContributor);
    }

    /**
     * Test that LoveCompletionContributor registers correctly.
     * Note: Comprehensive testing requires IntelliJ's testing framework.
     */
    @Test
    public void testContributorRegistration() {
        // Mock PluginUtils methods
        Language mockLanguage = Mockito.mock(Language.class);
        mockedPluginUtils.when(PluginUtils::isEmmyLuaActive).thenReturn(true);
        mockedPluginUtils.when(PluginUtils::getLuaLanguage).thenReturn(mockLanguage);

        // Instantiate the contributor
        CompletionContributor contributor = new LoveCompletionContributor();

        // Assertions
        assertNotNull("LoveCompletionContributor instance should not be null", contributor);
        assertTrue("Contributor should be an instance of CompletionContributor", contributor instanceof CompletionContributor);

        // Additional registration tests would require IntelliJ's testing framework (e.g., LightPlatformTestCase)
    }
}