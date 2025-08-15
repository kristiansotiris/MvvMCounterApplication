package com.example.mvvmapp

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _counter = mutableIntStateOf(0)
    val counter: Int
        get() = _counter.intValue

    fun increment(){
        _counter.intValue++
    }

    fun decrement(){
        _counter.intValue--
    }
}