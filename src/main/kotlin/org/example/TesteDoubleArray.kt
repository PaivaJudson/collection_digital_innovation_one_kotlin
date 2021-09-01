package org.example

fun main() {

    val salarios = DoubleArray(4){(it+1)*1000.0}

    for ((i, v) in salarios.withIndex()){
        println("$i tem o salário = $v")
    }

    println("-----------------------------------------------------")
    salarios.forEachIndexed { index, d -> salarios[index] = salarios[index] + d * 0.2 }
    salarios.forEach { println(it) }



    println("-----------------------------------------------------")
    val bonus = doubleArrayOf(300.0, 400.0, 200.0, 100.0)
    bonus.sort()
    bonus.forEach { println(it) }

}
