package klikatech._1_week._6_java_scala.user;

// JavaUserApp VS ScalaUserApp
public class JavaUserApp {

    public static void main(String[] args) {

        // JAVA

        JavaUser user = new JavaUser();
        System.out.println(user.name());

        user.name_$eq("New name");
        // OR
        //user.name() = "Superman"; // not correct in Java code
        System.out.println(user.name());



        // SCALA

        ScalaUser user2 = new ScalaUser();
        System.out.println(user.name());

        user2.name_$eq("New name");
        // OR
        //user2.name() = "Batman";

        // use setter
        user2.setName("Setter");

    }
}
