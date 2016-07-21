package klikatech._5_week._3_for_comprehension

/*
    ----------------------------------------------------------------
    what?                in code:                      return type:
    ----------------------------------------------------------------
    For Loop             = keywords "for"              Unit
    For Comprehension    = keywords "for" + "yield"    T
    ----------------------------------------------------------------
*/
object ForYield extends App {

    // origin
    val result1: List[Int] = for (item <- List(1, 2, 3, 4, 5)) yield item * 10
    println(result1)

    // translated (long)
    val result2: List[Int] = List(1, 2, 3, 4, 5).map(item => item * 10)
    println(result2)

    // translated (short)
    val result3 = List(1, 2, 3, 4, 5).map(_ * 10)
    println(result3)

    // functional style
    val result4 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil map (_ * 10)
    println(result4)
}
