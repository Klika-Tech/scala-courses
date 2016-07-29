package klikatech._6_week._2_exceptions._1_exception

object _3_ThrowStatementVsExpression extends App {

    // statement
    throw new Exception

    // and expression!
    val e: Nothing = throw new Exception

    val x: String = e // согласование типов

    val y: Int = e
}
