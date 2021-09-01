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


    val salariosMaiorQue2500 = salarios.filter { it>2000.0 }
    println("------------------------------------------------------------------")
    for (salario in salariosMaiorQue2500){
        println(salario)
    }
    
}