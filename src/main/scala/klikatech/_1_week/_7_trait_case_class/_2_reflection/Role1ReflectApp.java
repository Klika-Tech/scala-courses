package klikatech._1_week._7_trait_case_class._2_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Role1ReflectApp {

    public static void main(String[] args) {

        System.out.println("FIELDS:");
        for (Field field : Role1.class.getDeclaredFields()) System.out.println("> " + field.toString());


        System.out.println("METHODS:");
        for (Method method : Role1.class.getDeclaredMethods()) System.out.println("> " + method.toString());


        System.out.println("CONSTRUCTORS:");
        for (Constructor constructor : Role1.class.getDeclaredConstructors()) System.out.println("> " + constructor.toString());


    }
}
