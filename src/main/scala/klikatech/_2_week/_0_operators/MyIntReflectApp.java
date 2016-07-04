package klikatech._2_week._0_operators;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyIntReflectApp {

    public static void main(String[] args) {

        new MyInt(1).$plus(new MyInt(2));

        System.out.println("FIELDS:");
        for (Field field : MyInt.class.getDeclaredFields()) System.out.println("> " + field.getName()); // toString()


        System.out.println("METHODS:");
        for (Method method : MyInt.class.getDeclaredMethods()) System.out.println("> " + method.getName());


        System.out.println("CONSTRUCTORS:");
        for (Constructor constructor : MyInt.class.getDeclaredConstructors()) System.out.println("> " + constructor.getName());


    }
}
