package com.example.tugas1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.tugas1.controller.Screens
import com.example.tugas1.screen.About
import com.example.tugas1.screen.Detail
import com.example.tugas1.screen.Home
import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas1Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Navigation()
//                    Greeting("Android")
                }
            }
        }
    }
}@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()

            when (val currentRoute = navBackStackEntry?.destination?.route) {
                Screens.Home.screen -> Text("Home")
                Screens.About.screen -> Text("About")

                Screens.Detail.screen -> {
                    val contentImageUrl = navBackStackEntry?.arguments?.getString(Screens.Detail.ARG_CONTENT_IMAGE_URL)
                    Text("Detail: $contentImageUrl")
                }
                else -> Text("Other")
            }
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    var navController = rememberNavController()
    Scaffold(
    topBar = {
       MyTopAppBar(navController = navController)
    },
        bottomBar = {
            Row {
                TextButton(onClick = {
                    navController.navigate(Screens.Home.screen)
//
                }) {
                    Text(text = "Home")
                }

                TextButton(onClick = {
                    navController.navigate(Screens.About.screen)
//
                }) {

                    Text(text = "About")
                }

                TextButton(onClick = {
                    navController.navigate(Screens.List.screen)
//
                }) {
                    Text("")
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screen) { Home(navController = navController) }
            composable(Screens.About.screen) {com.example.tugas1.screen.About(name = "Nama  Abdul Azis AL-ghifari      " +
                    "                        " +
                    " Universitas Komputer Indonesia, " +
                    "" +
                    "Teknik Informatika, " +
                    "" +
                    "Abdul.10121125@mahasiswa.unikom.ac.id") }
            composable(Screens.List.screen) { com.example.tugas1.screen.List(name = "list") }
            composable(Screens.Detail.screen) { backStackEntry ->
                val contentTitle = backStackEntry.arguments?.getString("title")
//
//                Detail(contentImageUrl = contentTitle)
            }

        }
    }
}
