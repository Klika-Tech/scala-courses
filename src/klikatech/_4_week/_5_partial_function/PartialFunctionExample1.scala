package klikatech._4_week._5_partial_function

object PartialFunctionExample1 extends App {

    val partialFunction: PartialFunction[Int, String] = {
        case 0 => "+0"
        case 1 => "+1"
        case 2 => "+2"
    }

    partialFunction.runWith(println)(0)
    partialFunction.runWith(println)(1)
    partialFunction.runWith(println)(2)

    val preResult: (Int => Boolean) = partialFunction.runWith(println)
    preResult(0)
    preResult(1)
    println("preResult of 2: " + preResult(2))
    println("preResult of 3: " + preResult(3))

    val default = (i: Int) => "<undefined>"
    println {
        partialFunction applyOrElse(2, default)
    }

    val optionResult: Int => Option[String] = partialFunction.lift
    println {
        optionResult(-1)
    }

    // partialFunction == partialFunction2
    val partialFunction2: PartialFunction[Int, String] = Function.unlift(optionResult)

    println(partialFunction2(0))

}
