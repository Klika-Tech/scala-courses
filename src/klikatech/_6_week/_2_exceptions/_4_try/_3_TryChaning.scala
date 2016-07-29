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

object _3_TryChaning extends App {

    def parseUrl(url: String): Try[URL] = Try(new URL(url))

    val result: Try[String] = for {
        url1 <- parseUrl("http://www.scala-lang.org") // delete protocol
        url2 <- parseUrl("http://www.scala-lang.org")
        url3 <- parseUrl("http://www.scala-lang.org")
        url4 <- parseUrl("http://www.scala-lang.org")
    } yield url4.getHost

    println(result)
}
