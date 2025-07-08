package com.example.type_inference;

public class Bucket<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "item=" + item +
                '}';
    }
}
