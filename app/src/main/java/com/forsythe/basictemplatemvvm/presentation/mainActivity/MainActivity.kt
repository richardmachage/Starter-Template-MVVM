package com.forsythe.basictemplatemvvm.presentation.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.forsythe.basictemplatemvvm.data.remote.network.client.KtorClient
import com.forsythe.basictemplatemvvm.presentation.navigation.NavigationRoutes
import com.forsythe.basictemplatemvvm.presentation.navigation.mainScreenNav
import com.forsythe.basictemplatemvvm.presentation.ui.theme.BasicTemplateMVVMTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mainActivityViewModel by viewModels<MainActivityViewModel>()
            val navController = rememberNavController()
            BasicTemplateMVVMTheme {

                NavHost(
                        navController = navController,
                        startDestination = NavigationRoutes.MainScreen.route
                    ) {
                        mainScreenNav(navController)
                    }
                }
            }
        }
    }

