package klikatech._1_week._7_trait_case_class._1_more

/*
trait
class
case class
object
case object
*/

trait MyTrait {
    def property(): String
}

class MyClass0(property: String)
class MyClass1(val property: String)
class MyClass2(var property: String)

case class MyCaseClass0(property: String)
case class MyCaseClass1(var property: String)

object MyObject


object Example1 extends App {

    // trait

    val t = new MyTrait {
        override def property(): String = "Prop"
    }


    // class

    val myClass0 = new MyClass0("Prop")
    val myClass1 = new MyClass1("Prop")
    val myClass2 = new MyClass2("Prop")


    //myClass0.property          // not accessor

    myClass1.property            // accessor
    //myClass1.property = ""     // not mutator

    myClass2.property            // accessor
    myClass2.property = "MyProp" // mutator


    // case class

    val myCaseClass = MyCaseClass0("Prop")
    val myCaseClass1 = new MyCaseClass0("Prop")

    val myCaseClass2 = MyCaseClass0.apply("Prop")


    myCaseClass.property            // accessor
    //myCaseClass.property = ""     // not mutator

    val myCaseClassVar = MyCaseClass1("Prop")
    myCaseClassVar.property         // accessor
    myCaseClassVar.property = ""    // mutator


    // object

    val myObject = MyObject

}
