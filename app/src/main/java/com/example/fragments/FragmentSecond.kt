package com.example.fragments

import android.R.attr
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.R.attr.defaultValue
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fragments.FragmentFirst.Companion.KEY

class FragmentSecond : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textview = view.findViewById<TextView>(R.id.text_view)
        val data = activity?.intent?.getStringExtra(KEY)
        textview.text = data ?: "fignya"
    }
}
