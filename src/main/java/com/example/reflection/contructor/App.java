package com.example.reflection.contructor;

import com.example.reflection.getclass.Person;

import java.lang.reflect.Constructor;

public class App {
    public static void main(String[] args) throws Exception {
        Constructor<Test> constructor = Test.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Test test = constructor.newInstance();
        Test test1 = constructor.newInstance();
        System.out.println(test);
        System.out.println(test1);

        System.out.println();

        Class<Person> personClass = Person.class;
        Class superClass = personClass.getSuperclass();
        System.out.println(superClass);

        System.out.println();

        Class[] interfaces = personClass.getInterfaces();

        for (Class interf: interfaces) {
            System.out.println(interf);
        }

        System.out.println();
    }
}
