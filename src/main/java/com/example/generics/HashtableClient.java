package com.example.generics;

public class HashtableClient {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>(12, 45);
        System.out.println(hashtable);
    }
}
