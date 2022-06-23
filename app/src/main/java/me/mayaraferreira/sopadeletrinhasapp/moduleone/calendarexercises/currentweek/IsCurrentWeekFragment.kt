package me.mayaraferreira.sopadeletrinhasapp.moduleone.calendarexercises.currentweek

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.viewModels
import me.mayaraferreira.sopadeletrinhasapp.R

class IsCurrentWeekFragment : Fragment() {

    private val viewModel: IsCurrentWeekVM by viewModels {
        IsCurrentWeekVMFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_is_current_week,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton()
    }

    private fun setupButton() {
        view?.findViewById<Button>(R.id.btn_current_week_submit)?.setOnClickListener {
            validate()
        }
    }

    private fun validate() {
        val sunday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_sunday))
        val monday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_monday))
        val tuesday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_tuesday))
        val wednesday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_wednesday))
        val thursday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_thursday))
        val friday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_friday))
        val saturday =
            convertToNonNullableInt(view?.findViewById<EditText>(R.id.edt_current_week_saturday))

        val currentWeekList = listOf(
            sunday,
            monday,
            tuesday,
            wednesday,
            thursday,
            friday,
            saturday
        )

        if (currentWeekList.contains(0)) {
            Toast.makeText(
                context,
                "Preencha todos os campos apenas com números de dias válidos.",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            val result = viewModel.checkAnswer(currentWeekList)

            val answerText = if (result) "CORRETO" else "INCORRETO"
            Toast.makeText(context, answerText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun convertToNonNullableInt(value: EditText?): Int {
        if (TextUtils.isEmpty(value?.text?.toString())) {
            return 0
        } else {
            return value?.text.toString().toInt()
        }
    }
}