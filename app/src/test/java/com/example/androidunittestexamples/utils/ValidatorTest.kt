package com.example.androidunittestexamples.utils

import org.junit.Assert.*
import org.junit.Test

class ValidatorTest {

    @Test
    fun validatePassword_blank_expectedRequired() {
        val sut = Validator()
        val result = sut.validatePassword("  ")
        assertEquals("Password is required field", result)
    }

    @Test
    fun validatePassword_2CharLong_expectedLengthErr() {
        val sut = Validator()
        val result = sut.validatePassword(" .")
        assertEquals("Length of the password should be greater than 6", result)
    }

    @Test
    fun validatePassword_CorrectPass_expectedValid() {
        val sut = Validator()
        val result = sut.validatePassword("Pass123")
        assertEquals("Valid", result)
    }

    @Test
    fun reverseString() {
        val sut = Validator()
        val result = sut.reverseString("")
        assertEquals("", result)
    }

    @Test
    fun reverseString_singlechar_samechar() {
        val sut = Validator()
        val result = sut.reverseString("a")
        println(result)
        assertEquals("a", result)
    }

    @Test
    fun reverseString_validInput_ReversedInput() {
        val sut = Validator()
        val result = sut.reverseString("ABC")
        println(result)
        assertEquals("CBA", result)
    }
}