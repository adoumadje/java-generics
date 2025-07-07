package com.example.generics;

public class StoreClient {
    public static void main(String[] args) {
        Store<String> store = new Store<>();

        store.setItem("Caleb Adoumadje");

        String item = store.getItem();

        System.out.println(item);
    }
}
