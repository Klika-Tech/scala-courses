package klikatech._5_week._3_for_comprehension

// scalac -Xprint:parser ForIf.scala
object ForIf extends App {

    // original
    //for (i <- Array(-1, 0, 1, 2, 3, 4) if i > 0 if i < 3) {
    for (i <- Array(-1, 0, 1, 2, 3, 4) if i > 0) {
        print(i)
    }
    println("\n")

    // translated:
    //Array(-1, 0, 1, 2).withFilter(_ > 0).withFilter(_ < 3).foreach(item => print(item))
    Array(-1, 0, 1, 2).withFilter(_ > 0).foreach(item => print(item))
    println("\n")
}
