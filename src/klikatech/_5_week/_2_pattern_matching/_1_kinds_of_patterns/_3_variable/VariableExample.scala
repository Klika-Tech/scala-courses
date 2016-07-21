package klikatech._5_week._2_pattern_matching._1_kinds_of_patterns._3_variable

object VariableExample extends App {

    def checkZero(value: AnyVal): String = {
        value match {
            case 0 => "zero"
            case somethingElse => "not zero: " + somethingElse
        }
    }

    println(checkZero(0))
    println(checkZero(10))

    def strangeMath(): String = {
        val pi = math.Pi
        math.E match {
            case pi => "strange math? Pi = " + pi // Warning: patterns after a variable pattern cannot match (SLS 8.1.1)
            case _ => "OK" // Warning: unreachable code due to variable pattern 'pi' on line 18
        }
    }

    println(strangeMath())

    def strangeMathOK() = {
        val pi = math.Pi
        math.E match {
            case `pi` => "Pi = " + pi
            case _ => "OK"
        }
    }

    println(strangeMathOK())

}
