package com.example.mvvmapp

data class CounterModel(var count:Int){
    class CounterRepository{
        private val _counterModel = CounterModel(0)

        fun increment(){
            _counterModel.count++
        }

        fun decrement(){
            _counterModel.count--
        }
        fun getCounter():CounterModel{
            return _counterModel
        }
    }
}