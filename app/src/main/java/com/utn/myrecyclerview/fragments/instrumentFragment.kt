package com.utn.myrecyclerview.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.utn.myrecyclerview.R

class instrumentFragment : Fragment() {

    companion object {
        fun newInstance() = instrumentFragment()
    }

    lateinit var v : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_instrument, container, false)
        return v
    }

    override fun onStart() {
        super.onStart()
    }
}