package klikatech._7_week._2_collections._0_list._6_reduce_fold_scan

object ExampleLeft extends App {

    val abc = List("A", "B", "C")

    def add(res: String, x: String) = {
        println(s"op: $res + $x = ${res + x}")
        res + x
    }

    abc.reduceLeft(add)
    // op: A + B = AB
    // op: AB + C = ABC     // accumulates value AB in *first* operator arg `res`
    // res: String = ABC

    println("-------------")

    abc.foldLeft("z")(add) // with start value "z"
    // op: z + A = zA      // initial extra operation
    // op: zA + B = zAB
    // op: zAB + C = zABC
    // res: String = zABC

    println("-------------")

    val res0 = abc.scanLeft("z")(add)
    // op: z + A = zA                             // same operations as foldLeft above...
    // op: zA + B = zAB
    // op: zAB + C = zABC
    // res: List[String] = List(z, zA, zAB, zABC) // maps intermediate results

    println(res0)

    println(Nil.foldLeft("z")(add))
    println(Nil.scanLeft("z")(add))
}
