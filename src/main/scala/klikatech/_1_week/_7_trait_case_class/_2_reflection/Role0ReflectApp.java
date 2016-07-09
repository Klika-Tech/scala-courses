package klikatech._1_week._7_trait_case_class._2_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Role0ReflectApp {

    public static void main(String[] args) {

        System.out.println("FIELDS:");
        for (Field field : Role0.class.getDeclaredFields()) System.out.println("> " + field.toString());


        System.out.println("METHODS:");
        for (Method method : Role0.class.getDeclaredMethods()) System.out.println("> " + method.toString());


        System.out.println("CONSTRUCTORS:");
        for (Constructor constructor : Role0.class.getDeclaredConstructors()) System.out.println("> " + constructor.toString());


    }
}
