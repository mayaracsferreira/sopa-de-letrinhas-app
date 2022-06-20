package me.mayaraferreira.sopadeletrinhasapp.moduleone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import me.mayaraferreira.sopadeletrinhasapp.R
import me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth.IsCurrentDayOfMonth
import me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentweek.IsCurrentWeek
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
            add(R.id.linear_module_one, IsCurrentDayOfMonth())
        }.commit()
    }

    private fun navigateToCurrentWeekExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.linear_module_one, IsCurrentWeek())
        }.commit()
    }

    private fun navigateToCompleteTheListExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.linear_module_one, CompleteTheListFragment())
        }.commit()
    }

    private fun navigateToIsDistinctDigitExercise() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.linear_module_one, IsDistinctDigitList())
        }.commit()
    }
}