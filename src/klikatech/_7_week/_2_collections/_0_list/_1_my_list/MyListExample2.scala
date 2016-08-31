package klikatech._7_week._2_collections._0_list._1_my_list

object MyListExample2 extends App {

    // MyList
    val mylist: MyList[Int] = 0 :><: 1 :><: MyNil // MyList(0, 1)

    mylist match {
        case 0 :><: 1 :><: MyNil =>     println("1")
        case 0 :><: _ =>                println("2")
    }

    mylist match {
        case :><:(0, :><:(1, MyNil)) => println("1")
        case :><:(0, _) =>              println("2")
    }



    // Scala List
    val list: List[Int] = 0 :: 1 :: 2 :: Nil

    list match {
        case 0 :: 1 :: Nil =>           println("1")
        case 0 :: _ =>                  println("2")
    }

    list match {
        case ::(0, ::(1, Nil)) =>       println("1")
        case ::(0, _) =>                println("2")
    }
}
