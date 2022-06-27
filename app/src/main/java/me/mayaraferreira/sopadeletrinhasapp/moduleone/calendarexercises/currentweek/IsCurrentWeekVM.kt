package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentweek

import androidx.lifecycle.ViewModel
import me.mayaraferreira.moduleOne.ModuleOneFactory

class IsCurrentWeekVM : ViewModel() {

    private val calendarExercises = ModuleOneFactory.createCalendarExercises()

    fun checkAnswer(currentWeek: List<Int>): Boolean {
        return calendarExercises.isCurrentWeek(currentWeek)
    }
}