package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth

import androidx.lifecycle.ViewModel
import me.mayaraferreira.moduleOne.ModuleOneFactory

class IsCurrentDayOfMonthVM : ViewModel() {

    private val calendarExercises = ModuleOneFactory.createCalendarExercises()

    fun checkAnswer(currentDay: String?): Boolean {
        val currentDayInInt = currentDay?.toIntOrNull() ?: 0
        return calendarExercises.isCurrentDayOfMonth(currentDayInInt)
    }
}