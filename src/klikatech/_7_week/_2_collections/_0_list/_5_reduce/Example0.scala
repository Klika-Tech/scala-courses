package klikatech._7_week._2_collections._0_list._5_reduce

object Example0 extends App {

    /*
        +, * = associative operator
        -, / = non associative operator
    */

    // reduceXXX: List[A] => A
    // reduceXXX: List() == Nil => UnsupportedOperationException

    val fn = (x: String, y: String) => x + y

    val x00: String = List("A", "B", "C").reduceRight(fn)

    println(x00)

    // (1, 2, 3, 4, 5) => (1, 2, 3, 4-5) => (1, 2, 3 - (4 - 5)) => ...
    val x0: Int = List(1, 2, 3, 4, 5).reduceRight(_ - _)
    val x1: Int = List(1, 2, 3, 4, 5).reduceRight((x: Int, y:Int) => x - y)

    // (1, 2, 3, 4, 5) => (1 - 2, 3, 4, 5) => ((1 - 2) - 3, 4, 5) => ...
    val x2: Int = List(1, 2, 3, 4, 5).reduceLeft(_ - _)

    val x3: Int = List(1, 2, 3, 4, 5).reduce(_ + _) // associative operation
    val x4: Int = List(1, 2, 3, 4, 5).reduce(_ * _) // associative operation

    val x5: Int = List(1, 2, 3, 4, 5).reduce(_ - _) // NON associative operation
    val x6: Int = List(1, 2, 3, 4, 5).reduce(_ / _) // NON associative operation

    println(x0)
    println(x1)
    println(x2)
}
