package klikatech._7_week._1_generics._0_java_arrays

/*
    Java: USE defined variance          = место использования
    Scala: DEFINITION defined variance  = место объявления

    [T]  = non-variant
    [+T] = co-variant
    [-T] = contra-variant
 */
class MyClass[T]

object Example3 extends App {

    val x1: MyClass[Object] = new MyClass[String] // +T

    val x2: MyClass[String] = new MyClass[Object] // -T

    val x3: MyClass[String] = new MyClass[String]

}
