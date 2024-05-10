package com.example.tugas1.controller


sealed class Screens (val screen: String){
    object Home : Screens("home")
    object About : Screens("about")
    object List : Screens("list")
    object Detail : Screens("detail/{contentTitle}") {
        const val ARG_CONTENT_IMAGE_URL = "contentTitle"

    }
}