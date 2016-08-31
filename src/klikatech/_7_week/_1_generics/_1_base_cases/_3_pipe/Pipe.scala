package klikatech._7_week._1_generics._1_base_cases._3_pipe

class A
class B extends A
class C extends B

class Pipe[T] {
    def get: T = ???                // co-variant position
    def set(arg: T): Unit = ???     // contra-variant position
    def f(arg: T): T = ???
}

object Main extends App {

    def f(pipe: Pipe[B]): Unit = {
        val res: B = pipe.get
        pipe.set(res)
        pipe.set(new B)
    }

    f(new Pipe[B])
}
