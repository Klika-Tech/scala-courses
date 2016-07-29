package klikatech._6_week._2_exceptions._2_exception_try_catch

// catch = pattern matching anonymous partial function
// scalac -Xprint:parser _6_TryCatchMatchError.scala
object _6_TryCatchMatchError extends App {

    val error: PartialFunction[Throwable, Int] = {
        //case e: ArithmeticException => -1 // work
        //case e: Exception => -2 // work
        case e: Error => -3 // ArithmeticException vs scala.MatchError
    }

    val result: Any = try {
        10 / 0
    } catch error

    error.apply(new ArithmeticException)
}
