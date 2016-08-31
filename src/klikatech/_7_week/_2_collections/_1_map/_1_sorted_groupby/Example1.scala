package klikatech._7_week._2_collections._1_map._1_sorted_groupby

object Example1 extends App {

    // sortWith and sorted
    //
    val fruit = List("apple", "pear", "orange", "pineapple")

    val fruit0 = fruit.sortWith(_.length < _.length) // List("pear", "apple", "orange", "pineapple")
    val fruit1 = fruit.sorted                        // List("apple", "orange", 'pear", "pineapple")

    println(fruit0)
    println(fruit1)

    // groupBy
    //
    val fruit2 = fruit.groupBy(_.head)      // Map(
                                            //     p -> List(pear, pineapple),
                                            //     a -> List(apple),
                                            //     o -> List(orange)
                                            // )
    println(fruit2)
}
