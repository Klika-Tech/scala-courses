package klikatech._6_week._2_exceptions._3_exception_finally

// don't use return in finally block = rewrite result!
object _7_TryFinallyException extends App {

    // Exception
    def result: Int = try {
        throw new RuntimeException
    } finally {
        -1 //throw new Exception
    }

    println(result)
}
