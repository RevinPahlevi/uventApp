package com.example.uventapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.uventapp.ui.navigation.NavGraph
import com.example.uventapp.ui.theme.UventAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UventAppTheme {
                val navController = rememberNavController()
                NavGraph(navController)
            }
        }
    }
}
