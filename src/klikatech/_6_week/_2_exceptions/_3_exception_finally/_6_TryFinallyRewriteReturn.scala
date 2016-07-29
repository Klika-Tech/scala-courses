package klikatech._6_week._2_exceptions._3_exception_finally

// don't use return in finally block = rewrite result!
object _6_TryFinallyRewriteReturn extends App {

    def result1: Int = try {
        return 0
    } finally {
        return 1
    }

    def result2: Int = try {
        throw new Exception
    } finally {
        return 1
    }

    println(result1)
    println(result2)
}
