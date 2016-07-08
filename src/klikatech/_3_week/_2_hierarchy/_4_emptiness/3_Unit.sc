/*
   abstract final class Unit extends AnyVal,
   http://www.scala-lang.org/api/current/index.html#scala.Unit
   http://www.scala-lang.org/api/2.12.0-M4/scala/Unit.html

            Any
         /      \
      AnyVal     AnyRef  ~= Object in java
         \          ...
          Unit       \
        ...          Null (null)
          \         /
            Nothing
*/
val u: Unit = () // value of Unit type = ()

def printHello(x: Unit) = { println("Hello"); () }

printHello()
/*
warning:
Adaptation of argument list by inserting () has been deprecated:
this is unlikely to be what you want.
    signature: printHello(x: Unit): Unit
    given arguments: <none>
    after adaptation: printHello((): Unit)
*/

printHello((): Unit) // it's ok

printHello(()) // it's ok

