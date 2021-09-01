package org.example

fun main() {

    val valores = intArrayOf(2, 3, 1, 10, 7)


    for ((i, v) in valores.withIndex()){
        println("i = $i | v = $v")
    }


}