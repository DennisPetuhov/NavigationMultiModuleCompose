package com.example.featureone.Presentation.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment




    @Composable
    fun FeatureOneScreen(navigateTo: (String) -> Unit) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello Feature One Screen",
//            modifier = modifier
            )
            Button(onClick = { navigateTo(NavigationItem.FeatureTwoScreenItem.route) }) {
                Text(text = "FeatureOneScreen TO FeatureTwoScreen" )

            }
            Button(onClick = { navigateTo(NavigationItem.FeatureThreeScreenItem.route) }) {
                Text(text = "FeatureOneScreen TO FeatureThreeScreen" )

            }


        }
    }
