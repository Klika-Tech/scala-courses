package klikatech._3_week._1_call_by

import scala.util.Random

object CallByValue extends App {

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

    println("1 - call by value - evaluated only once")
    delayed(randomValue())

    println("2 - similarly")
    val rValue = randomValue()
    delayed(rValue)

}
