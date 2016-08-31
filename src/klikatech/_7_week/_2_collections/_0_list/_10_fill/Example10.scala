package klikatech._7_week._2_collections._0_list._10_fill

object Example10 extends App {

    println(List.fill(0)(5))
    println(List.fill(5)(0))
    println(List.fill(5)("test"))

    println(List.fill(2, 3)(0))

    println(List.fill(2, 3, 4)(0))
}
