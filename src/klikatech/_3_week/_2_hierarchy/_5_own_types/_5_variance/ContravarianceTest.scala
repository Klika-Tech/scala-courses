package klikatech._3_week._2_hierarchy._5_own_types._5_variance

trait Animal
class Mammal extends Animal
class Zebra extends Mammal

// Zebra -> Mammal -> Animal

class Vet[A] {
    def treat(a: A) = ???
}

object ContravarianceTest {

    /*
      Zoo has several vets.
      Some specialized for specific species (виды).
    */

    def treatMammals(vet: Vet[Mammal]) = ???

    // We need just one vet to treat all mammals of our zoo, right?

    // treatMammals(new Vet[Animal])
}
