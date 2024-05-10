package com.example.tugas1.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import com.example.tugas1.R

@Composable

fun About(name: String, modifier: Modifier = Modifier) {
    Column {
    Text(
        text = " $name!",
        modifier = modifier
    )
    Image(
        painter = painterResource(id = R.drawable.image),
        contentDescription = "Deskripsi gambar"
    )


}}