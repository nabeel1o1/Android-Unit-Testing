package com.example.androidunittesting.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class StringTest {

    @Test
    fun testStringReversal_EmptyString_ExpectedEmptyString() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.reverseString("")
        assertEquals("", result)
    }

    @Test
    fun testStringReversal_SingleChar_ExpectedSingleChar() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.reverseString("a")
        assertEquals("a", result)
    }

    @Test
    fun testStringReversal_ValidInput_ExpectedReversedString() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.reverseString("Nabeel")
        assertEquals("leebaN", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testStringReversal_NullInput_ExpectedException() {
        val systemUnderTest = Helper()
        systemUnderTest.reverseString(null)
    }
}