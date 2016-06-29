package klikatech._1_week._1_object

class Example2 {
    def f(x: Int): Int = x * x
    def getG: Int = Example2.g(1)
}

// companion object
object Example2 {
    def g(x: Int): Int = x * x
    def getF(x: Int) = new Example2().f(x)
}

object Main2 {
    def main(args: Array[String]): Unit = {
        val p1 = new Example2().f(2)  // Java class-instance method | Scala class method
        val p2 = Example2.g(2)        // Java static method         | Scala object method

        // 1
        println("Example1: " + p1)
        println("Example2: " + p2)

        // 2
        println("Example3: " + new Example2().getG)
        println("Example4: " + Example2.getF(2))
    }
}
