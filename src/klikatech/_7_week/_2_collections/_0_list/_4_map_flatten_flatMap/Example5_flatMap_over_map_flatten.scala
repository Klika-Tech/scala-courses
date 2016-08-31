package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

// flatMap = map + flatten
object Example5_flatMap_over_map_flatten extends App {

    val list = List(1, 2, 3, 4, 5, 6)

    val res0 = list.flatMap(item => List(item + 1))
    val res1 = list.map(item => List(item + 1)).flatten

    println(res0)
    println(res1)
}
