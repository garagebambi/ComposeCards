package com.cyberlink.composecards

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CardViewModel : ViewModel() {

    val state = mutableStateOf(OurState())

    init {
        state.value.cards.shuffle()
    }

    fun click(index: Int) {

        if (state.value.clicalibleCheck == true) {

            state.value.awords[index] = state.value.cards[index]

            upDate()
            GlobalScope.launch {

                state.value.clicalibleCheck = false


                if (state.value.firstClick == true) {

                    state.value.firstClick = false
                    state.value.openIndex = index

                } else {
                    delay(1000)

                    if (state.value.cards[index] == state.value.cards[state.value.openIndex]) {

                        state.value.awords[state.value.openIndex] = 0
                        state.value.awords[index] = 0

                    } else {

                        if (SettingsData.cardBtns == 0){

                            state.value.awords[state.value.openIndex] = R.drawable.a_card
                            state.value.awords[index] = R.drawable.a_card

                        }else{

                            state.value.awords[state.value.openIndex] = R.drawable.q_card
                            state.value.awords[index] = R.drawable.q_card

                        }


                    }
                    state.value.firstClick = true

                }

                state.value.clicalibleCheck = true

                cheker()
                upDate()


            }

        }

        cheker()


    }

    fun cheker() {

        for (i in 0..11) {

            if (SettingsData.cardBtns == 0){


                if (state.value.awords[i] == R.drawable.a_card) {

                    return


                }

            }else{


                if (state.value.awords[i] == R.drawable.q_card) {

                    return


                }

            }

        }
        GlobalScope.launch {

            delay(1000)
            state.value.restartView = false

            upDate()

        }


    }

    fun restartBtn() {

        GlobalScope.launch {

            delay(400)

            state.value.restartView = true
            state.value.clicalibleCheck = true
            state.value.firstClick = true
            state.value.openIndex = -1
            state.value.awords = if (SettingsData.cardBtns == 0) {

                mutableListOf(
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                    R.drawable.a_card,
                )

            } else {

                mutableListOf(
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                    R.drawable.q_card,
                )
            }

            state.value.cards = mutableListOf(
                R.drawable.ten, R.drawable.ten, R.drawable.book,
                R.drawable.book, R.drawable.bear, R.drawable.bear, R.drawable.olen, R.drawable.olen,
                R.drawable.wolf, R.drawable.wolf, R.drawable.eagle, R.drawable.eagle
            )

            state.value.cards.shuffle()

            upDate()
        }
    }

    fun upDate() {

        val copy = state.value.copy()
        copy.worker = copy.worker + 1
        state.value = copy
    }


}

data class OurState(

    var restartView: Boolean = true,
    var clicalibleCheck: Boolean = true,
    var openIndex: Int = -1,
    var firstClick: Boolean = true,
    var flag: Int = -1,
    var worker: Int = 0,
    var cards: MutableList<Int> = mutableListOf(
        R.drawable.ten, R.drawable.ten, R.drawable.book,
        R.drawable.book, R.drawable.bear, R.drawable.bear, R.drawable.olen, R.drawable.olen,
        R.drawable.wolf, R.drawable.wolf, R.drawable.eagle, R.drawable.eagle
    ),

    var awords: MutableList<Int> = if (SettingsData.cardBtns == 0) {

        mutableListOf(
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
            R.drawable.a_card,
        )

    } else {

        mutableListOf(
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
            R.drawable.q_card,
        )
    }
)

