package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import me.mayaraferreira.moduleOne.ModuleOneFactory

@Suppress("UNCHECKED_CAST")
class IsCurrentDayOfMonthVMFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IsCurrentDayOfMonthVM() as T
    }
}

class IsCurrentDayOfMonthVM : ViewModel() {

    private val calendarExercises = ModuleOneFactory.createCalendarExercises()

    fun checkAnswer(currentDay: String?): Boolean {
        val currentDayInInt = currentDay?.toIntOrNull() ?: 0
        return calendarExercises.isCurrentDayOfMonth(currentDayInInt)
    }
}