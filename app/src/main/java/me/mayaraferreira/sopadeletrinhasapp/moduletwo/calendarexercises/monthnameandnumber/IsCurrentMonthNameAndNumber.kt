package me.mayaraferreira.sopadeletrinhasapp.moduletwo.calendarexercises.monthnameandnumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.mayaraferreira.sopadeletrinhasapp.R

class IsCurrentMonthNameAndNumber : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_is_current_month_name_and_number,
            container,
            false
        )
    }
}