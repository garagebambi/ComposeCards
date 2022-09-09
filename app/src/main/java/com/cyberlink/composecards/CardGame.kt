package com.cyberlink.composecards

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun cardGame(cardViewModel: CardViewModel = viewModel()) {


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        if (SettingsData.backBtns == 0) {

            Image(
                painter = painterResource(id = R.drawable.bg_1),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(), contentScale = ContentScale.FillBounds

            )

        } else {

            Image(
                painter = painterResource(id = R.drawable.bg_2),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(), contentScale = ContentScale.FillBounds

            )
        }

        Box(
            modifier = Modifier
                .padding(top = 45.dp, bottom = 45.dp, start = 10.dp, end = 10.dp)
                .fillMaxSize()
                .background(color = Color(0x40FFFFFF))
        ) {

            if (cardViewModel.state.value.restartView == true) {


                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly

                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {

                        if (cardViewModel.state.value.awords[0] != 0) {

                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[0]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(0)

                                    }
                            )

                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }

                        if (cardViewModel.state.value.awords[1] != 0) {


                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[1]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(1)

                                    }
                            )

                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }


                        if (cardViewModel.state.value.awords[2] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[2]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(2)

                                    }
                            )

                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }

                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {


                        if (cardViewModel.state.value.awords[3] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[3]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(3)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }


                        if (cardViewModel.state.value.awords[4] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[4]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(4)

                                    }
                            )

                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }
                        if (cardViewModel.state.value.awords[5] != 0) {

                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[5]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(5)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }

                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        if (cardViewModel.state.value.awords[6] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[6]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(6)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }
                        if (cardViewModel.state.value.awords[7] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[7]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(7)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }
                        if (cardViewModel.state.value.awords[8] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[8]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(8)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }

                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        if (cardViewModel.state.value.awords[9] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[9]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(9)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }
                        if (cardViewModel.state.value.awords[10] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[10]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(10)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }
                        if (cardViewModel.state.value.awords[11] != 0) {
                            Image(
                                painter = painterResource(cardViewModel.state.value.awords[11]),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(85.dp)
                                    .clickable {

                                        cardViewModel.click(11)

                                    }
                            )
                        } else {


                            Spacer(modifier = Modifier.size(85.dp))

                        }

                    }


                }

            } else {

                Column(
                    modifier = Modifier
                        .padding(top = 40.dp, bottom = 40.dp)
                        .fillMaxSize()
                        .align(Center),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {


                        Card(
                            modifier = Modifier
                                .size(250.dp, 100.dp),
                            elevation = 30.dp,
                            backgroundColor = Color(0XFFcd853f),
                            border = BorderStroke(2.dp, Color.Yellow),
                            shape = RoundedCornerShape(30.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {

                                Text(
                                    text = "YOU WIN",
                                    color = Color.White,
                                    fontSize = 35.sp,
                                    fontFamily = FontFamily.Cursive,
                                    modifier = Modifier
                                        .align(Center)
                                )


                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Card(
                            modifier = Modifier
                                .size(250.dp, 100.dp),
                            backgroundColor = Color.Transparent,
                            elevation = 30.dp,
                            border = BorderStroke(2.dp, Color.Yellow),
                            shape = RoundedCornerShape(30.dp)

                        ) {
                            Box(
                                modifier = Modifier
                                    .clickable {

                                        cardViewModel.restartBtn()

                                    }
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.button),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .fillMaxSize()

                                )

                                Text(
                                    text = "RESTART", fontSize = 40.sp,
                                    modifier = Modifier
                                        .align(Center),
                                    color = Color.White,
                                    fontFamily = FontFamily.Cursive

                                )
                            }

                        }
                    }

                }


            }




        }

    }


}






