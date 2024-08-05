package com.forsythe.basictemplatemvvm.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.forsythe.basictemplatemvvm.presentation.screens.mainScreen.MainScreen

fun NavGraphBuilder.mainScreenNav(
    navHostController: NavHostController

){
    composable(route = NavigationRoutes.MainScreen.route){
        MainScreen(navHostController)
    }
}