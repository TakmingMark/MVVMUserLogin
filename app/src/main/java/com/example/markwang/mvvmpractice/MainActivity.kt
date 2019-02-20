package com.example.markwang.mvvmpractice

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.markwang.mvvmpractice.databinding.ActivityMainBinding


/**
 *  https://stackoverflow.com/questions/40085724/kotlin-custom-attribute-databinding/40088544
 *  Just keep function on the top level, no class or companion object needed, it will work since top-level functions in Kotlin translated to static member functions of Class named as FileNameKt unless overridden by @file:JvmName annotation
 */
@BindingAdapter("toastMessage")
fun runMe(view: View,toastMessage:String ){
    Log.d("test","test")
    Toast.makeText(view.context,toastMessage,Toast.LENGTH_LONG).show()
}

/**
 * This simple reference from:https://www.journaldev.com/20292/android-mvvm-design-pattern
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        binding.viewModel=LoginViewModel()
    }


}