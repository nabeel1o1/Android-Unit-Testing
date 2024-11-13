package com.example.androidunittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException


class QuoteManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        val quoteManager = QuoteManager()
        val context  = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context, "quotes.json")
    }
}