package com.example.androidunittesting.utils

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setup() {
        println("Before every test case")
        //Arrange
        helper = Helper()
    }

    @After
    fun tearDown() {
        println("After every test case")
    }

    @Test
    fun isPallindrome() {
        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPallindrome_inputString_level_expectedTrue() {
        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(true, result)
    }
}