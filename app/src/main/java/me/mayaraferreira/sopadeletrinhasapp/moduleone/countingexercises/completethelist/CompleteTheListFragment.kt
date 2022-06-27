package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.completethelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import me.mayaraferreira.sopadeletrinhasapp.R

class CompleteTheListFragment : Fragment() {

    private val viewModel: CompleteTheListVM by viewModels {
        CompleteTheListVMFactory()
    }

    private var edtTxtElement1: EditText? = null
    private var edtTxtElement2: EditText? = null
    private var edtTxtElement3: EditText? = null
    private var edtTxtElement4: EditText? = null

    private var txtElement1: TextView? = null
    private var txtElement2: TextView? = null
    private var txtElement3: TextView? = null
    private var txtElement4: TextView? = null
    private var txtElement5: TextView? = null
    private var txtElement6: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_complete_the_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        setupObservers()
        setupButton()
    }

    private fun setupViews() {
        edtTxtElement1 = view?.findViewById(R.id.edt_second_list_number)
        edtTxtElement2 = view?.findViewById(R.id.edt_fourth_list_number)
        edtTxtElement3 = view?.findViewById(R.id.edt_sixth_list_number)
        edtTxtElement4 = view?.findViewById(R.id.edt_eighth_list_number)
        txtElement1 = view?.findViewById(R.id.txt_first_list_number)
        txtElement2 = view?.findViewById(R.id.txt_third_list_number)
        txtElement3 = view?.findViewById(R.id.txt_fifth_list_number)
        txtElement4 = view?.findViewById(R.id.txt_seventh_list_number)
        txtElement5 = view?.findViewById(R.id.txt_ninth_list_number)
        txtElement6 = view?.findViewById(R.id.txt_tenth_list_number)
    }

    private fun setupButton() {
        view?.findViewById<Button>(R.id.btn_complete_the_list_submit)?.setOnClickListener {
            val missingValuesList = getTextViewValuesList()
            val filledValuesList = getEditTextValuesList()
            viewModel.checkAnswer(missingValuesList, filledValuesList)
        }
    }

    private fun setupObservers() {
        viewModel.result.observe(viewLifecycleOwner) { isCorrect ->
            if(isCorrect == null) return@observe
            val answerText = if (isCorrect == true) "CORRETO" else "INCORRETO"
            Toast.makeText(context, answerText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun getEditTextValuesList(): List<Int> {
        return listOf(
            edtTxtElement1,
            edtTxtElement2,
            edtTxtElement3,
            edtTxtElement4
        ).mapNotNull { editText ->
            editText?.let {
                it.text?.toString()?.toIntOrNull() ?: 0
            }
        }
    }

    private fun getTextViewValuesList(): MutableList<Int?> {
        return listOf(
            txtElement1,
            null,
            txtElement2,
            null,
            txtElement3,
            null,
            txtElement4,
            null,
            txtElement5,
            txtElement6
        ).map {
            it?.text?.toString()?.toIntOrNull()
        }.toMutableList()
    }
}