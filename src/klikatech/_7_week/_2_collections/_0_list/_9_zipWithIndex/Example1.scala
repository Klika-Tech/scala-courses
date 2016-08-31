package klikatech._7_week._2_collections._0_list._9_zipWithIndex

object Example1 extends App {

    val fruit = List("apple", "pear", "orange", "pineapple")
    val fruit2 = List("apple2", "pear2", "orange2", "pineapple2")

    println(fruit zip fruit2)

    println(fruit.zipWithIndex)
    println(fruit.zipWithIndex.unzip)

    fruit.zipWithIndex.unzip match { case (x, y) =>
        println(x)
    }
}
