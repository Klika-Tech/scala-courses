package klikatech._2_week._5_expressions

object Blocks {

    val x0 = {1}

    val x1 = {1; "Hello"}

    val x2 = {
        1
        "Hello"
    }

    val x3: Int = {
        import scala.util._
        println("Hello")
        1 + 2
    }

    /*
        Unit is a subtype of scala.AnyVal.
        There is only one value of type Unit, (), and it is not represented by any object in the underlying runtime system.
        A method with return type Unit is analogous to a Java method which is declared void.
     */
    val y0 = {} // {} is ()
    val y1: Unit = {()} // literal () type Unit
    val y2: Unit = ()
    val y3 = ()
}
