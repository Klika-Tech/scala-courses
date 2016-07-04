package klikatech._1_week._5_val_var_def

class Example2 {
    var m_field: Int = 0    // mutable field
    val im_field: Int = 0   // immutable field
}

object Example2 {
    def f1(x: Int, y: Int): Unit = {
        var m_local_field: Int = 0    // mutable field
        val im_local_field: Int = 0   // immutable field

        m_local_field = 1
        //im_local_field = 1

        var m_obj = new Example2()    // or = new Example2
        m_obj.m_field = 1
        //m_obj.im_field = 1

        val im_obj = new Example2()
        im_obj.m_field = 1
        //im_obj.im_field = 1
        //im_obj = new Example2()

        //x = 1 // parameter values immutable == val
    }

    def f2(/*var*/ x: Int, /*val*/ y: Int): Unit = {
        //x = 1
    }
}
