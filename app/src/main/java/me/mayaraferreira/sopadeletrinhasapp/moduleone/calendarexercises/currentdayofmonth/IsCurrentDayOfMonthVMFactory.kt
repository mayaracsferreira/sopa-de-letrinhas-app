package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class IsCurrentDayOfMonthVMFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IsCurrentDayOfMonthVM() as T
    }
}