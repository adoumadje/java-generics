package com.example.generics.wildcards;

import java.util.List;

public class Exercise {
    // your generic copy algorithm method here
    public <T> void copy(List<? extends T> source, List<? super T> destination) {
        for(T t: source) {
            destination.add(t);
        }
    }
}
