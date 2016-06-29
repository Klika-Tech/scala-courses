package klikatech._1_week._3_arrays_generics

import scala.util.Try

// Generics
object Example2 {
    // public final java.util.List list = java.util.Arrays.asList(1, 2, 3, 4);
    val list: List[Int] = List(0, 1, 2, 3, 4)
    val elem2: Int = list(2) // Java: list.get(2)
    //val elem5: Try[Int] = Try(list(5))

    def main(args: Array[String]) {
        println("elem2: " + elem2)
        //println("elem5: " + elem5.getOrElse(println("ops!")))
    }
}
