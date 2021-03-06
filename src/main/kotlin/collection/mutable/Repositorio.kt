package collection.mutable

class Repositorio<T>{
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value   // ou também poderia ser: map.put(id, value)
    }

    fun remove(id: String) = map.remove(id);

    fun fundById(id: String) = map[id]


    fun findAll() = map.values
}