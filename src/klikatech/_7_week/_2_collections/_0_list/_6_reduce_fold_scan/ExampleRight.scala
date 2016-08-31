package klikatech._7_week._2_collections._0_list._6_reduce_fold_scan

object ExampleRight extends App {

    val abc = List("A", "B", "C")

    def add(x: String, res: String) = {
        println(s"op: $x + $res = ${x + res}")
        x + res
    }

    abc.reduceRight(add)
    // op: B + C = BC
    // op: A + BC = ABC     // accumulates value BC in *second* operator arg `res`
    // res: String = ABC

    println("-------------")

    abc.foldRight("z")(add)
    // op: C + z = Cz
    // op: B + Cz = BCz
    // op: A + BCz = ABCz
    // res: String = ABCz

    println("-------------")

    val res0 = abc.scanRight("z")(add)
    // op: C + z = Cz
    // op: B + Cz = BCz
    // op: A + BCz = ABCz
    // res: List[String] = List(ABCz, BCz, Cz, z)

    println(res0)

    println(Nil.foldLeft("z")(add))
    println(Nil.scanLeft("z")(add))
}
