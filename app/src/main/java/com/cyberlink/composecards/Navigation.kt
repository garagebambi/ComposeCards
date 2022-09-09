package com.cyberlink.composecards

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable

fun navigatot() {

    val navigat = rememberNavController()

    NavHost(navController = navigat, startDestination = "Menu") {

        composable("Menu") {

            menuScreen(navigat)


        }
        composable("Play in game") {

            cardGame()

        }

        composable("Settings") {

            Settings()

        }
    }


}