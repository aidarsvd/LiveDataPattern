package ru.test.myapplication.models

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){


    val countData: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    var count = ObservableField("")

    var i: Int = 0

    fun onPlus(){
        i++
        /*countData.value = i*/
        count.set(i.toString())
    }

    fun onMinus(){
        i--
//        countData.value = i
        count.set(i.toString())
    }



}


