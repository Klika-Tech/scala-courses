package klikatech._1_week._2_unit

object Example {
    def f(callback: () => Unit): Unit = { println("Hello"); () }
    def g(callback: () => Unit): Unit = { println("Hello"); callback() }

    // for Repl, () vs Unit
    //def function0: () => Int = () => 5
    //def function1: Unit => Int = u => 5

    def main(args: Array[String]): Unit = {
        println(f(() => println("I'm callback")) + "\n")
        println(g(() => println("I'm callback")))
    }
}
