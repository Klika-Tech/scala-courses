package klikatech._5_week._3_for_comprehension

object ManyForYield extends App {

    // origin
    val result1: List[Int] =
        for (i <- List(1, 2, 3); j <- List(10, 20, 30)) yield i * j

    println(result1)

    // translated
    val result2: List[Int] = List(1, 2, 3)
        .flatMap(i => List(10, 20, 30).map(j => i * j))

    println(result2)

    // why flatMap?
    val result3: List[Int] = List(1, 2, 3)
        .flatMap { i =>
            val list2 = List(10, 20, 30).map(j => i * j)
            list2
        }

    println(result3)

    val result4: List[Int] = List(1, 2, 3)
        .map { i =>
            val list2 = List(10, 20, 30).map(j => i * j)
            list2
        }.flatten

    println(result4)

    // Итог
    val c1 = List(1)
    val c2 = List(1)
    val c3 = List(1)
    val cond = true

    // Example 1
    for (x <- c1; y <- c2; z <- c3) {}
    c1.foreach(x => c2.foreach(y => c3.foreach(z => {})))

    // Example 2
    for (x <- c1; y <- c2; z <- c3) yield {}
    c1.flatMap(x => c2.flatMap(y => c3.map(z => {})))

    // Example 3
    val c = List(1)
    for (x <- c; if cond) yield {}
    c.withFilter(x => cond).map(x => {})

    // Example 4
    for (x <- c; y = x * 10) yield {}
    c.map(x => { val y = x * 10; (x, y) }) map { case (x, y) => {} }

    // Example 5
    val l = List(List(1))
    l.flatMap(sl => sl.filter(el => el > 0).map(el => el.toString.length))
    // or
    for {
        sl <- l
        el <- sl
        if el > 0
    } yield el.toString.length

}
