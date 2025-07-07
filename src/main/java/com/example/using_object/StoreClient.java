package com.example.using_object;

public class StoreClient {
    public static void main(String[] args) {
        Store store = new Store();
        store.setItem(985);
        String item = (String) store.getItem();
    }
}
