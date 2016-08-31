package klikatech._7_week._1_generics._1_base_cases._1_method_get

// method return == co-variant position
class Producer[T] /*[+T]*/ { // определение T, указание вариантивности

    // использование T
    def get: T = ???    // () => T
}

object ProducerMain extends App {

    def f(producer: Producer[AnyRef]): Unit = {
        val res: AnyRef = producer.get
    }

    f(new Producer[String]) // call
}