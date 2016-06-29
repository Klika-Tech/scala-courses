package klikatech._2_week._2_pointless_style

// Method call, pointless style
class MyInt(val i: Int) {    // or case class MyInt(i: Int)
    def +(that: MyInt): MyInt = MyInt(this.i + that.i)
}

object Main extends App {
    val x = MyInt.apply(5)
    val y = MyInt.apply(10)

    val result0 = x.+(new MyInt(5))
    // OR
    val result1 = x + y // this is "pointless style" без точки и круглых скобок

    println("Result: " + result0.i)
}

object MyInt { // remove object, if MyInt is case class
    def apply(i: Int) = new MyInt(i) // ~= constructor
}
