package one.digitalinnovation.collection
fun main(){
    val joao= funcionario("João", 1200.0, "CLT")
    val pedro= funcionario("Pedro", 3000.0, "CLT")
    val maria= funcionario("Maria", 4000.0, "CLT")
    val rodrigo= funcionario("Rodrigo", 10000.0, "PJ")
    val rogerio= funcionario("Rogério", 10001.0, "PJ")
    val morgana= funcionario("Morgana", 15000.0, "PJ")
    val rogerio2= funcionario("Rogério", 15000.0, "PJ")

    // setOf tá criando um conjunto
    val funcionarioCLT= setOf(joao, pedro, maria, rodrigo, rogerio, rogerio2, morgana)
    val funcionarioPJ= setOf(rodrigo, rogerio, rogerio2, morgana)

    println("Lista de Funcionarios:")
    val unirCLTePJ= funcionarioCLT.union(funcionarioPJ) // union está juntando oque tem em ambas variáveis
    unirCLTePJ.forEach{ println(it) }

    val salarioMaiorQue4000= setOf(maria, rodrigo, rogerio,rogerio2, morgana)

    println("Lista Funcionarios CLT:")
    val subtrairPJdeCLT= funcionarioCLT.subtract(funcionarioPJ) // subtract está subtraindo(EXCLUINDO) PJ de CLT
    subtrairPJdeCLT.forEach{ println(it) }

    println("Salários acima de R$4000,00")
    val emComum= salarioMaiorQue4000.intersect(unirCLTePJ)  // intersect está verificando oque ambos tem em comum
    emComum.forEach { println(it) }
}