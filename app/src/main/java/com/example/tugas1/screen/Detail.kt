package com.example.tugas1.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import androidx.compose.material3.Text


@Composable
fun Detail(content: Content?) {
    if (content != null) {
        Column {
            Text(text = content.title)
            Text(text = content.desc)
//            AsyncImage(
//                model = content.image,
//                contentDescription = content.newdetail
//            )
        }
    } else {


}}