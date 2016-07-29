package klikatech._6_week._1_tuples._5_general

/*
    Algebraic Data Type
       /             \
  Product Types     Sum Types (variant types) (List(Nil, Cons), Tree(Empty, Leaf, Node) ...)
    /
  Tuple

 */

object CartesianProduct extends App {

    // Каждый тапл = это декартово произведение компонентов (cartesian product)

    // Tuple2 -> Product2 -> Product
    // Product has:
    // - productElement
    // - productArity
    // - productIterator
    // - productPrefix

    val person = Tuple2("Ivan", 30)

    val arity: Int = person.productArity // размерность тапла
    println(arity)

    val iterator: Iterator[Any] = person.productIterator
    person.productIterator.foreach(println)
    person.productIterator.foreach(iterator => println(iterator))

    val name = person.productElement(0)
    val age = person.productElement(1)
    println(name + " - "+ age)

    //val error = person.productElement(2) // java.lang.IndexOutOfBoundsException

    val prefix = person.productPrefix
    println(prefix)
}
