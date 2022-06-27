package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentweek

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class IsCurrentWeekVMFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IsCurrentWeekVM() as T
    }
}