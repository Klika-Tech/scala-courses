package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

object Example3_flatten extends App {

    // List(List(x1), List(x2), List(x3)) => List(x1, x2, x3)

    val list = List(List(1,2), List(2,3), List(3,4))

    val res0 = list.flatten

    println(res0)

    println("\n---- my flatten ----\n")

    def flatten[A](list: List[List[A]]): List[A] = {
        if (list.isEmpty) Nil
        else list.head ++ flatten(list.tail)
    }

    val res1 = flatten(list)

    println(res1)
}
