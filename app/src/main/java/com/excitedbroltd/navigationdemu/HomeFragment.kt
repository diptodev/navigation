package com.excitedbroltd.navigationdemu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.excitedbroltd.navigationdemu.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )
        binding.btn.setOnClickListener {
            val text = binding.name.text.toString()
            val bundle = bundleOf("userName" to text)
            if (text.isNotEmpty()) {
                it.findNavController().navigate(R.id.action_homeFragment_to_yardFragment, bundle)
            } else {
                Toast.makeText(container?.context, "No name entered", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        binding.name.text.clear()
    }


}