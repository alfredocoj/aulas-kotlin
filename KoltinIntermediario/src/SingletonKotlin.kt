data class Carro(val nome: String)

object SingletonKotlin{
    fun getCarros(): List<Carro>{
        val carros = mutableListOf<Carro>()

        for (i in 1..3) {
            val c = Carro("Carro $i")
            carros.add(c)

        }
        return carros
    }
}

fun main(args: Array<String>){
    val carros = SingletonKotlin.getCarros()

    for (c in carros) {
        println(c)
    }
}