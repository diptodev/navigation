package com.excitedbroltd.navigationdemu

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val value = requireArguments().getString("userName")
        view.findViewById<TextView>(R.id.textView).text = value.toString()
        Log.d("LIVED", "onViewCreated: $value")

    }
}