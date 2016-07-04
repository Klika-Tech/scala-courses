package klikatech._1_week._7_trait_case_class._0_empty

/*
trait
class
case class
object
case object
*/

trait MyTrait

class MyClass0()
class MyClass1

case class MyCaseClass()

object MyObject


object Example1 extends App {

    // trait

    val t = new MyTrait {}


    // class

    val myClass = new MyClass0()
    val myClass1 = new MyClass1 // uniform access principle


    // case class

    val myCaseClass = MyCaseClass
    val myCaseClass1 = new MyCaseClass

    val myCaseClass2 = MyCaseClass.apply()


    // object

    val myObject = MyObject

}
