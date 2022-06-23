package me.mayaraferreira.sopadeletrinhasapp.moduleone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.mayaraferreira.sopadeletrinhasapp.R
import me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth.IsCurrentDayOfMonthFragment
import me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentweek.IsCurrentWeekFragment
import me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.completethelist.CompleteTheListFragment
import me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.distinctdigitlist.IsDistinctDigitList

class ModuleOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_one)
        setupButton()
    }

    private fun setupButton() {
        findViewById<Button>(R.id.btn_module_one_calendar_ex1).setOnClickListener {
            navigateToCurrentDayOfMonthExercise()
        }
        findViewById<Button>(R.id.btn_module_one_calendar_ex2).setOnClickListener {
            navigateToCurrentWeekExercise()
        }
        findViewById<Button>(R.id.btn_module_one_counting_ex1).setOnClickListener {
            navigateToCompleteTheListExercise()
        }
        findViewById<Button>(R.id.btn_module_one_counting_ex2).setOnClickListener {
            navigateToIsDistinctDigitExercise()
        }
    }

    private fun navigateToCurrentDayOfMonthExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsCurrentDayOfMonthFragment())
        }.commit()
    }

    private fun navigateToCurrentWeekExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsCurrentWeekFragment())
        }.commit()
    }

    private fun navigateToCompleteTheListExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, CompleteTheListFragment())
        }.commit()
    }

    private fun navigateToIsDistinctDigitExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(android.R.id.content, IsDistinctDigitList())
        }.commit()
    }
}