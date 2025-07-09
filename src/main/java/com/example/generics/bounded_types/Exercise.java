package com.example.generics.bounded_types;

import java.util.Arrays;

public class Exercise {
    public  <T extends Number> double add(T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }

    public <T extends Comparable<T>> long countGreaterItems(T[] items, T item) {
        int count = 0;
        for(T t: items) {
            if (t.compareTo(item) > 0) ++count;
        }
        return count;
    }
}
