package one.digitalinnovation.collection

fun main(){
    // melhor jeito para fazer um mapa
    val mapa= mapOf(
        "Rodrigo" to 10000.0,
        "Morgana" to 20000.0,
        "Matheus" to 5000.0  )
    mapa.forEach{ (k, v) -> println("Chave: $k  Valor: $v")}

    // jeito de fazer mais longo
    //e tem que ficar criando outros Pair para adicionar mais dados por isso melhor usar map of
    val pair: Pair<String, Double> = Pair("Pedro", 2000.0)
    val mapa1= mapOf(pair)
    mapa1.forEach{ (k, v) -> println("Nome: $k, Renda: $v")}
}