package com.example.parapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.parapassing.databinding.FragmentABinding
import androidx.navigation.Navigation


class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        binding.btnSend.setOnClickListener(){
            val name = binding.tfName.text.toString()

            val action = AFragmentDirections.actionFragmentAToFragmentB(name)

            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }


}