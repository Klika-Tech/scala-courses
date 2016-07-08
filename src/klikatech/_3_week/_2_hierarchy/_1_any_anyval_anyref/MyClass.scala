package klikatech._3_week._2_hierarchy._1_any_anyval_anyref

/*
   abstract class Any,
   http://www.scala-lang.org/api/current/index.html#scala.Any
   http://www.scala-lang.org/api/2.12.0-M4/scala/Any.html
   https://github.com/scala/scala/blob/2.12.x/src/library-aux/scala/Any.scala

   abstract class AnyVal extends Any,
   until 2.10 was sealed, from 2.10 we can extend it to build own Value Classes
   http://www.scala-lang.org/api/current/index.html#scala.AnyVal
   http://www.scala-lang.org/api/2.12.0-M4/scala/AnyVal.html

   AnyRef extends Any,
   http://www.scala-lang.org/api/current/index.html#scala.AnyRef
   http://www.scala-lang.org/api/2.12.0-M4/scala/AnyRef.html
   https://github.com/scala/scala/blob/2.12.x/src/library-aux/scala/AnyRef.scala

            Any
         /      \
      AnyVal     AnyRef  ~= Object in java

*/

// support classes
class MyClass[+T]
