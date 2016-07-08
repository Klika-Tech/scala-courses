package klikatech._3_week._2_hierarchy._5_own_types._7_implicit_classes

object ImplicitClassTest extends App {

    implicit class StringExtensions(s: String) {
        def words: Array[String] = s.split(" ")
    }

    println("Hello World".words.toList)
}
