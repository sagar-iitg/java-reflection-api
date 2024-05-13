package com.sagar.example1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello World");
        Class<Eagle> eagleClass= Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        Method[] methods=eagleClass.getMethods();
        System.out.println("--------");
        for (Method m:methods)
        {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getDeclaringClass());

        }

    }
}
