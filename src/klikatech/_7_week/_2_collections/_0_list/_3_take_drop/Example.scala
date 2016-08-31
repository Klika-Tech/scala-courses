package klikatech._7_week._2_collections._0_list._3_take_drop

import scala.annotation.tailrec

object Example extends App {

    // 1 - take
    println(List(0, 1, 2, 3).take(0))       // List()
    println(List(0, 1, 2, 3).take(1))       // List(0)
    println(List(0, 1, 2, 3).take(2))       // List(0, 1)
    println(List(0, 1, 2, 3).take(3))       // List(0, 1, 2)
    println(List(0, 1, 2, 3).take(100500))  // List(0, 1, 2, 3)


    def take[A](xs: List[A], k: Int): List[A] = {
        if (k == 0 || xs.isEmpty) Nil
        else xs.head :: take(xs.tail, k - 1)
    }


    println("\n----\n")


    // 2 - drop
    println(List(0, 1, 2, 3).drop(0))       // List(0, 1, 2, 3)
    println(List(0, 1, 2, 3).drop(1))       // List(1, 2, 3)
    println(List(0, 1, 2, 3).drop(2))       // List(2, 3)
    println(List(0, 1, 2, 3).drop(3))       // List(3)
    println(List(0, 1, 2, 3).drop(100500))  // List()


    @tailrec
    def drop[A](xs: List[A], k: Int): List[A] = {
        if (k == 0 || xs.isEmpty) xs
        else drop(xs.tail, k - 1)
    }


    println("\n----\n")


    // 2 - splitAt
    println(List(0, 1, 2, 3).splitAt(0))       // (List(),List(0, 1, 2, 3))
    println(List(0, 1, 2, 3).splitAt(1))       // (List(0),List(1, 2, 3))
    println(List(0, 1, 2, 3).splitAt(2))       // (List(0, 1),List(2, 3))
    println(List(0, 1, 2, 3).splitAt(3))       // (List(0, 1, 2),List(3))
    println(List(0, 1, 2, 3).splitAt(100500))  // (List(0, 1, 2, 3),List())


    val (take, drop) = List(0, 1, 2, 3).splitAt(2)  // take = (0, 1), drop = (2, 3)
    println(take) // List(0, 1)
    println(drop) // List(2, 3)

    def splitAt[A](xs: List[A], k: Int): (List[A], List[A]) = {
        Tuple2(xs.take(k), xs.drop(k))
    }


    println("\n----\n")


    // 3 - patch
    println(List(0, 1, 2, 3, 4, 5, 6).patch(2, List(100, 200), 3))
}
