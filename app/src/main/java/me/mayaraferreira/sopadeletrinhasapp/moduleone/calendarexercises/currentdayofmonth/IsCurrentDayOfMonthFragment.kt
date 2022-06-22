package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentdayofmonth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import me.mayaraferreira.sopadeletrinhasapp.R

class IsCurrentDayOfMonthFragment : Fragment() {

    private val viewModel: IsCurrentDayOfMonthVM by viewModels {
        IsCurrentDayOfMonthVMFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_is_current_day_of_month,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupButton()
    }

    private fun setupButton() {
        view?.findViewById<Button>(R.id.btn_current_day_of_month_submit)?.setOnClickListener {
            validate()
        }
    }

    private fun validate() {
        val currentDay = view?.findViewById<EditText>(R.id.edt_current_day_of_month)
            ?.text
            ?.toString()

        val result = viewModel.checkAnswer(currentDay)

        val answerText = if (result) "CORRETO" else "INCORRETO"
        Toast.makeText(context, answerText, Toast.LENGTH_SHORT).show()
    }
}