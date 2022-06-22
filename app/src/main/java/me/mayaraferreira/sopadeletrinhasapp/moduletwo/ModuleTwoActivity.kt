package me.mayaraferreira.sopadeletrinhasapp.moduletwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.mayaraferreira.sopadeletrinhasapp.R
import me.mayaraferreira.sopadeletrinhasapp.moduletwo.calendarexercises.currentmonth.IsCurrentMonth
import me.mayaraferreira.sopadeletrinhasapp.moduletwo.calendarexercises.monthnameandnumber.IsCurrentMonthNameAndNumber
import me.mayaraferreira.sopadeletrinhasapp.moduletwo.countingexercises.divisibleby.IsDivisibleBy
import me.mayaraferreira.sopadeletrinhasapp.moduletwo.countingexercises.sorted.IsSorted

class ModuleTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_two)
        setupButton()
    }

    private fun setupButton() {
        findViewById<Button>(R.id.btn_module_two_calendar_ex1).setOnClickListener {
            navigateToCurrentMonthExercise()
        }
        findViewById<Button>(R.id.btn_module_two_calendar_ex2).setOnClickListener {
            navigateToCurrentMonthNameAndNumberExercise()
        }
        findViewById<Button>(R.id.btn_module_two_counting_ex1).setOnClickListener {
            navigateToDivisibleByExercise()
        }
        findViewById<Button>(R.id.btn_module_two_counting_ex2).setOnClickListener {
            navigateToIsSortedExercise()
        }
    }

    private fun navigateToCurrentMonthExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsCurrentMonth())
        }.commit()
    }

    private fun navigateToCurrentMonthNameAndNumberExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsCurrentMonthNameAndNumber())
        }.commit()
    }

    private fun navigateToDivisibleByExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsDivisibleBy())
        }.commit()
    }

    private fun navigateToIsSortedExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsSorted())
        }.commit()
    }
}