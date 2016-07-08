package klikatech._3_week._1_call_by

import scala.util.Random

object CallByNeed extends App {

    val random = Random

    def randomValue(): Int = {
        val v = random.nextInt()
        println("getting random value: " + v)
        v
    }

    def delayed(parameter: Int) = {
        println("in delayed method")
        println("parameter: " + parameter)
        println("parameter: " + parameter)
        println("parameter: " + parameter)
    }

    println("1 - call by need - evaluated only once and cashed")
    lazy val rValue = randomValue()
    println("start...")
    delayed(rValue)
    delayed(rValue)

}
