package one.digitalinnovation.collection

class Repositorio <T>{    // T é generico mudamos ele pra funcionario no testemutavelmap
    private val map = mutableMapOf<String, T>()
    fun create(id: String, value: T){
        map[id]= value   // pode usar o put ficando: map.put(id,value)
    }
    fun findById(id: String)= map[id]  // findById= tá buscando por id

    fun findAll()= map.values  // passa a buscar tudo que tem no values(T) na mutableMapOf T= Funcionario
}