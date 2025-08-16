package com.example.mvvmapp

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _repository = CounterModel.CounterRepository()
    private val _counter = mutableIntStateOf(_repository.getCounter().count)
    val counter: Int
        get() = _counter.intValue

    fun increment(){
        _repository.increment()
        _counter.intValue = _repository.getCounter().count
    }

    fun decrement(){
        _repository.decrement()
        _counter.intValue = _repository.getCounter().count
    }
}