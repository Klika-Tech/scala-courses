package klikatech._5_week._3_for_comprehension

object TranslatedFor {

    // 1
    // for loop
    for (item <- Array(1, 2, 3)) {
        println(item)
    }

    // translated to "foreach"
    Array(1, 2, 3).foreach(item => println(item)) // Unit result type


    // 2
    // for comprehension
    val result1: Array[Int] = for (item <- Array(1, 2, 3))
        yield item * item

    //translated to "map"
    val result2: Array[Int] = Array(1, 2, 3).map(item => item * item)
}
