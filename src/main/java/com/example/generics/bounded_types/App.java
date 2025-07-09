package com.example.generics.bounded_types;

public class App {
    private static <T extends Comparable<T>> T calculateMin(T t1, T t2) {
        if(t1.compareTo(t2) < 0) {
            return t1;
        }
        return t2;
    }

    public static void main(String[] args) {
        System.out.println("min: " + calculateMin(12, 15));
        System.out.println("youngest: " + calculateMin(new Person("Mbappe", 27),
                new Person("Bellingham", 22)));
    }
}
