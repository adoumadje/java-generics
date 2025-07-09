package com.example.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
//    private static void print(List<Object> list) {
//        for(Object o: list) {
//            System.out.println(o);
//        }
//    }

    private static void print(List<?> list) {
        for(Object o: list) {
            System.out.println(o);
        }
    }

    private static void drawAll(List<? extends Shape> shapes) {
        for(Shape shape: shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("mango", "guava", "peach", "apple");
        print(fruits);
        List<Rectangle> rectangles = new ArrayList<>();
        drawAll(rectangles);
    }
}
