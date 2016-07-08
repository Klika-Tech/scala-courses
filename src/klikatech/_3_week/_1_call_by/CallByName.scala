package klikatech._3_week._1_call_by

import scala.util.Random

object CallByName extends App {

    val random = Random

    def randomValue(): Int = {
        val v = random.nextInt()
        println("getting random value: " + v)
        v
    }

    def delayed(parameter: => Int) = {
        //parameter
        println("in delayed method")
        println("parameter: " + parameter)
        println("parameter: " + parameter)
        println("parameter: " + parameter)
    }

    println("1 - call by name - evaluated each time the argument is used")
    delayed(randomValue())

    println("2 - not the same - evaluated only once")
    val rValue = randomValue()
    delayed(rValue)

}
