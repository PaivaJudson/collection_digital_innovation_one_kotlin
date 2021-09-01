package org.example

fun main() {

    val salarios = DoubleArray(4){(it+1)*1000.0}

    for ((i, v) in salarios.withIndex()){
        println("$i tem o salário = $v")
    }

    println("-----------------------------------------------------")
    salarios.forEachIndexed { index, d -> salarios[index] = salarios[index] + d * 0.2 }
    salarios.forEach { println(it) }
}
