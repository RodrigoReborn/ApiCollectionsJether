package one.digitalinnovation.collection
fun main(){
    val joao= funcionario("João", 1200.0, "CLT")
    val pedro= funcionario("Pedro", 3000.0, "CLT")
    val maria= funcionario("Maria", 4000.0, "CLT")
    val rodrigo= funcionario("Rodrigo", 10000.0, "PJ")
    val rogerio= funcionario("Rogério", 10001.0, "PJ")
    val morgana= funcionario("Morgana", 15000.0, "PJ")
    val rogerio2= funcionario("Rogério", 15000.0, "PJ")

    val empregados= mutableListOf(rodrigo, rogerio, morgana, rogerio2)
    println("Lista de Empregados2018:")
    empregados.forEach{ println(it)}

    println("Lista de Empregados 2019:")  // add tá adicionando algo da mutableListOf
    empregados.add(pedro)
    empregados.add(maria)
    empregados.add(joao)
    empregados.forEach{ println(it) }

    println("Lista de Empregados 2020:") // remove tá removendo algo da mutableListOf
    empregados.remove(rodrigo)
    empregados.remove(rogerio2)
    empregados.forEach{ println(it) }
}