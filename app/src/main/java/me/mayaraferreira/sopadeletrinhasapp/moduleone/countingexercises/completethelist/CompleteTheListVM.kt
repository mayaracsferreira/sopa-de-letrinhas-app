package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.completethelist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.mayaraferreira.moduleOne.ModuleOneFactory
import java.lang.Exception

class CompleteTheListVM : ViewModel() {

    private val countingExercises = ModuleOneFactory.createCountingExercises()
    val result: MutableLiveData<Boolean?> = MutableLiveData(null)

    fun checkAnswer(
        missingValuesList: MutableList<Int?>,
        filledNumbersList: List<Int>
    ) {
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        try {
            result.postValue(
                countingExercises.completeTheList(
                    expected,
                    missingValuesList,
                    filledNumbersList
                )
            )
        } catch (exception: Exception) {
            result.postValue(null)
            Log.e(this::class.java.name, exception.message.toString())
        }
    }
}