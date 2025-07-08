package com.example.wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    private static void  showAll(List<? super Number> list) {
        for(Object num: list) {
            System.out.println(num + " - " + num.getClass());
        }
    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();
//        list.add(1.3f);
        List<? super Integer> list1 = new ArrayList<Number>();
//        List<? super Integer> list2 = new ArrayList<Float>();

        List<Serializable> list2 = new ArrayList<>();
        list2.add("Raul");
        list2.add("Gonzalo");
        list2.add("Ascencio");
        showAll(list2);

        List<? super Number> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3.5f);
//        list3.add(new Object());
    }
}
