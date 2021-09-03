package collection.mutable

import org.example.Funcionario

fun main() {

    val f1 = Funcionario("Leonor José", 4000.0, "CLT")
    val f2 = Funcionario("Judson Paiva", 4000.0, "PJ")
    val f3 = Funcionario("Jéssica Paiva", 2500.0, "CLT")

    val lista = mutableListOf(f1, f2)
    lista.forEach { println(it) }

    println("==================================================================")
    lista.add(f3)
    lista.forEach { println(it) }

    println("==================================================================")
    lista.remove(f2)
    lista.forEach { println(it) }


}