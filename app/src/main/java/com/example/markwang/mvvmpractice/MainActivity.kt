package com.example.markwang.mvvmpractice

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.markwang.mvvmpractice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity(){

    var viewModel=UserViewModel("0988888888",true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button.setOnClickListener { viewModel. }

        var binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)


        binding.user=viewModel

    }
}