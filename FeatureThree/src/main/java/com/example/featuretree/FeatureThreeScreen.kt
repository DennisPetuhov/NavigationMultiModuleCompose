package com.example.featuretree

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun FeatureThreeScreen(navigateTo: (String) -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello Feature Three Screen",
//            modifier = modifier
        )

        Button(onClick = { navigateTo(NavigationItem.FeatureOneScreenItem.route )}) {
            Text(text = "FeatureThreeScreen TO FeatureOneScreen" )

        }

    }
}