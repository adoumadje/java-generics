package com.example.collections.list;

import java.util.List;

public class Exercise {
    public void reverse(List<Integer> list) {
        // here is your implementation
        int n = list.size();
        for(int i = 0; i < n/2; ++i) {
            Integer temp = list.get(i);
            list.set(i, list.get(n-1-i));
            list.set(n-1-i, temp);
        }
    }
}
