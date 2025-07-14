package com.example.reflection.annotation;

import com.example.reflection.getclass.Person;

import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for(Method m: methods) {
            if(m.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(m.getName());
            }
        }
    }
}
