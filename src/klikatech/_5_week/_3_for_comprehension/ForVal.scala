package klikatech._5_week._3_for_comprehension

object ForVal extends App {

    // original
    for (i <- List(1, 2, 3); k = i * 10) {
        print(k + " ")
    }
    println("\n")

    // translated (long)
    List(1, 2, 3).map(i => { val k = i * 10; Tuple2(i, k) }).foreach({ case (i, k) => print(k + " ") })
    println("\n")

    // translated (short)
    List(1, 2, 3).map(i => Tuple2(i, i * 10)).foreach({ case (i, k) => print(k + " ") })
    println("\n")

    // v2
    List(1, 2, 3) map { item => (item, item * 10) } foreach { case (item, k) => println(s"item: $item, k: $k") }

    // v3
    List(1, 2, 3).map(_ * 10).foreach(print)
    // =
    List(1, 2, 3).map(item => item * 10).foreach(item => print(item))
}
