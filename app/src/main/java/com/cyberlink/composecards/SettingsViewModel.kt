package com.cyberlink.composecards

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    val state = mutableStateOf(OurStatej())


    fun upDate() {

        val copy = state.value.copy()
        copy.worker = copy.worker + 1
        state.value = copy
    }

    fun plusBtn(){

        state.value.backBtns = 1
        SettingsData.backBtns = 1

        upDate()
    }

    fun minusBtn(){

        state.value.backBtns = 0
        SettingsData.backBtns = 0

        upDate()
    }

    fun changeCardpls(){

        state.value.cardBtns = 1
        SettingsData.cardBtns = 1

        upDate()


    }

    fun changeCardMinus(){

        state.value.cardBtns = 0
        SettingsData.cardBtns = 0

        upDate()



    }




}


data class OurStatej(
    var cardBtns: Int = SettingsData.cardBtns,
    var backBtns: Int = SettingsData.backBtns,
    var bg1: Int = R.drawable.bg_1,
    var bg2: Int = R.drawable.bg_2,
    var aCard: Int = R.drawable.a_card,
    var qCard: Int = R.drawable.q_card,
    var worker: Int = 0,
)