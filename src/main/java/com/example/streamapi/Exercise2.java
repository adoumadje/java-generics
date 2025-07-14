package com.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public List<List<Integer>> generatePairs() {

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);

        // implement your algorithm here (the pairs will be the result)
        List<List<Integer>> pairs = nums1.stream()
                .flatMap(num1 -> nums2.stream().map(num2 -> Arrays.asList(num1, num2)))
                .collect(Collectors.toList());

        return pairs;
    }
}
