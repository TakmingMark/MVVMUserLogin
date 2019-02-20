package com.example.markwang.mvvmpractice

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.Bindable

class UserDataModel (private var _email: String, private var _password: String){

    var mEmail:String
        get()=_email
        set(value){ _email=value}

    var mPassword:String
        get()=_password
        set(value) {_password=value}

    fun isInputDataValid():Boolean{
        return !TextUtils.isEmpty(mEmail) && Patterns.EMAIL_ADDRESS.matcher(mEmail).matches() && mPassword.length>5
    }
}
