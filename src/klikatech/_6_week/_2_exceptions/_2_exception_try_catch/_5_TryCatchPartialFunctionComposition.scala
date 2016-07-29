package klikatech._6_week._2_exceptions._2_exception_try_catch

// catch = pattern matching anonymous partial function
object _5_TryCatchPartialFunctionComposition extends App {

    val error1: PartialFunction[Throwable, Int] = {
        case e: ArithmeticException => -1
    }

    val error2: PartialFunction[Throwable, Int] = {
        case e: Exception => -2
    }

    val result: Any = try {
        10 / 0
    } catch error1 orElse error2
    //} catch error1.orElse(error2)
    // можно строить композицию catch блоков
}
