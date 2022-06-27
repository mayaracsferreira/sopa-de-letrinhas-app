package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.distinctdigitlist

import androidx.lifecycle.ViewModel
import me.mayaraferreira.moduleOne.ModuleOneFactory

class HasDistinctDigitsVM : ViewModel() {

    private val countingExercises = ModuleOneFactory.createCountingExercises()

    fun checkAnswer(element: Int): Boolean {
        return countingExercises.hasDistinctDigits(element)
    }
}