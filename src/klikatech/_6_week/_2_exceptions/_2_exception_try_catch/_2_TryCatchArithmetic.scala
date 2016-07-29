package klikatech._6_week._2_exceptions._2_exception_try_catch

object _2_TryCatchArithmetic extends App {

    // statement
    try {
        10 / 0
    } catch {
        case e: ArithmeticException => println("error")
    }

    // and expression!
    // Int, Unit = AnyVal
    val result1: AnyVal = try {
        10 / 0
    } catch {
        case e: ArithmeticException => println("error") // Unit
    }

    val result2: Int = try {
        10 / 0
    } catch {
        case e: ArithmeticException => -1
    }

    val result3: Any = try {
        10 / 0
    } catch {
        case e: ArithmeticException => "error"
    }

    val result4: Unit = try {
        { 10 / 0; () }
    } catch {
        case e: ArithmeticException => // () // Unit
    }

}
