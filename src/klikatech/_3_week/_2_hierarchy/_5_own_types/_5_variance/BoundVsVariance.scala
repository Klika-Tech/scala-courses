package klikatech._3_week._2_hierarchy._5_own_types._5_variance

class Animal
class Dog extends Animal

class Car
class SportCar extends Car

// Coll[+B]
// Variance - полезно, когда мы хотим работать с коллекциями,
// которые повторяют отношения оригинальных классов: B -> A, Coll[B] -> Coll[A]
case class List[+B](elems: B*)


// Coll[A <: B]
// Bounds - полезно, когда хотим быть generic-like, при этом требуем некоторый набор методов из B
case class Barn[A <: Animal](animals: A*)

object BoundVsVariance extends App {
    // Разница между A <: B и +B?

    // Variance
    val animals: List[Animal] = List(new Dog, new Animal)
    val cars: List[Car] = List(new SportCar, new Car)

    // Bounds
    val animalsBarn: Barn[Animal] = Barn(new Dog, new Animal)
    // val carBarn = Barn(new Car) // error
}
