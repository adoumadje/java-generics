package com.example.reflection.getclass;

public class App {
    public static void main(String[] args) {
        Class<Person> c = Person.class;
        System.out.println(c);
        try {
            Class personClass = Class.forName("com.example.reflection.getclass.Person");
            System.out.println(personClass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Vehicle vehicle = new Truck();
        Class cv = vehicle.getClass();
        System.out.println(cv);
    }
}
