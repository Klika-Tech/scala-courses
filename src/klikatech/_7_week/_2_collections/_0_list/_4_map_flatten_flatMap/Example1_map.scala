package klikatech._7_week._2_collections._0_list._4_map_flatten_flatMap

object Example1_map extends App {

    // List[A].map(f: A => B) => List[B]
    // List(x1, x2, x3).map(f) => List(f(x1), f(x2), f(x3))

    val list: List[Int] = List(1, 2, 3, 4, 5, 6)

    val resForeach: Unit = list.foreach(item => item + 1)

    val res0: List[Int] = list.map(item => item + 1)

    val res1 = list.map(item => item + 1).map(x => x * 2)

    println(list)
    println(res0)
    println(res1)

    println("\n---- my map ----\n")

    def map[A, B](list: List[A], f: A => B): List[B] = {
        if (list.isEmpty) Nil
        else f(list.head) :: map(list.tail, f)
    }

    val res2 = map(list, (item: Int) => item + 1)
    val res3 = map(map(list, (item: Int) => {item + 1}), (item: Int) => {item * 1})

    println(list)
    println(res0)
    println(res1)
}
