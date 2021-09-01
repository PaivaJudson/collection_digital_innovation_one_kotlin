package org.example

data class Funcionario(val nome: String, val salario: Double, val tipoContratacao:String){
    override fun toString(): String {
        return "Nome:   $nome | Salário = $salario"
    }
}


fun main() {

    val f1 = Funcionario("Leonor José", 4000.0, "CLT")
    val f2 = Funcionario("Judson Paiva", 4000.0, "PJ")
    val f3 = Funcionario("Jéssica Paiva", 2500.0, "CLT")

    val funcionarios = listOf(f1, f2, f3)
    funcionarios.forEach { println(it) }

    println("------------------------------------------------------------")
    println(funcionarios.find { it.nome.contains("Paiva") })

    println("------------------------------------------------------------")
    val listaFamília = funcionarios.filter{ it.nome.contains("Paiva") }.forEach { println(it) }

    println("------------------------------------------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }


    println("------------------------------------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

    println("------------------------------------------------------------")

}