package klikatech._6_week._1_tuples._6_tupling.cartesian

trait CartesianToCartesianResume {

    // a1 == a2, тапл в тапл
    val a1: ((Int, Int)) => (Int, Int)      // cartesian => cartesian

    val a2: ((Int, Int)) => ((Int, Int))    // cartesian => ???


    // b1 == b2, два аргумента в тапл
    val b1: (Int, Int) => (Int, Int)        // ??? => cartesian

    val b2: (Int, Int) => ((Int, Int))      // ??? => ???
}
