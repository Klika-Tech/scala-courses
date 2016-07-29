package klikatech._6_week._2_exceptions._2_exception_try_catch

import java.io.IOException

object _3_TryCatchPatternMatching extends App {

    //Int, Boolean, String, Unit = Any
    val result: Any = try {
        10 / 0
    } catch {
        case e: Error => "error"
        case e: ArithmeticException => -1
        case e: Exception => true
        case e => println("error") // Unit
        case _ => println("default") // Unit
    }

    println(result)

    try {
        throw new IllegalArgumentException
    } catch {
        // typed matching
        case e: IOException => println(s"IOException: $e")
        case e: RuntimeException => println(s"RuntimeException: $e")

        // all matching
        case e => println("error" + e.getMessage)
        case _ => println("default")
    }
}
