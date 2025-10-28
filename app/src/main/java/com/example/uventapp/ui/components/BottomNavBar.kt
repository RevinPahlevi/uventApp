package com.example.uventapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavController
import com.example.uventapp.R

data class BottomNavItem(val route: String, val icon: Int, val label: String)

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(
        BottomNavItem("home", R.drawable.home, "Home"),
        BottomNavItem("event", R.drawable.appointment, "Event Saya"),
        BottomNavItem("notification", R.drawable.bell, "Notifikasi"),
        BottomNavItem("profile", R.drawable.user, "Akun")
    )

    NavigationBar(containerColor = MaterialTheme.colorScheme.primary) {
        items.forEach { item ->
            NavigationBarItem(
                selected = false,
                onClick = { navController.navigate(item.route) },
                icon = { Icon(ImageVector.vectorResource(id = item.icon), contentDescription = item.label) },
                label = { Text(item.label) }
            )
        }
    }
}