package com.example.twes2

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class HesaplaTest {

    private lateinit var hesapla: Hesapla

    @Before
    fun setup(){
        hesapla = Hesapla()
    }

    @Test
    fun calculateTest(){

        val sonuc = hesapla.calculate(10,20)
        assertThat(sonuc).isEqualTo(30)
    }
}