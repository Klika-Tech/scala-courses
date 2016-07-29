package klikatech._6_week._2_exceptions._4_try

import java.net.URL

import scala.util.{Failure, Success, Try}

/*

       Option[A] is a container for a value of type A that may be present or not
      /        \
   Some[A]     None

       Try[A] represents a computation that may result in a value of type A, if it is successful, or in some Throwable if something has gone wrong.
      /     \
Success[A] Failure[A]

 */

object _1_Try extends App {

    def parseUrl(url: String): Try[URL] = Try(new URL(url))

    parseUrl("http://www.scala-lang.org") match {
        case Success(url) => println(url)
        case Failure(e) => println("failure")
    }
}
