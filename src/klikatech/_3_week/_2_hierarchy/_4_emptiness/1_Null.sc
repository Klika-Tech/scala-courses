import klikatech._3_week._2_hierarchy._1_any_anyval_anyref.MyClass

/*
   abstract final class Null extends AnyRef,
   http://www.scala-lang.org/api/current/index.html#scala.Null
   http://www.scala-lang.org/api/2.12.0-M4/scala/Null.html

            Any
         /      \
      AnyVal     AnyRef  ~= Object in java
                   ...
                    \
                    Null (null)

*/

var text = "Hello"
text = null
var nullValue: Null = null
//var i: Int = null // error

var list: List[String] = List("a", "b", "c")
list = nullValue // ok

val mc1: MyClass[String] = new MyClass[Null]
//val mc2: MyClass[Int] = new MyClass[Null] // error
