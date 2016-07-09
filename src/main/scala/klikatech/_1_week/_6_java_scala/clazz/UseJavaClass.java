package klikatech._1_week._6_java_scala.clazz;

public class UseJavaClass {

    public static void main(String[] args) {

        System.out.println("UseJavaClass:");

        ScalaClass scalac = new ScalaClass(1);
        JavaClass javac = new JavaClass(2);

        scalac.count_$eq(4); //setter
        scalac.count();      //getter
        scalac.setCount(7);

        System.out.println("Scala class, count = " + scalac.getCount());
        System.out.println("Java class, count = "  + javac.getCount());
    }
}
