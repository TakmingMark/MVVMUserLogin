package com.example.markwang.mvvmpractice

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import java.util.logging.Handler

class UserViewModel(private var _phone: String, private var _isRegister: Boolean) : BaseObservable() {


    var phone: String
        @Bindable get() = _phone
        set(value) {
            _phone = value
        }

    var isRegister: Boolean
        @Bindable get() = _isRegister
        set(value) {
            _isRegister = value
        }

    private var dataModel=UserDataModel()

//    fun refresh(){
//        dataModel.retrieveData { m-> println(m) }
//    }


}