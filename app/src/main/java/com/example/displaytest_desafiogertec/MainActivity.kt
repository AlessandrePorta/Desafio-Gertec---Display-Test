package com.example.displaytest_desafiogertec

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.displaytest_desafiogertec.databinding.ActivityMainBinding
import com.example.displaytest_desafiogertec.ui.FragmentDisplayTest

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var fragment : Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btStart.setOnClickListener {
            fragment = FragmentDisplayTest()
            binding.btStart.visibility = View.INVISIBLE
            val fragmentManager = supportFragmentManager.beginTransaction()
            fragmentManager.replace(R.id.fcvMain, fragment, "Display Test").commit()
        }
    }

    fun makeTestAgain(){
        fragment = FragmentDisplayTest()
        binding.btStart.visibility = View.INVISIBLE
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fcvMain, fragment, "Display Test").commit()
    }

    fun removeFragment(){
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.remove(fragment).commit()
        binding.btStart.visibility = View.VISIBLE
    }
}