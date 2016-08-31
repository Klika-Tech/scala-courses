package klikatech._7_week._2_collections._0_list._1_my_list

object MyListExample1 extends App {

    // 1
    val mylist0: MyList[Int] =   MyList(0, 1, 2)
    val list0: List[Int] =       List(0, 1, 2)

    val mylist1 =   0 :><: 1 :><: 2 :><: MyNil
    val list1 =     0 :: 1 :: 2 :: Nil // right associative

    val mylist2 =   0 :><: 1 :><: 2 :><: MyList()
    val list2 =     0 :: 1 :: 2 :: List()


    // 2
    val mylist3 =   MyNil.:><:(2).:><:(1).:><:(0)
    val list3 =     Nil.::(2).::(1).::(0)


    println(mylist0)
    println(list0)

    println(mylist1)
    println(list1)

    println(mylist2)
    println(list2)

    println(mylist3)
    println(list3)
}
