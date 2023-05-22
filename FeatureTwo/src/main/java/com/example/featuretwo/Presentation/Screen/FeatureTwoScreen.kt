package com.example.featuretwo.Presentation.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FeatureTwoScreen(navigateTo: (String) -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello Feature Two Screen",
//            modifier = modifier
        )

        Button(onClick = { navigateTo(NavigationItem.FeatureOneScreenItem.route) }) {
            Text(text = "FeatureTwoScreen TO FeatureOneScreen")

        }

    }
}