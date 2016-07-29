package klikatech._6_week._1_tuples._6_tupling.cartesian

object CartesianToCartesian extends App {

    trait Tuple[A, B, C, D] {

        val a: ((A, B)) => (C, D)    // cartesian => cartesian

        val b: (A, B) => (C, D)      // ??? => cartesian
    }

    trait Tuple2[A, B, C, D] {

        def a(p: (A, B)): (C, D)      // cartesian => cartesian

        def b(p1: A, p2: B): (C, D)   // ??? => cartesian
                                      // ??? = пара аргументов, не tuple
    }

    class MyTuple extends Tuple[Int, Int, String, String] {
        override val a: ((Int, Int)) => (String, String) = ???
        a((1,2))

        override val b: (Int, Int) => (String, String) = ???
        b(1, 2)
    }

    class MyTuple2 extends Tuple2[Int, Int, String, String] {
        override def a(p: (Int, Int)): (String, String) = ???

        override def b(p1: Int, p2: Int): (String, String) = ???
    }
}
