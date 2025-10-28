package com.example.uventapp.ui.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.uventapp.ui.components.BottomNavBar
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f)) {
            Text("Selamat Datang di U-Vent", modifier = Modifier.padding(16.dp))
        }
        BottomNavBar(navController)
    }
}