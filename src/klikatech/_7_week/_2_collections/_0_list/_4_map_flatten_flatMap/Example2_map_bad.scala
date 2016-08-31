package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

object Example2_map_bad extends App {

    val list = List(1, 2, 3, 4, 5, 6)

    val res0 = list.map(item => List(item + 1, item * 2).map(item => List(item + 1, item * 2)))
    val res1 = list.map(item => List(item + 1, item * 2).map(item => List(item + 1, item * 2)).flatten).flatten

    println(res0)
    println(res1)
}
