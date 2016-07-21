package klikatech._5_week._3_for_comprehension

class MyRange(val from: Int, val to: Int) {
    // FilterMonadic
    def foreach(f: Int => Unit): Unit = {
        var current = from
        while (current <= to) {
            f(current)
            current += 1
        }
    }
}

object MyRange extends App {
    // эта запись транслируется в foreach
    for (i <- new MyRange(1, 10)) {
        println(i)
    }
}
