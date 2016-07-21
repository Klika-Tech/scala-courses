package klikatech._5_week._3_for_comprehension

import scala.runtime.RichInt

object ExternalFor extends App {

    for (i <- 1 to 3) {
        println(i)
    }

    // implicit conversion: Int -> RichInt
    for (i <- new RichInt(1).to(3)) {
        println(i)
    }

    val range: Range = new RichInt(1).to(3)
    for (i <- range) {
        println(i)
    }

    val result: Unit = for (i <- range) {
        println(i)
    }
}
