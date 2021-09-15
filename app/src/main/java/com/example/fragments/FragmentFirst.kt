package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.content.Intent




private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentFirst : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // editText?.getText().toString()
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            openSecondFragment()
        }
    }

    private fun openSecondFragment() {
        val editText = view?.findViewById<EditText>(R.id.edit_text)

//        val intent = Intent(
//            activity!!.baseContext,
//            TargetActivity::class.java
//        )
//        intent.putExtra("message", KEY)
//        activity!!.startActivity(intent)
//
             activity?.intent?.putExtra(KEY, editText?.getText().toString())
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_container_view, FragmentSecond())
        transaction?.commit()
    }

    companion object {
        const val KEY = "key"
    }

}