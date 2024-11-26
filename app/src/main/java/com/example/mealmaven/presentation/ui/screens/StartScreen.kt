package com.example.mealmaven.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mealmaven.R
import com.example.mealmaven.presentation.ui.theme.Black
import com.example.mealmaven.presentation.ui.theme.MealMavenTheme
import com.example.mealmaven.presentation.ui.theme.Typography
import com.example.mealmaven.presentation.ui.theme.White

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(R.drawable.doodle_bg),
                contentDescription = "Background",
                modifier = modifier
                    .fillMaxSize()
            )

            Box(
                modifier = modifier
                    .fillMaxSize()
                    .graphicsLayer(alpha = 0.9f)
                    .background(White)

            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.app_logo),
                    contentDescription = "App Icon",
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "Meal Maven",
                    color = Black,
                    style = Typography.titleMedium
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    MealMavenTheme {
        StartScreen()
    }
}
