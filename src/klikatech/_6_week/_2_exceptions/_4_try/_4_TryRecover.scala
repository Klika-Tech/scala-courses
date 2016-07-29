package klikatech._6_week._2_exceptions._4_try

import java.net.{MalformedURLException, URL}

import scala.util.Try

/*

       Option[A] is a container for a value of type A that may be present or not
      /        \
   Some[A]     None

       Try[A] represents a computation that may result in a value of type A, if it is successful, or in some Throwable if something has gone wrong.
      /     \
Success[A] Failure[A]

 */

object _4_TryRecover extends App {

    def parseUrl(url: String): Try[URL] = Try(new URL(url))

    println(parseUrl("www.scala-lang.org") getOrElse new URL("http://duckduckgo.com"))

    // or

    // If recover is called on a Success instance, that instance is returned as is.
    println(parseUrl("http://www.scala-lang.org") recover { case e: MalformedURLException => new URL("http://duckduckgo.com") })

    // Otherwise, if the partial function is defined for the given Failure instance, its result is returned as a Success.
    val result = parseUrl("www.scala-lang.org") recover { case e: MalformedURLException => new URL("http://duckduckgo.com") }
    println(result.get) // safely get

}
