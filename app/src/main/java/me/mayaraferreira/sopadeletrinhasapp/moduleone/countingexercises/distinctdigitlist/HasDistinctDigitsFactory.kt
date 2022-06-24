package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.distinctdigitlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class HasDistinctDigitsFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HasDistinctDigitsVM() as T
    }
}