package klikatech._6_week._2_exceptions._3_exception_finally

object _2_TryFinallyResult extends App {

    val result: String = try {
        "abc"
    } finally {
        // eval, but not return
        1
    }
}
