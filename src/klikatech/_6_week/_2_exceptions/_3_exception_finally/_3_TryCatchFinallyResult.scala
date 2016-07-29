package klikatech._6_week._2_exceptions._3_exception_finally

object _3_TryCatchFinallyResult extends App {

    val result: String = try {
        // 10 / 0
        "abc"
    } catch {
        case e: ArithmeticException => "error"
    } finally {
        println("finally")
        1
    }

    println(result)
}
