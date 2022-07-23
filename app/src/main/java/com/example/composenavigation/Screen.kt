package com.example.composenavigation

sealed class Screen(val route: String){
    object Home :Screen(route = "home_screen")
    object SecondScreen :Screen(route = "detail_screen")
}
