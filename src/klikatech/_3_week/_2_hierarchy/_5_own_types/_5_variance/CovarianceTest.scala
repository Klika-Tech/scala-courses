package klikatech._3_week._2_hierarchy._5_own_types._5_variance

trait Animal
class Mammal extends Animal
class Zebra extends Mammal

// Zebra -> Mammal -> Animal

class Field[A] {
    def get: A = ???
}

object CovarianceTest {

    def isLargeEnough(field: Field[Mammal]): Boolean = ???

    // Can we pass Zebra?
    // isLargeEnough(new Field[Zebra])
}
