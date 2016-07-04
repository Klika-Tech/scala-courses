package klikatech._1_week._6_java_scala.clazz

class ScalaClass(var count: Int) {

    def getCount/*()*/ = { count }

    def getCount2() = { /*return*/ count }

    def setCount(count: Int) = {
        this.count = count
    }
}

object UseScalaClass {

    def main(args: Array[String]): Unit = {

        println("UseScalaClass:")

        val scalac = new ScalaClass(1)
        val javac: JavaClass = new JavaClass(2)

        //scalac.count = 4

        println("Scala class, count = " + scalac.getCount)
        //println("Scala class, count = " + scalac.getCount())

        println("Scala class, count = " + scalac.getCount2())
        //println("Scala class, count = " + scalac.getCount2)

        println("Java class, count = "  + javac.getCount())
        //println("Java class, count = "  + javac.getCount)
    }
}
