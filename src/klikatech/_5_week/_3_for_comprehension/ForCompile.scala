package klikatech._5_week._3_for_comprehension

// scalac -Xshow-phases
// scalac -Xprint:parser ForCompile.scala
class ForCompile {
    for (i <- Array(1, 2, 3, 4)) {
        println(i)
    }
}
