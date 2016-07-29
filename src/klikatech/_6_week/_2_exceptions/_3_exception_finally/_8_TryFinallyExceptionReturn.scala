package klikatech._6_week._2_exceptions._3_exception_finally

// don't use return in finally block = rewrite result!
object _8_TryFinallyExceptionReturn extends App {

    // Exception
    def result: Int = try {
        return 0
    } finally {
        throw new Exception
    }

    println(result)
}
