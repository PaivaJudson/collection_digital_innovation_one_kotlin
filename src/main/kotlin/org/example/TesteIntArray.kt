package org.example

fun main() {

    val valores = IntArray(5)

    valores[0] = 1
    valores[1] = 4
    valores[2] = 3
    valores[3] = 7
    valores[4] = 6

    for ((key, value) in valores.withIndex() ){
        println("i = $key valor = $value")
    }

    valores.forEach {
        println(it)
    }

    for (index in valores.indices){
        println(valores[index])
    }

    println("--------------------------------------------------------")
    valores.sort()
    for (index in valores.indices){
        println(valores[index])
    }
}