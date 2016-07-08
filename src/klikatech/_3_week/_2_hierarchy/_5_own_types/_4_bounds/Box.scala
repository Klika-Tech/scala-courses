package klikatech._3_week._2_hierarchy._5_own_types._4_bounds

trait Tool

trait Box[T <: Tool] // Box может содержать любой элемент типа T

trait Generic[T >: Null] { // Мы помним, что Null - это AnyRef
    private var field: T = null
}

class A extends Generic[String]
//class B extends Generic[Int] // error: type arguments [Int] do not conform to trait Generic's type parameter bounds [T >: Null]