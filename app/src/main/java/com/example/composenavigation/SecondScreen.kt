package com.example.composenavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SecondScreen(navHostController: NavHostController, name: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.navigate(Screen.Home.route)
//                navHostController.popBackStack()
            },
            text = "Hello $name",
            color = Color.Gray,
            style = MaterialTheme.typography.h5
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SecondScreenPreview(){
    SecondScreen(rememberNavController(),"")
}