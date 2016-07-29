package klikatech._6_week._2_exceptions._3_exception_finally

object _4_TryCatchFinallyReturn extends App {

    // val not compile
    def result: String = try {
        // 10 / 0
        "abc"
    } catch {
        case e: ArithmeticException => "error"
    } finally {
        return "finally value" // -1
    }

    println(result)
}
