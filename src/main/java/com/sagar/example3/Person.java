package com.sagar.example3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@AllArgsConstructor
@Getter
@ToString
public class Person {

    private String name;
    private int age;
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

class Main{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> obj=Person.class;
        System.out.println(obj.getName());
        Method[] methods = obj.getMethods();
        for (Method method:methods)
            System.out.println(method.getName());

        Method[] declaredMethod = obj.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethod));

        Person p=new Person("sagar",23);
        Method  greetMethod = p.getClass().getMethod("greet");
        greetMethod.invoke(p);


    }
}
