
def curry: ((Int, Int) => Int) => Int => Int => Int =
    f => x => y => f(x, y)

// 1 ((Int, Int) => Int)
// 2 (Int => (Int => Int))
// 3 (Int => Int)

type XYtoInt = (Int, Int) => Int
type IntToInt = (Int => Int)

val curry0: XYtoInt => (Int => IntToInt) = {
    f: XYtoInt => {
        x: Int => {
            y: Int => f(x, y)
        }: IntToInt
    }
}

val xyFn = curry0((x,y) => x * y)

val yFn = xyFn(2) // x = 2
println(yFn)
println(yFn(4))   // y = 4