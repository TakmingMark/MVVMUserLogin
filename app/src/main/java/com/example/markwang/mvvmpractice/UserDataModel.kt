package com.example.markwang.mvvmpractice

class UserDataModel {

    fun retrieveData(callback: (Any) -> Unit){
        callback.invoke("New data")
    }

}
