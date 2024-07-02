package com.example.semana02

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun ejemploRow(){
        Row(
            Modifier = Modifier
                .fillMaxSize()
                .horizontalScroll(remenberScrollState),


        ){

        }
}