package klikatech._6_week._1_tuples._6_tupling.cartesian

object CartesianToCartesianEq extends App {

    trait Tuple[A, B, C, D] {

        val fun0: (A, B) => (C, D)
        val fun1: ((A, B)) => (C, D)

        // f0 != fun0
        // f0 == fun1
        val f0: Function[(A, B), (C, D)] = new Function[(A, B), (C, D)] {
            override def apply(v1: (A, B)): (C, D) = ???
        }

        // f1 == fun0
        // f1 != fun1
        val f1: Function2[A, B, (C, D)] = new Function2[A, B, (C, D)] {
            override def apply(v1: A, v2: B): (C, D) = ???
        }
    }
}
