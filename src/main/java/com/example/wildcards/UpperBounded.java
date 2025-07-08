package com.example.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {

    private static double sumAll(List<? extends Number> list) {
        double sum = 0.0;
        for(Number num: list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    private static void showAll(List<? extends Number> list) {
        for (Number num: list) {
            System.out.println(num + "-" + num.getClass());
        }
    }


    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
//        list.add(1);
        List<? extends Number> list1 = new ArrayList<Double>();
        List<? extends Number> list2 = new ArrayList<Float>();

        List<? extends Integer> list3 = new ArrayList<>();
//        list3.add(12);

        showAll(Arrays.asList(1,2.3f,9,3.7));
        System.out.println("total sum = " + sumAll(Arrays.asList(1,2.3f,9,3.7)));
    }
}
