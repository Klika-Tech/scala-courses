package klikatech._7_week._1_generics._0_java_arrays;

/*
    Java: USE defined variance          = место использования
    Scala: DEFINITION defined variance  = место объявления

    In Java all generic types are invariant.

                Invariant       Covariant       Contra-variance
    Java        <T>             <? extends T>   <? super T>
    Scala       [T]             [+T]            [-T]
    Scala       [T]             [_ <: T]        [_ >: T]
    (wildcards)

    String <: Object
 */
public class Example2 {

    private static class MyClass<T> {
    }

    public static void main(String[] args) {
        // 1
        // non-variant
        //MyClass<String> ref11 = new MyClass<Object>();
        //MyClass<Object> ref12 = new MyClass<String>();

        MyClass<String> ref13 = new MyClass<String>();

        // 2
        // co-variant
        MyClass<? extends Object> ref2 = new MyClass<String>(); // Child

        // 3
        // contra-variant
        MyClass<? super String> ref3 = new MyClass<Object>(); // Parent

    }
}
