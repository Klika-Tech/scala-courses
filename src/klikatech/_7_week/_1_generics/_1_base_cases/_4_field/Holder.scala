package klikatech._7_week._1_generics._1_base_cases._4_field

/*
    class Holder[T](var value: T)    +
    class Holder[T](val value: T)    +

    class Holder[+T](var value: T)   -
    class Holder[+T](val value: T)   +

    class Holder[-T](var value: T)   -
    class Holder[-T](val value: T)   -

    class Holder[-T](value: T) // without val & var
*/

class Holder[+T](val value: T)
// or
case class CaseHolder[+T](value: T) // "value: T" = "val value: T"
