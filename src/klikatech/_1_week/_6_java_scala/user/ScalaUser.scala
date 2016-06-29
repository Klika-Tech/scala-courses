package klikatech._1_week._6_java_scala.user

class ScalaUser {

    private var userName: String = "Martin Odersky"

    // accessor
    def name: String = {
        this.userName
    }

    // mutator: fieldName_$eq(...)
    def name_$eq(userName: String) { // need "name_="
        this.userName = userName
    }

    // setter
    def setName(userName: String) {
        this.userName = userName
    }
}
