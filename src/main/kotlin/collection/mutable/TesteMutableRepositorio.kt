package collection.mutable

import org.example.Funcionario

fun main() {

    val f1 = Funcionario("Leonor José", 4000.0, "CLT")
    val f2 = Funcionario("Judson Paiva", 4000.0, "PJ")
    val f3 = Funcionario("Jéssica Paiva", 2500.0, "CLT")
    val f4 = Funcionario("Anderson Paiva", 3000.0, "CLT")


    val repositorio = Repositorio<Funcionario>()
    repositorio.create("primeiro", f1)
    repositorio.create("segundo", f2)
    repositorio.create("terceiro", f3)
    repositorio.create("quarto", f4)

    println(repositorio.fundById("segundo"))

    println("-------------------------------------------")

    repositorio.findAll().forEach { println(it) }

    println("-------------------------------------------")
    repositorio.remove("segundo")
    repositorio.findAll().forEach { println(it) }
}