package klikatech._2_week._1_fun_parenteless

/*
    Uniform access principle:
    http://docs.scala-lang.org/glossary/#parameterless-function
    http://docs.scala-lang.org/glossary/#uniform-access-principle

    http://martinfowler.com/bliki/UniformAccessPrinciple.html
*/
class Example(val name: String) {
    def f: Int = 1
    def f2(): Int = 1
}

object Example {
    val e = new Example("string") // or "new Example()" or "new Example"
    e.f
    //e.f() // Error
    e.f2()
    e.f2 // Ok
}
