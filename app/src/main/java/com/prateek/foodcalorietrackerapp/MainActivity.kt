package com.prateek.foodcalorietrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.prateek.foodcalorietrackerapp.ui.theme.CaloryTrackerTheme
import com.prateek.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                WelcomeScreen()
            }
        }
    }
}
