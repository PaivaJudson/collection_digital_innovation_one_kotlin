package org.example

fun main() {

    val f1 = Funcionario("Leonor José", 4000.0, "CLT")
    val f2 = Funcionario("Judson Paiva", 4000.0, "PJ")
    val f3 = Funcionario("Jéssica Paiva", 2500.0, "CLT")


    val lista1 = setOf(f1, f2)
    val lista2 = setOf(f3)

    val resultadoUnion = lista1.union(lista2)

    resultadoUnion.forEach { println(it) }

    println("-------------------------------------------------")
    val resultadoSub = resultadoUnion.subtract(lista2)

}