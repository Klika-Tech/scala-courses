package klikatech._1_week._7_trait_case_class._2_reflection

/*case*/ class Role0(_id: Int, _name: String) {
    // OR
    //val id = 1
    //var name = "Admin"
}

/*case*/ class Role1(_id: Int, _name: String) {
    val id = _id
    var name = _name


    // more examples:
    var a1 = ""
    private var a2 = ""

    def f1(): Unit = ""
    private def f2(): Unit = ""
}

/*case*/ class Role2(val id: Int, var name: String) {

}

object ExampleReflect extends App {

    val role1 = new Role1(1, "Admin")

    role1.id
    //role1.id = 1 // not mutator

    role1.name

    // mutator:
    role1.name = ""
    role1.name_$eq("")
    role1.name_=("")
}
