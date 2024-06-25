package com.example.displaytest_desafiogertec.ui

import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.displaytest_desafiogertec.MainActivity
import com.example.displaytest_desafiogertec.databinding.FragmentDisplayTestBinding


class FragmentDisplayTest : Fragment() {

    private lateinit var binding: FragmentDisplayTestBinding

    private lateinit var displayList: MutableList<DisplayTestVO>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentDisplayTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayList = mutableListOf()
        createList()
        setupAdapter(displayList)
    }

    private fun setupAdapter(response: MutableList<DisplayTestVO>) {
        with(binding.rvContainer) {
            layoutManager = GridLayoutManager(requireContext(), 4)
            adapter = DisplayAdapter(response, onItemClicked = ::clickOnDisplay, getSize())
        }
    }

    private fun clickOnDisplay(displayTestVO: DisplayTestVO) {
        displayTestVO.item = true
        if (checkList()) {

            binding.btPassed.visibility = View.VISIBLE
            binding.btPassed.setOnClickListener {
                Toast.makeText(
                    requireContext(),
                    "Sucesso na verificação do Display",
                    Toast.LENGTH_LONG
                ).show()
                (activity as MainActivity).removeFragment()
            }
            binding.btTryAgain.visibility = View.VISIBLE
            binding.btTryAgain.setOnClickListener {
                (activity as MainActivity).makeTestAgain()
            }
        }
    }

    private fun checkList(): Boolean {
        if (displayList.isEmpty() || displayList.size == 1) return true
        val firstElement = displayList[0]
        for (element in displayList) {
            if (element != firstElement) {
                return false
            }
        }
        return true
    }

    private fun createList(){
        val start = 0
        val end = 23
        for(a in start..end){
            displayList.add(DisplayTestVO(false))
        }
    }

    private fun getSize() : Pair<Int, Int> {
        val displayMetrics = DisplayMetrics()
        (activity as MainActivity).windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        val width = displayMetrics.widthPixels
        val heightMetrics = height/6 - dpFromPx(requireContext(), 4f)
        val widthMetrics = width/4 - dpFromPx(requireContext(), 4f)

        return Pair(heightMetrics.toInt(), widthMetrics.toInt())
    }

    private fun dpFromPx(context: Context, px: Float): Float {
        return px / context.resources.displayMetrics.density
    }
}