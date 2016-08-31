package klikatech._7_week._2_collections._2_set

import scala.collection.immutable.{SortedSet, HashSet}

object Example1 extends App {

    println(List(4,5,6,7,8,9))

    // 1
    val country = Set("Russia", "Denmark", "Sweden")
    println(country)

    var ids : Set[Int] = Set(4,5,6,7,8,9)
    println(ids) // Set(5, 6, 9, 7, 8, 4)

    var ids2 : Set[Int] = HashSet(4,5,6,7,8,9)
    println(ids2)

    var ids3 : Set[String] = SortedSet("d", "c", "a", "b")
    println(ids3)

    // 2
    val names = scala.collection.mutable.SortedSet[String]()
    names += "Kim"
    names += "Al"
    names += "Terry"
    names += "Julia"

    println(names)
}
