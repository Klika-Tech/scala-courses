package klikatech._6_week._1_tuples._1_intro

object Intro extends App {

    val t0 = ("Tuple", ("Inner Tuple", 10), 10)
    t0._1: String
    t0._2: (String, Int)
    t0._2._1: String
    t0._2._2: Int
    t0._3: Int

    val t2: Tuple3[String, Tuple2[String, Int], Int] = Tuple3("Tuple", Tuple2("Inner Tuple", 10), 10)
}
