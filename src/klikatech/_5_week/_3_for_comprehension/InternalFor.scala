package klikatech._5_week._3_for_comprehension

object InternalFor extends App {

    // 1
    Array(10, 20, 30, 40).foreach(println); println("\n")

    List(10, 20, 30, 40).foreach(println); println("\n")

    (10 to 40).foreach(println); println("\n")

    // 2
    def fun(i: Int): Unit = {
        println(i)
    }

    Array(10, 20, 30, 40).foreach(fun); println("\n")

    Array(10, 20, 30, 40).foreach(item => fun(item)); println("\n")

    Array(10, 20, 30, 40).foreach { case predicate  => println(predicate) }
}
