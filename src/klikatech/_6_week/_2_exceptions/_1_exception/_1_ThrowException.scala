package klikatech._6_week._2_exceptions._1_exception

object _1_ThrowException extends App {

    throw new Exception("Hello")

    throw new MyException("Hello")

    val e = new Exception("Hello")

    throw e
}
