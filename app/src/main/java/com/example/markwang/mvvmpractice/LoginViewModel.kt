package com.example.markwang.mvvmpractice

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import java.util.logging.Handler


// BaseOBservable reference link:https://www.jianshu.com/p/cfd258ddc43d
class LoginViewModel :BaseObservable(){
    var userDataModel=UserDataModel("","")

    var successMessage="Login was successful"
    var errorMessage="Email or Password not valid"

    @Bindable
    var toastMessage:String=""

    fun afterEmailTextChanged(s:CharSequence)={userDataModel.mEmail=s.toString()}

    fun afterPasswordTextChanged(s:CharSequence)={userDataModel.mPassword=s.toString()}

    fun onLoginClicked(){
        Log.d("test","onLoginClicked")
        if(userDataModel.isInputDataValid())
            toastMessage=successMessage
        else
            toastMessage=errorMessage

        notifyPropertyChanged(BR.toastMessage)
    }
}