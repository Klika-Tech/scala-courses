package klikatech._1_week._1_object

class Example1 {
    def f(x: Int): Int = x * x
}

// companion object
object Example1 {
    def g(x: Int): Int = x * x
}

object Main1 {
    def main(args: Array[String]): Unit = {
        val p1 = new Example1().f(2)  // Java class-instance method | Scala class method
        val p2 = Example1.g(2)        // Java static method         | Scala object method

        // 1
        println("Example1: " + p1)
        println("Example2: " + p2)
    }
}
