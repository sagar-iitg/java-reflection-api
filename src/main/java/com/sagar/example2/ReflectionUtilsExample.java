package com.sagar.example2;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

public class ReflectionUtilsExample {

    private static class Person {
        private String name = "John Doe";
        private int age = 30;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Jane Doe", 25);

        // Access private field 'name'
        Field nameField = ReflectionUtils.findField(Person.class, "name");
        ReflectionUtils.makeAccessible(nameField);
        String name = (String) ReflectionUtils.getField(nameField, person);
        System.out.println("Name: " + name);

        // Access private field 'age'
        Field ageField = ReflectionUtils.findField(Person.class, "age");
        ReflectionUtils.makeAccessible(ageField);
        int age = (Integer) ReflectionUtils.getField(ageField, person);
        System.out.println("Age: " + age);
    }
}
