package klikatech._3_week._2_hierarchy._5_own_types._3_parameterized;

public class JavaGenericArray {
    static class A {
    }

    static class B extends A {
    }

    public static void main(String[] args) {
        insert(new A(), new B[1]);
    }

    private static void insert(A a, A[] bs) {
        bs[0] = a;
    }
}
