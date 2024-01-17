package com.example.trivialapp

import LaunchScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.poketrivia.Routes
import com.example.poketrivia.ui.theme.PoketriviaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContent {
            PoketriviaTheme{
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.SplashScreen.route
                ) {
                    composable(Routes.SplashScreen.route) { LaunchScreen(navigationController) }
                    composable(Routes.MenuScreen.route) { Routes.MenuScreen }
                }
            }
        }
    }
}


