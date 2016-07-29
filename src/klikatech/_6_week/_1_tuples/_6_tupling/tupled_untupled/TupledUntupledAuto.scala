package klikatech._6_week._1_tuples._6_tupling.tupled_untupled

object TupledUntupledAuto extends App {

    // 1 - auto-untupling = error
    val f: (String, Int) => Unit = (name, age) => println(s"name: $name, age: $age")

    f("Mark", 30)
    //f(("Mark", 30))  // auto-untupling = error


    // 2 - auto-tupling = Ok
    val f1: ((String, Int)) => Unit = (person) => println(s"name: ${person._1}, age: ${person._2}")

    f1(("Ivan", 42))
    f1("Ivan", 42)    // <- auto-tupling!

    // 3 - strange behavior...
    println(1,2,3,4,5,6,7,8,9)

    val p = Some(1,2,3,4,5,6,7,8,9)
    println(p)

}
