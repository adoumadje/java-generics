package com.example.reflection.Fields;

import com.example.reflection.getclass.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }

        System.out.println("\n");

        Method[] methods= personClass.getMethods();
        for(Method method: methods) {
            System.out.println(method);
        }

        System.out.println("\n");

        Field[] declaredFields = personClass.getDeclaredFields();

        for(Field field: declaredFields) {
            System.out.println(field);
        }

        System.out.println("\n");

        Method[] declaredMethods = personClass.getDeclaredMethods();

        for(Method method: declaredMethods) {
            System.out.println(method);
        }
    }
}
