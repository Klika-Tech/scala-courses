package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

object Example4_flatMap extends App {

    // List[A].flatMap(f: A => List[B]) => List[B]
    // List(x1, x2, x3).flatMap(f) => f(x1), f(x2), f(x3)
    val list = List(1, 2, 3)

    val res0 = list.flatMap(item => List(item + 1))

    println(res0)

    println("\n---- my flatMap ----\n")

    def flatMap[A, B](list: List[A], f: A => List[B]): List[B] = {
        if (list.isEmpty) Nil
        else f(list.head) ++ flatMap(list.tail, f)
    }

    // flatMap(List[A], f: A => List[B]) => List[B]
    val res1 = flatMap(list, (item: Int) => List(item + 1))

    println(res1)
}
