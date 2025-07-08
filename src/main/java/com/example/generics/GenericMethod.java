package com.example.generics;

public class GenericMethod {

    public <T> void showItem(T item) {
        System.out.println("showItem(): " + item);
    }

    public <T> T returnItem(T item) {
        return item;
    }

    public <T, V> void printItems(T t, V v) {
        System.out.printf("%s - %s\n", t, v);
    }

    public <T> void showItems(T[] items) {
        for (T item: items) {
            System.out.println(item);
        }
    }
}
