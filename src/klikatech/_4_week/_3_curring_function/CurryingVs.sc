// Currying vs Partially Applied Functions

// 1. частичный вызов функции

def fun(s: String, i: Int): String = s + i
val partial = fun("curry", _:Int)
val partial2 = fun(_:String, 20)
//
val result = partial(42)
//or

// errors:
//fun("curry", _)
//fun("curry")

// 2. каррирование

val curriedFunction: String => Int => String = fun _ curried
val one = curriedFunction("qwerty")(_:Int) // _ -> error
//val res00 = one _ // TODO
val res01 = one(_)
val res02 = one(_: Int)
//
res01(1)
res02(1)
//
def curry(s: String)(i: Int): String = s + i
// variant:
val first0: (Int => String) = curry("qwerty") // with type
val first1 = curry("qwerty") _
val first2 = curry("qwerty")(_)
val first3 = curry("qwerty")(_: Int)
// result:
first0(0)
first1(1)
first2(2)
first3(3)
//
// MORE
//
//def add(x: Int, y: Int): Int = x + y
def add1(x: Int, y: Int): Int = { // uncurried function
    x + y
}
val addCurried = add1 _ curried
//
//
// shorthand
def add2(x: Int)(y: Int): Int = {
    x + y
}
//
val unCurried = Function.uncurried(add2 _)
unCurried(1, 2)
//
//
// longhand
def add3(x: Int): (Int => Int) = {
    (y: Int) => {
        x + y
    }
}
// apply
addCurried(1)
add2(1) _
val pp: (Int => Int) = add2(1) : (Int => Int)
add3(1)
//
addCurried(1)(2)
add2(1)(2)
add3(1)(2)
//
val resAdd2 = (add2(1) _).apply(2)
val resAdd3 = add3(1).apply(2)