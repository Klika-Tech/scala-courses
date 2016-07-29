package klikatech._6_week._2_exceptions._4_try

import scala.util.Try

/*

       Option[A] is a container for a value of type A that may be present or not
      /        \
   Some[A]     None

       Try[A] represents a computation that may result in a value of type A, if it is successful, or in some Throwable if something has gone wrong.
      /     \
Success[A] Failure[A]

 */

object _5_TryRecoverOrRecoverWith extends App {

    // recover
    println(Try(6 / 0) recover { case e: ArithmeticException => 0 }) // result: 0
    println(Try(6 / 0) recover { case e: IllegalArgumentException => 0 }) // result: exception
    println(Try(6 / 2) recover { case e: ArithmeticException => 0 })     // result: 3

    // recoverWith
    val t = Try(Int.MaxValue)
    println(Try(6 / 0) recoverWith { case e: ArithmeticException => t }) // result: Int.MaxValue

    /*  Resume:

        1) recover wraps plain result in Try for you (analogue of map)
        2) recoverWith expects Try as the result (analogue of flatMap)

        If you recover with something that already returns Try, use recoverWith, otherwise use recover.
     */
}
