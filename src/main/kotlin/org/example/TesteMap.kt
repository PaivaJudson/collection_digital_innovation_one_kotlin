package org.example

fun main() {

    val pair: Pair<String, Double> = Pair("João", 1000.0)

    val map1 = mapOf(pair)
    map1.forEach { (key, value) -> println("Key = $key; Value = $value ") }


    val map2 = mapOf("Judson Paiva" to  2000000.0, "Leonor José" to 1000000.0)
    map2.forEach { (x, y) -> println("Nome = $x | Salário = $y")}
}


