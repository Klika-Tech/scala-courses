import klikatech._3_week._2_hierarchy._1_any_anyval_anyref.MyClass

import scala.util.Try

// Any
val x: Any = if (true) "scala" else 5

println("\n==, !=, equals")
// The expression `x == that` is equivalent to `if (x eq null) that eq null else x.equals(that)`.
x.==(x)            // final def == (that: Any): Boolean
x.!=(x)           // final def != (that: Any): Boolean
x.equals(x)

println("\n##, hashCode")
x.##              // equivalent to `x.hashCode` except for boxed numeric types and `null`.
null.##
5.##
x.hashCode        // null.hashCode - NPE
Try(null.hashCode())
x.toString
x.isInstanceOf[String]
x.asInstanceOf[String]

// AnyVal
val double: Double = 10d    // 64-bit IEEE 754 single-precision float
val float: Float = 10f      // 32-bit IEEE 754 single-precision float
val long: Long = 10l        // (signed, -2^63 to 2^63 - 1, inclusive)
val int: Int = 10           // (signed, -2^31 to 2^31 - 1, inclusive)
val char: Char = 'c'        // (unsigned, 0 to 2^16 - 1, inclusive)
val short: Short = 10       // (signed, -2^15 to 2^15 - 1, inclusive)
val byte: Byte = 1          // (signed, -2^7 to 2^7 - 1, inclusive)
val boolean: Boolean = true // true || false
val unit: Unit = ()         // ()
val y: AnyVal = if (true) 10 else ()

// AnyRef
val text: String = "Hello"

// eq
println("3 eq properties:")

text.eq(null)
null.eq(text)
null.eq(null)
val myClass: MyClass[AnyRef] = new MyClass[String]