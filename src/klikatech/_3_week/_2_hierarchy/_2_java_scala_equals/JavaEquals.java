package klikatech._3_week._2_hierarchy._2_java_scala_equals;

public class JavaEquals {

    static boolean isEqualPrimitive(int x, int y) {
        return x == y;
    }

    static boolean isEqualReference(Integer x, Integer y) {
        return x == y;
    }

    static boolean isEqualString(String x, String y) {
        return x == y;
    }

    public static void main(String[] args) {

        System.out.println("Primitive | Reference");
        System.out.println(isEqualPrimitive(421, 421));                 // true
        System.out.println(isEqualReference(421, 421));                 // false
        System.out.println(isEqualReference(120, 120));                 // true -- < 128 optimization hint
        System.out.println(isEqualReference(421, 421));                 // false

        System.out.println("\nString");
        System.out.println(isEqualString("abc".substring(2), "abc".substring(2))); // false

        /*
            String Pool
            b -----------------> "test" <-----------------a
        */
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);                                     // true
        System.out.println("abc" == "abc");                             // true

        /*
            String Pool
            "abc" <-------------------- x

            Heap
            "abc" <-------------------- y
        */
        String x = "abc";
        String y = new String("abc");
        System.out.println(x == y);                                     // false

        /*
            When you compare with the == operator,
            the compiler is assuming that you are trying to compare whether the references are pointing to the same instance.
            And since there is no way that a Long reference can point to something that is pointed to by an Integer reference,
            and vice versa, it generates a compile error.

            When you compare with the other operators,
            the compiler is assuming that you are trying to compare the values,
            as there is no way to compare references in that regard.
            And the objects are unboxed and then compared.
         */

        System.out.println("\nInteger");
        System.out.println(new Integer(1) == new Integer(1));           // false
        //System.out.println(new Integer(1) == new Long(1));            <-- Compilation error: "incomparable types: java.lang.Integer and java.lang.Long"
        System.out.println(new Integer(10) > new Long(1));     // true
        System.out.println(new Integer(10) < new Long(1));     // false
        //System.out.println(new Integer(1) == new Double(1));          <-- Compilation error: "incomparable types: java.lang.Integer and java.lang.Double"
    }

}
