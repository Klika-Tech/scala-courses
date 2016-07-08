package klikatech._3_week._1_call_by

class Db {
    def getById(id: Int) = {
        println(s"[db] getting by id=$id")
        (1, "Ivan")
    }
}

object LazyDatabase extends App {
    var db: Db = null
    /*lazy */ val dbRef = db
    db = new Db
    println(dbRef.getById(1))
}
