package me.mayaraferreira.sopadeletrinhasapp.moduleone.countingexercises.completethelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.mayaraferreira.sopadeletrinhasapp.R

class CompleteTheListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_complete_the_list, container, false)
    }
}