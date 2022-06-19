package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.distinctdigitlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.mayaraferreira.sopadeletrinhasapp.R

class IsDistinctDigitList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_is_distinct_digit_list, container, false)
    }
}