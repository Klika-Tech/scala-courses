package klikatech._5_week._3_for_comprehension

object ForYieldFilter extends App {

    // origin
    val result1: List[Int] = for {
        item <- List(-1, 0, 1, 2, 3) if item > 0 if item < 3
    } yield item * 10

    println(result1)

    // translated: more preference
    val result2: List[Int] = List(1, 2, 3, 4, 5)
            .withFilter(_ > 0)
            .withFilter(_ < 3)
            .map(item => item * 10)

    println(result2)

    // translated: less preference
    val result3: List[Int] = List(1, 2, 3, 4, 5)
            .filter(_ > 0)
            .filter(_ < 3)
            .map(item => item * 10)

    println(result3)
}
