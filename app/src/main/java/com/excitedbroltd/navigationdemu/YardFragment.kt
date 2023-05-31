package com.excitedbroltd.navigationdemu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.excitedbroltd.navigationdemu.databinding.FragmentYardBinding

class YardFragment : Fragment() {
    private lateinit var binding: FragmentYardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_yard, container, false)
        val value = requireArguments().getString("userName")
        binding.textView.text = value.toString()
        return binding.root
    }

}