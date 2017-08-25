package com.lli.kotlin.service

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class MyServiceImplTest {
    private lateinit var testInstance: MyServiceImpl

    @Before
    fun initTestCase() {
        testInstance = MyServiceImpl("testEnv")
    }

    @Test
    fun convertName() {
        val result = testInstance.convertName("the")
        assertEquals("THE testEnv", result)
    }

}