enum class Color(val rgb: Int) {
    RED(0xFF000),
    GREEN(0x00F00),
    BLUE(0x000FF)
}


fun  main(args: Array<String>){
    val rgb = Color.values()
    for (i in 0..rgb.size-1) {
       println(rgb[i])
    }
}