package com.example.streamapi;

import java.util.Arrays;

public class FlatMapExample {
    public static void main(String[] args) {
        String[] names = {"Caicedo", "Palmer", "Guendouzi", "Greenwood"};
        Arrays.stream(names).map(name -> name.split(""))
                .flatMap(Arrays::stream)
                .distinct().forEach(System.out::print);
        System.out.println();
    }
}
