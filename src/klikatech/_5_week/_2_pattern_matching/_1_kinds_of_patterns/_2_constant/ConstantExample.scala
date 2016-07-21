package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._2_constant

import java.math.BigInteger

object ConstantExample extends App {

    val value = BigInteger.ONE

    // A constant pattern matches only itself. Any literal may be used as a constant.
    def describe(x: Any) = x match {
        case 5 => "five"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "the empty list" // also, any val or singleton object can be used as a constant.
        case BigInteger.ONE => "BigInteger.ONE" // or case `value`
        case _ => "something else"
    }

    println(describe(value))

}
