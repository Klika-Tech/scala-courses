package klikatech._2_week.homework

import scala.util.Random

class MyRandom {
  val seed = Random.nextInt()

  def nextInt(): Int = seed
}
