package klikatech._5_week._3_for_comprehension

import scala.collection.generic.FilterMonadic

// filter vs withFilter
object FilterVsWithFilter {

    // 1
    // filter
    val result1: Array[Int]  = Array(-1, 0, 1, 2).filter(item => item > 0)

    val result1_2: Array[Int]  = Array(-1, 0, 1, 2).filter(_ > 0)


    // 2
    // withFilter
    val result2: FilterMonadic[Int, Array[Int]] = Array(-1, 0, 1, 2).withFilter(item => item > 0)

    val result2_1: FilterMonadic[Int, Array[Int]] = Array(-1, 0, 1, 2).withFilter(_ > 0)
}
