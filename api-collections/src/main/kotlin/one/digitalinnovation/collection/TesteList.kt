package one.digitalinnovation.collection

fun main(){
    val joao= funcionario("João", 1200.0, "CLT")
    val pedro= funcionario("Pedro", 3000.0, "CLT")
    val maria= funcionario("Maria", 4000.0, "CLT")
    val rodrigo= funcionario("Rodrigo", 10000.0, "PJ")
    val rogerio= funcionario("Rogério", 10001.0, "PJ")
    val morgana= funcionario("Morgana", 15000.0, "PJ")
    val rogerio2= funcionario("Rogério", 15000.0, "PJ")

    val funcionarios= listOf(joao, pedro, maria, rodrigo, rogerio, rogerio2, morgana)
    // sortedBy tá ordenando a lista por salario     // groupBy tá agrupando a lista em dois grupos CLT e PJ
    funcionarios.sortedBy { it.salario }.groupBy { it.tipoContratacao }.forEach { println(it) }
}



