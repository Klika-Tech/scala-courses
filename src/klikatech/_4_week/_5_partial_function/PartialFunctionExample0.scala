package klikatech._4_week._5_partial_function

// Partially Applied != Partial Function
object PartialFunctionExample0 extends App {

    val f0: PartialFunction[Int, String] = { case 0 => "+0"; case 1 => "-1" }
    val f1: PartialFunction[Int, String] = { case 1 => "+1"; case 2 => "-2" }
    val f2: PartialFunction[Int, String] = { case 2 => "+2" }

    val result: PartialFunction[Int, String] = f0  orElse f1 orElse f2

    println(result(1))
}
