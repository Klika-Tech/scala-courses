package klikatech._1_week._6_java_scala.user;

public class JavaUser {

    private String name = "James Gosling";

    // accessor
    public String name() {
        return this.name;
    }

    // mutator
    public void name_$eq(String name) {
        this.name = name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}
