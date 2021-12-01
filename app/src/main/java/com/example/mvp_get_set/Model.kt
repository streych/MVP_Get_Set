package com.example.mvp_get_set

class Model {

    var text= mutableListOf(1)

    fun SetText(int: Int) {
        text[0] = int
    }

    fun GetText(): Int {
        return text[0]
    }

}