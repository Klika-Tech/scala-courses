package klikatech._7_week._2_collections._0_list._7_option_map_foreach

object Example1 extends App {

    // Option ~ List(), where size = 1

    val opt: Option[String] = Some("Klika")

    val optTupled: Option[Tuple2[String, String]] = Some(("A", "B"))

    // 1 - example: map vs foreach
    //
    val res0    = opt.map(item => item + " Hello")
    // vs
    val unit0: Unit = opt.foreach(item => item: String)  // res0 == Unit type
    val unit1       = opt.foreach(println(_))
    val unit2       = opt.foreach(println)



    // 2 - example:
    //
    val functionOps = (arg1: String, arg2: String) => {
        println(arg1 + arg2 + " Ops!")
    }

    val tupledFn = functionOps.tupled

    optTupled.map { case (arg1: String, arg2: String) =>
        println(arg1 + arg2 + " Ops!")
    }
    // vs
    optTupled.map(tupledFn)



    // 3 - example: type + one argument
    //
    def functionOne(arg: String): Unit = {
        println(arg)
    }

    opt.map(item => functionOne(item))
    // vs
    opt.map(functionOne(_))
    opt.map(functionOne)
    // vs
    opt.foreach(functionOne(_))
    opt.foreach(functionOne)



    // 4 - example: match vs map
    //
    opt match {
      case Some(item) => item + " Hello"
      case None => println("None")
    }

    // vs

    val fn = (item: String) => { item + " Hello" } // fn = anonymous function

    val opt2: Option[String] = opt.map(fn)
    val opt3: Option[String] = opt.map(item => item + " Hello")
    val opt4: Option[String] = opt.map(_ + " Hello")

    println(opt)    // immutable value
    println(opt2)
    println(opt3)
    println(opt4)


    None.map(println) // wtf?



    // 5 - example: None.getOrElse
    //
    val defaultFn = (ignored: Unit) => { "Default" }

    val def0 = None.map(fn).getOrElse(defaultFn)
    val def1 = None.map(fn).getOrElse(defaultFn())
    val def2 = None.map(fn).getOrElse(defaultFn(()))
    println(def0)
    println(def1)
    println(def2)

}
