package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.distinctdigitlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import me.mayaraferreira.sopadeletrinhasapp.R


class HasDistinctDigitsFragment : Fragment() {

    private val viewModel: HasDistinctDigitsVM by viewModels {
        HasDistinctDigitsFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_is_distinct_digit_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton()
    }

    private fun setupButton() {
        val btnNumberOne = view?.findViewById<TextView>(R.id.btn_number1)
        btnNumberOne?.setOnClickListener {
            val btnNumberOneText = btnNumberOne.text?.toString()
            validate(btnNumberOneText.orEmpty())
        }

        val btnNumberTwo = view?.findViewById<TextView>(R.id.btn_number2)
        btnNumberTwo?.setOnClickListener {
            val btnNumberTwoText = btnNumberTwo.text?.toString()
            validate(btnNumberTwoText.orEmpty())
        }

        val btnNumberThree = view?.findViewById<TextView>(R.id.btn_number3)
        btnNumberThree?.setOnClickListener {
            val btnNumberThreeText = btnNumberThree.text?.toString()
            validate(btnNumberThreeText.orEmpty())
        }

        val btnNumberFour = view?.findViewById<TextView>(R.id.btn_number4)
        btnNumberFour?.setOnClickListener {
            val btnNumberFourText = btnNumberFour.text?.toString()
            validate(btnNumberFourText.orEmpty())
        }

        val btnNumberFive = view?.findViewById<TextView>(R.id.btn_number5)
        btnNumberFive?.setOnClickListener {
            val btnNumberFiveText = btnNumberFive.text?.toString()
            validate(btnNumberFiveText.orEmpty())
        }
    }

    private fun validate(text: String) {
        if (text.isEmpty()) {
            Log.e(this::class.java.name, "TextView texts are empty")
        } else {
            val result = viewModel.checkAnswer(text.toInt())
            val answerText = if (result) "CORRETO" else "INCORRETO"
            Toast.makeText(context, answerText, Toast.LENGTH_SHORT).show()
        }
    }
}