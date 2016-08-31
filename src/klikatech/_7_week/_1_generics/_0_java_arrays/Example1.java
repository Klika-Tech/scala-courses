package klikatech._7_week._1_generics._0_java_arrays;

/*
    Java arrays are COVARIANT == type operator T -> T[] are covariant == Child[] <: Parent[]
 */
public class Example1 {

    public static void main(String[] args) {
        String[] strArr = new String[1];
        Object[] objArr = strArr;           // String[] <: Object[]
        objArr[0] = new Integer(42);        // Integer <: Object
        String str = strArr[0];             // Integer(42) => String
        // ArrayStoreException
    }
}
