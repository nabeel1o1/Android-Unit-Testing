package com.example.androidunittesting.utils

import org.junit.Assert
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_InputBlank_ExpectedRequired() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.validatePassword( " ")
        Assert.assertEquals("Password is required", result)
    }

    @Test
    fun validatePassword_2CharInput_ExpectedValidationMsg() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.validatePassword( "an")
        Assert.assertEquals("Length of password should be greater than 6", result)
    }

    @Test
    fun validatePassword_CorrectInput_ExpectedValidPassword() {
        val systemUnderTest = Helper()
        val result = systemUnderTest.validatePassword( "anasdfsdfa")
        Assert.assertEquals("Valid", result)
    }
}