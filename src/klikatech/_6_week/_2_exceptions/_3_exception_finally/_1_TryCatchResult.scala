package klikatech._6_week._2_exceptions._3_exception_finally

object _1_TryCatchResult extends App {

    val result: String = try {
        "abc"
    } catch {
        case e: Exception => "error" // -1
    }
}
