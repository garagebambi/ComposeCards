package com.cyberlink.composecards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Settings(settingsViewModel: SettingsViewModel = viewModel()) {


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        if (settingsViewModel.state.value.backBtns == 0) {

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
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Card(
                        modifier = Modifier
                            .size(350.dp, 130.dp),
                        border = BorderStroke(2.dp, Color.Yellow),
                        backgroundColor = Color.Transparent,
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {

                            if (settingsViewModel.state.value.backBtns == 0) {
                                Image(
                                    painter = painterResource(settingsViewModel.state.value.bg1),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            } else {

                                Image(
                                    painter = painterResource(settingsViewModel.state.value.bg2),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            }

                        }

                    }

                }

                Row(
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Card(
                        modifier = Modifier
                            .size(65.dp, 65.dp),
                        backgroundColor = Color(0XFFcd853f),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {

                                    settingsViewModel.minusBtn()


                                }
                        ) {

                            Text(
                                text = "-",
                                fontSize = 40.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }
                    }

                    Card(
                        modifier = Modifier
                            .size(150.dp, 65.dp),
                        backgroundColor = Color(0xFFEC682A),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {

                            Text(
                                text = "Choose backgraund",
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }

                    }

                    Card(
                        modifier = Modifier
                            .size(65.dp, 65.dp),
                        backgroundColor = Color(0XFFcd853f),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {

                                    settingsViewModel.plusBtn()

                                }

                        ) {

                            Text(
                                text = "+",
                                fontSize = 40.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }
                    }


                }

                Row(
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Card(
                        modifier = Modifier
                            .size(145.dp, 149.dp),
                        border = BorderStroke(2.dp, Color.Yellow),
                        backgroundColor = Color.Transparent,
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {

                            if (SettingsData.cardBtns == 0) {
                                Image(
                                    painter = painterResource(settingsViewModel.state.value.aCard),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            } else {

                                Image(
                                    painter = painterResource(settingsViewModel.state.value.qCard),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .fillMaxSize()
                                )

                            }

                        }

                    }


                }

                Row(
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Card(
                        modifier = Modifier
                            .size(65.dp, 65.dp),
                        backgroundColor = Color(0XFFcd853f),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    settingsViewModel.changeCardMinus()

                                }
                        ) {

                            Text(
                                text = "-",
                                fontSize = 40.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }
                    }

                    Card(
                        modifier = Modifier
                            .size(150.dp, 65.dp),
                        backgroundColor = Color(0xFFEC682A),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {

                            Text(
                                text = "Choose Card",
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }

                    }

                    Card(
                        modifier = Modifier
                            .size(65.dp, 65.dp),
                        backgroundColor = Color(0XFFcd853f),
                        border = BorderStroke(2.dp, Color.Yellow),
                        shape = RoundedCornerShape(30.dp),
                        elevation = 30.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    settingsViewModel.changeCardpls()

                                }
                        ) {

                            Text(
                                text = "+",
                                fontSize = 40.sp,
                                modifier = Modifier
                                    .align(Alignment.Center),
                                textAlign = TextAlign.Center
                            )

                        }
                    }


                }
            }

        }


    }


}




