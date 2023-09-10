package com.prateek.foodcalorietrackerapp.navigation

import androidx.navigation.NavController
import com.prateek.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}