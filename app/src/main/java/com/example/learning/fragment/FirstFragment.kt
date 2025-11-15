package com.example.learning.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.OptIn
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi
import androidx.navigation.fragment.findNavController
import com.example.learning.R
import com.example.learning.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("UnsafeOptInUsageError")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("kekFIRST","onCreate-FirstFragment")
    }

    @SuppressLint("UnsafeOptInUsageError")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        Log.i("kekFIRST","onCreateView-FirstFragment")
        return view
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("kekFIRST","onViewCreated-FirstFragment")
        binding.toSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("kekFIRST","onAttach-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onStart() {
        super.onStart()
        Log.i("kekFIRST","onStart-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onResume() {
        super.onResume()
        Log.i("kekFIRST","onResume-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("kekFIRST","onSaveInstanceState-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.i("kekFIRST","onViewStateRestored-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onPause() {
        super.onPause()
        Log.i("kekFIRST","onPause-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onStop() {
        super.onStop()
        Log.i("kekFIRST","onStop-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onDestroy() {
        super.onDestroy()
        Log.i("kekFIRST","onDestroy-FirstFragment")
    }
    @SuppressLint("UnsafeOptInUsageError")
    override fun onDetach() {
        super.onDetach()
        Log.i("kekFIRST","onDetach-FirstFragment")
    }



    @SuppressLint("UnsafeOptInUsageError")
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("kekFIRST","onDestroyView-FirstFragment")
    }

}