package org.example

fun main() {

    val lista = Array(4){""}

    lista[0] = "Maria"
    lista[1] = "João"
    lista[2] = "José"
    lista[3] = "Madalena"


    lista.sort()
    for (nome in lista){
        println(nome)
    }

    println("----------------------------------------------------")
    lista.reverse()
    lista.forEach {
        println(it)
    }

    val listaNomes = arrayOf("Maria", "Zazá", "Pedro")

    println("----------------------------------------------------")
    listaNomes.reverse()
    listaNomes.forEach {
        println(it)
    }


}