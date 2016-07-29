package klikatech._6_week._1_tuples._6_tupling.tupled_untupled

import scala.Function.{tupled, untupled}

object TupledUntupled extends App {

    // 1
    val t0: (String, Int) = ("Mark", 30)
    t0._1: String
    t0._2: Int

    // t0 == t1
    val t1: ((String, Int)) = ("Mark", 30)
    t1._1: String
    t1._2: Int


    // 2 - tupled
    val f: (String, Int) => Unit = ???

    val t2: ((String, Int)) => Unit = f.tupled
    val t3: ((String, Int)) => Unit = tupled(f)  // функция с одним тапл-аргументом
    //val t4: (String, Int) => Unit = f.tupled


    // 3 - untupled
    val f1: ((String, Int)) => Unit = ???

    val t5: (String, Int) => Unit = untupled(f1) // функция с двумя аргументами

    /// Apply

    // 1 - tupled
    val ft: (String, Int) => Unit = (name, age) => println(s"name: $name, age: $age")
    ft("Mark", 30)
    tupled(ft).apply(("Mark", 30)) // функция с одним тапл-аргументом
    // or
    tupled(ft)(("Mark", 30))


    // 2 - untupled
    val funt1: ((String, Int)) => Unit = (person) => println(s"name: ${person._1}, age: ${person._2}")
    // or
    val funt2: ((String, Int)) => Unit = { case (name, age) => println(s"name: $name, age: $age") }

    funt1(("Ivan", 42))
    untupled(funt1)("Ivan", 42) // функция с двумя аргументами
}
