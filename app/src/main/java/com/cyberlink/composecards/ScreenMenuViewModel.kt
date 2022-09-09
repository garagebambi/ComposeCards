package com.cyberlink.composecards

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ScreenMenuViewModel: ViewModel() {

    val state = mutableStateOf(OurStates())


    fun exitBtn(){

        state.value.exitBtn = 1

        upDate()


    }

    fun exitBtnNo(){

        state.value.exitBtn = 0

        upDate()

    }










    fun upDate() {

        val copy = state.value.copy()
        copy.worker = copy.worker + 1
        state.value = copy
    }







}

data class OurStates(

    var exitBtn: Int = 0,
    var worker: Int = 0,


)