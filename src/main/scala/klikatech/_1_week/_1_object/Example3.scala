package klikatech._1_week._1_object

class Example3 {
    def f(x: Int): Int = x * x
    def getG: Int = Example3.g(1)

    private def privateFn(x: Int) = x * x

    Example3.privateFn() // call private method
}

// companion object
object Example3 {
    def g(x: Int): Int = x * x
    def getF(x: Int) = new Example3().f(x)

    def call(x: Int) = new Example3().privateFn(x) // call private method

    private def privateFn() = println("I'm private function!")
}

object Main3 {
    def main(args: Array[String]): Unit = {
        val p1 = new Example3().f(2)  // Java class-instance method | Scala class method
        val p2 = Example3.g(2)        // Java static method         | Scala object method

        // 1
        println("Example1: " + p1)
        println("Example2: " + p2)

        // 2
        println("Example3: " + new Example3().getG)
        println("Example4: " + Example3.getF(2))

        // 3 - call private method
        println("Example4: " + Example3.call(2))

        // 4 - not access
        //Example3.privateFn()
        //new Example3().privateFn(2)
    }
}
