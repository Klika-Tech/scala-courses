/*
   object Nil extends List[Nothing] with Product with Serializable,
   http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Nil$
   http://www.scala-lang.org/api/2.12.0-M4/scala/collection/immutable/Nil$.html
*/
val emptyList = Nil

var x1 = 1 :: 28 :: Nil // compiled to (Nil.::(28)).::(1)
// or create list as
var x2: List[Int] = List(1, 28)

x1 = Nil
// vs
x2 = null

// right-associative method  ::
1 :: 2 :: 3 :: Nil // to
Nil.::(2).::(1).::(3)
//Nil::1::2::3 // compile error

1 +: 2 +: Nil // to
Nil.+:(2).+:(1)

1 +: 5 +: Nil
// vs
Nil :+ 5 :+ 1

// right-associative method  :::
List(1, 2) ::: Nil
Nil.:::(List(1, 2))

val list = List(1, 2, 3) ::: List(4, 5, 6)
list :+ 7
7 +: list

List(4) ::: 5 :: Nil
//Nil:+5:::List(4) // compile error
List(1) :+ 5 +: Nil :+ 5 // List[List[Int]]
Nil :+ 5 +: Nil // List[List[Int]]
