package one.digitalinnovation.collection
fun main() {
    val joao= funcionario("João", 1200.0, "CLT")
    val pedro= funcionario("Pedro", 3000.0, "CLT")
    val maria= funcionario("Maria", 4000.0, "CLT")
    val rodrigo= funcionario("Rodrigo", 10000.0, "PJ")
    val rogerio= funcionario("Rogério", 10001.0, "PJ")
    val morgana= funcionario("Morgana", 15000.0, "PJ")
    val rogerio2= funcionario("Rogério", 15000.0, "PJ")

    val repositorio = Repositorio<funcionario>()  // T passa a ser funcionario
    repositorio.create(rodrigo.nome, rodrigo)
    repositorio.create(morgana.nome, morgana)
    repositorio.create(joao.nome, joao)
    repositorio.create(rogerio.nome, rogerio)
    repositorio.create(rogerio2.nome, rogerio2)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("Lista funcionarios 2018")
    println( repositorio.findById(rodrigo.nome) )    // findById= tá buscando por id
    println( repositorio.findById(morgana.nome) )   // findById= tá buscando por id

    println("Lista funcionarios 2019")
    repositorio.findAll().forEach{ println(it) }   // findAll= buscando tudo que ta no repositorio
}
