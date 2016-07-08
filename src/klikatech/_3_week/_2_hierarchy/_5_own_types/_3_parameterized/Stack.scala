package klikatech._3_week._2_hierarchy._5_own_types._3_parameterized

class Stack[T] {
    var elems: List[T] = Nil
    def push(x: T): Unit = { elems = x :: elems }
    def top: T = { elems.head }
    def pop(): Unit = { elems = elems.tail }
}
