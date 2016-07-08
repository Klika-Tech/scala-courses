package klikatech._3_week._2_hierarchy._2_java_scala_equals

// more - Chapter 30, Programming in Scala
object ScalaEquals extends App {

    def isEqualPrimitive(x: Int, y: Int) = x == y

    def isEqualReference(x: Any, y: Any) = x == y

    def isEqualString(x: String, y: String) = x == y

    println("Primitive | Reference")
    println(isEqualPrimitive(421, 421))         // true
    println(isEqualReference(421, 421))         // true

    println("\nString")
    println(isEqualString("abc".substring(2), "abc".substring(2))) // true
    println("abc" == "abc")                     // true

    val x = "abc"
    val y = new String("abc")
    println(x == y)                             // true

    /*  Paul Phillips:
        comparing two primitives (boxed or unboxed) with ==
        should always give the result you would have gotten by comparing those values as unboxed primitives.
        When you call equals directly,
        you are skipping all that softening logic and instead treated to java's theory
        that two boxed values of different types are always unequal.
     */
}
