package klikatech._2_week._2_pointless_style

object Example {
    // NOT pointless style"
    def f0: (Int => Int) = (x) => (1.+(x))

    // "pointless style" + NOT "point-free style"
    def f1: Int => Int = x => 1 + x

    def f2: (Int => Int) = ((x) => (1 + x)) // = f1 = f0

    // what is "(Int => Int)" - функция принимает тип Int и возвращает тип Int
    def g0(x: Int): Int  = (1 + x)
    def g1: (Int => Int) = g0

    // NOT "pointless style" + "point-free style", where point = argument
    def h0: (Int => Int) = 1.+(_) // = (x) => 1 + x, где x равен пробелу ("x" это агрумент функции типа Int)

    // "pointless style" + "point-free style"
    def h1: Int => Int = 1 + _  // _ = with placeholder

    def h2: (Int => Int) = 1 +  // without placeholder (not recommended)
}
