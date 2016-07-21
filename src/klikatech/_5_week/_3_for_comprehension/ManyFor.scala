package klikatech._5_week._3_for_comprehension

object ManyFor extends App {

    for (i <- List(1, 2, 3); j <- List(10, 20, 30)) {
        println(i + j)
    }
    println("\n")

    // without ; (pretty)
    for {
        i <- List(1, 2, 3) // +if
        j <- List(10, 20, 30) // +if
    } {
        println(i + j)
    }
    println("\n")

    // translated to "foreach"
    List(1, 2, 3).foreach(i => List(10, 20, 30). foreach(j => println(i + j)))

}
