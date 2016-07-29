package klikatech._6_week._1_tuples._4_object

/*
    Programming in Scala: A Comprehensive Step-by-Step Guide, 2nd Edition - Odersky, Spoon, Venners.
    Its title is Object Equality and it’s just 25 pages long!
 */
object TupleProperties extends App {

    val mark0 = ("Mark", 42)
    val mark1 = ("Mark", 42)

    println(mark0.toString())
    println(mark1.toString())

    println(mark0.equals(mark1))    // true
    println(mark0.eq(mark1))        // false, сравнение ссылок
    println(mark0.==(mark1))        // true

    println(mark0.hashCode() == mark1.hashCode()) // true

    println(System.identityHashCode(mark0) == System.identityHashCode(mark1)) // false, сравнение hash кода с Object

    println("Properties:")
    // 1 - a tuple may contain multiple instances of the same element
    println((1, 2, 2, 3) !=(1, 2, 3))           // true
    println(Set(1, 2, 2, 3) == Set(1, 2, 3))    // true

    // 2 - tuple elements are ordered
    println((42, "Mark") !=("Mark", 42))        // true
    println(Set(42, "Mark") == Set("Mark", 42)) // true

    // 3 - a tuple has a finite number of elements, while a set or a multiset may have an infinite number of elements.
    Tuple22
}
