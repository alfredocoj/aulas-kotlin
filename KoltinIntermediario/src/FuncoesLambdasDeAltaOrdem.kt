fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int>{
    val newList = arrayListOf<Int>()

    for (item in list){
        if(filtro(item))
            newList.add(item)
    }
    return newList
}

fun numerosPares(number: Int) = number % 2 == 0

fun numerosMaioresQue3(number: Int) = number > 3


fun main(args: Array<String>){
    val inteiros = listOf(1,2,3,4,5,6)
    println(inteiros)

    var listNumerosPares = filtrar(inteiros, ::numerosPares)
    println(listNumerosPares)

    var listNumerosMaioresQue3 = filtrar(inteiros, ::numerosMaioresQue3)
    println(listNumerosMaioresQue3)

}