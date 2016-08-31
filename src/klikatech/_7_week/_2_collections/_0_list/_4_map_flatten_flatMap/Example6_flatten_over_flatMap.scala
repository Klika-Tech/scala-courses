package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

// flatten = flatMap - map
object Example6_flatten_over_flatMap extends App {

    val list = List(1, 2, 3, 4, 5, 6).map(List(_))

    val res1 = list.flatten
    val res0 = list.flatMap(item => item)

    println(res0)
    println(res1)
}
