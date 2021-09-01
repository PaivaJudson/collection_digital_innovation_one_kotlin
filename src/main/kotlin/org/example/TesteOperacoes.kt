package org.example

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("------------------------------------------------------------------")
    println("Maior salário ${salarios.max()}")
    println("Menor salário ${salarios.min()}")
    println("Salário médio ${salarios.average()}")

    println("------------------------------------------------------------------")
    println("Maior salário ${salarios.maxOrNull()}")
    println("Menor salário ${salarios.minOrNull()}")


    println("------------------------------------------------------------------")
    val salariosMaiorQue2500 = salarios.filter { it>2000.0 }
    for (salario in salariosMaiorQue2500){
        println(salario)
    }

    println("------------------------------------------------------------------")
    //println(salarios.count())
    println(salarios.count { it in 2000.0 .. 5000.0 })


    println("------------------------------------------------------------------")
    println(salarios.find { it == 2250.0 })

    println("------------------------------------------------------------------")
    println(salarios.any { it == 1000.0 })


}