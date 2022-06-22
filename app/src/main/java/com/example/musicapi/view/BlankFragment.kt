package com.example.musicapi.view

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.musicapi.R

class BlankFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        findNavController().navigate(R.id.navigation_rock)
    }

}