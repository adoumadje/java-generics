package com.example.type_inference;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static <T> void addStore(T item, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(item);
        list.add(bucket);
        System.out.println(item + " has been added to list...");
    }

    private static <T> List<T> add(List<T> list, T t1, T t2) {
        list.add(t1);
        list.add(t2);
        return list;
    }

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();
        addStore("Camavinga", list);

        //type witness
        App.<String>addStore("Vinicius", list);

        List<Integer> list1 = add(new ArrayList<>(), 1, 2);
        System.out.println(list1);
    }
}
