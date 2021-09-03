package org.example

fun main() {

    val f1 = Funcionario("Leonor José", 4000.0, "CLT")
    val f2 = Funcionario("Judson Paiva", 4000.0, "PJ")
    val f3 = Funcionario("Jéssica Paiva", 2500.0, "CLT")
    val f4 = Funcionario("Anderson Paiva", 3000.0, "CLT")

    val lista1 = setOf(f1, f3)
    val lista2 = setOf(f2)

    val resultadoUnion = lista1.union(lista2)
    resultadoUnion.forEach { println(it) }

    println("-------------------------------------------------")
    val lista_2 = lista2.union(setOf(f4))
    lista_2.forEach { println(it) }

    println("-------------------------------------------------")
    val resultadoSub = resultadoUnion.subtract(lista_2)
    resultadoSub.forEach { println(it) }

    println("-------------------------------------------------")
    val resultInterSec = resultadoUnion.intersect(lista_2)

    resultInterSec.forEach { println(it) }


}