package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private var screen = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //     supportFragmentManager.beginTransaction().add(R.id.fragment_container_view,FragmentFirst.newInstance(1)).commit()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container_view,FragmentFirst()).commit()
    }


}

