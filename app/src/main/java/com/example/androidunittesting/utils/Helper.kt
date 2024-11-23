package com.example.androidunittesting.utils

class Helper {

    fun isPallindrome(input: String) : Boolean {
        var i = 0
        var j = input.length - 1
        var result = true

        while (i < j) {
            if (input[i] != input[j]) {
                result = false
                break
            }
            i++
            j--
        }
        return result
    }

    fun validatePassword(input: String) = when {
        input.isBlank() -> {
            "Password is required"
        }
        input.length < 6 -> {
            "Length of password should be greater than 6"
        }
        input.length > 15 -> {
            "Length of password should be less than 15"
        }
        else -> {
            "Valid"
        }
    }

    fun reverseString(input: String?) : String {
        if (input == null)
            throw IllegalArgumentException("Valid input is require")
        val charArray = input.toCharArray()
        var i = 0
        var j = charArray.size - 1
        while (i < j) {
            val temp = charArray[i]
            charArray[i] = charArray[j]
            charArray[j] = temp
            i++
            j--
        }
        return charArray.joinToString("")
    }
}