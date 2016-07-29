package klikatech._6_week._2_exceptions._3_exception_finally

object _5_TryFinallyReturn extends App {

    // val not compile
    def result: String = try {
        // 10 / 0
        "abc"
    } finally {
        return "finally value" // -1
    }

    println(result)
}
