package klikatech._7_week._1_generics._1_base_cases._2_method_set

// method arg == contra-variant position
class Consumer[T] /*[-T]*/ { // определение T, указание вариантивности

    // использование T
    def set(arg: T): Unit = ???    // (T) => ()
}

object ConsumerMain extends App {

    def f(consumer: Consumer[String]): Unit = {
        consumer.set("Hello")
    }

    f(new Consumer[AnyRef]) // call
}
