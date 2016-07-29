package klikatech._6_week._2_exceptions._2_exception_try_catch

// "catch" = pattern matching anonymous partial function
object _4_TryCatchPartialFunction extends App {

    val error: PartialFunction[Throwable, Int] = { // "Function" not compile
        case e: ArithmeticException => -1
    }

    val result: Any = try {
        10 / 0
    } catch error
}

