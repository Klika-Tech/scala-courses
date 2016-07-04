package klikatech._2_week._3_tuples_intro

class MyType(val x: Int)

object Example extends App {
    // syntactic sugar
    val t1 = ("Maria", 4, new MyType(10))

    println("t1: userName: " + t1._1 + ", userAge: " + t1._2)

    // Tuple3
    val t2 = Tuple3("Ivan", 28, new MyType(10))

    val (userName, userAge, _type) = t2

    println("t2: userName: " + userName + ", userAge: " + userAge)

    // import fields of tuple
    import t2.{_2 => age}
    println("t2: age: " + age)

    // Tuple4
    val t3 = ("Hello", 10, new MyType(5), ("Tuple", "String"))

    val t4 = Tuple4("Hello", 10, new MyType(5), Tuple2("Tuple", "String"))

    // without "type inference" - вывод типа scala'ой
    val t5: Tuple4[String, Int, MyType, Tuple2[String, Int]] = Tuple4("Hello", 10, new MyType(5), Tuple2("String", 10))

    // Tuple4 extends Product4 - cartesian product (декартово произведение)

    // usage
    def f: (Int, MyType) = {  // функция возвращает тип "Tuple2(Int, MyType)"
        // ... something
        (5, new MyType(9))
    }
}
