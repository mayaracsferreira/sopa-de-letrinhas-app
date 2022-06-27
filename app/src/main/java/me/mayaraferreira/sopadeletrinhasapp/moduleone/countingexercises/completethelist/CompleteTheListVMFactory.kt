package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.completethelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class CompleteTheListVMFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CompleteTheListVM() as T
    }
}