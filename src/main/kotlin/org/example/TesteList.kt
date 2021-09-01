package org.example

data class Funcionario(val nome: String, val salario: Double){
    override fun toString(): String {
        return "Nome:   $nome | Salário = $salario"
    }
}


fun main() {

    val f1 = Funcionario("Leonor José", 2000.0)
    val f2 = Funcionario("Judson Paiva", 4000.0)
    val f3 = Funcionario("Jéssica Paiva", 2000.0)

    val funcionarios = listOf(f1, f2, f3)
    funcionarios.forEach { println(it) }

    println("------------------------------------------------------------")
    println(funcionarios.find { it.nome.contains("Paiva") })

    println("------------------------------------------------------------")
    val listaFamília = funcionarios.filter{ it.nome.contains("Paiva") }.forEach { println(it) }

    

}