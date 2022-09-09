package com.cyberlink.composecards

import android.app.Activity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@Composable

fun menuScreen(navigat: NavHostController, screenMenuViewModel: ScreenMenuViewModel = viewModel()) {

    val context = LocalContext.current

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

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {


                    Card(
                        modifier = Modifier
                            .size(220.dp, 80.dp),
                        backgroundColor = Color.Transparent,
                        elevation = 30.dp,
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(20.dp)

                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {

                                    navigat.navigate("Play in game")

                                }

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.button_2),
                                contentDescription = "",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )

                            Text(
                                text = "PLAY",
                                fontSize = 35.sp,
                                color = Color.White,
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
                            .size(220.dp, 80.dp),
                        backgroundColor = Color.Transparent,
                        elevation = 30.dp,
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(20.dp)

                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.button_2),
                                contentDescription = "",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )

                            Text(
                                text = "SETTINGS",
                                fontSize = 35.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Center)
                                    .clickable {

                                        navigat.navigate("Settings")

                                    }
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
                            .size(220.dp, 80.dp),
                        backgroundColor = Color.Transparent,
                        elevation = 30.dp,
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(20.dp)

                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {

                                    screenMenuViewModel.exitBtn()

                                }

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.button_2),
                                contentDescription = "",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )

                            Text(
                                text = "EXIT",
                                fontSize = 35.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Center)
                            )

                        }
                    }


                }


            }

            if (screenMenuViewModel.state.value.exitBtn == 1){

                Card(
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp)
                        .fillMaxWidth()
                        .height(500.dp)
                        .align(Center)
                        .alpha(0.9f),
                    backgroundColor = Color.Red,
                    border = BorderStroke(2.dp, Color.Yellow),
                    shape = RoundedCornerShape(30.dp),
                    elevation = 30.dp
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Center),
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {

                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f)
                                        .height(80.dp),
                                    backgroundColor = Color.Red,
                                    border = BorderStroke(2.dp, Color.Yellow),
                                    shape = RoundedCornerShape(30.dp),
                                    elevation = 30.dp
                                ) {

                                    Box(modifier = Modifier.fillMaxSize()) {

                                        Text(
                                            text = "Are you sure?",
                                            fontSize = 30.sp,
                                            color = Color.White,
                                            textAlign = TextAlign.Center,

                                            )

                                    }

                                }


                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {

                                Card(
                                    modifier = Modifier
                                        .size(130.dp, 80.dp),
                                    backgroundColor = Color.Green,
                                    border = BorderStroke(2.dp, Color.Yellow),
                                    shape = RoundedCornerShape(30.dp),
                                    elevation = 30.dp
                                ) {

                                    Box(modifier = Modifier
                                        .fillMaxSize()
                                        .clickable {

                                            (context as Activity).finish()

                                        }) {

                                        Text(
                                            text = "Yes",
                                            fontSize = 30.sp,
                                            color = Color.White,
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier
                                                .align(Center)
                                        )

                                    }

                                }
                                Card(
                                    modifier = Modifier
                                        .size(130.dp, 80.dp),
                                    backgroundColor = Color.Black,
                                    border = BorderStroke(2.dp, Color.Yellow),
                                    shape = RoundedCornerShape(30.dp),
                                    elevation = 30.dp
                                ) {

                                    Box(modifier = Modifier
                                        .fillMaxSize()
                                        .clickable {

                                            screenMenuViewModel.exitBtnNo()

                                        }) {

                                        Text(
                                            text = "No",
                                            fontSize = 30.sp,
                                            color = Color.White,
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier
                                                .align(Center)
                                        )

                                    }

                                }


                            }

                        }

                    }


                }



            }




        }

    }


}