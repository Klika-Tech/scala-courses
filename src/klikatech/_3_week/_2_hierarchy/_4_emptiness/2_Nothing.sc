import klikatech._3_week._2_hierarchy._1_any_anyval_anyref.MyClass

/*
   abstract final class Nothing extends Any,
   http://www.scala-lang.org/api/current/index.html#scala.Nothing
   http://www.scala-lang.org/api/2.12.0-M4/scala/Nothing.html

            Any
         /      \
      AnyVal     AnyRef  ~= Object in java
                   ...
                    \
        ...          Null (null)
          \         /
            Nothing
*/

val mc1: MyClass[String] = new MyClass[Nothing]()
val mc2: MyClass[Int] = new MyClass[Nothing]()

// метод никогда ничего не возвращает, поэтому возвращаемый тип Nothing
def error(message: String): Nothing = throw new RuntimeException(message)
//error("Ops!")
//fun2
def fun3: Int => String = ???
//def fun = new Nothing // error, Nothing is abstract
def fun2 = ???
def div(x: Int, y: Int) =
    if (y != 0) x / y
    else sys.error("can't divide by zero")
