package com.example.androidunittestexamples.utils

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPallindrome() {

        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false, result)

    }


    @Test
    fun isPallindrome_inputString_level_expectedTrue() {

        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(true, result)

    }
}