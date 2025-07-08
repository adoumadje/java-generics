package com.example.generics;

public class GenericMethodClient {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
//        genericMethod.showItem("Atana Sacour");
//        System.out.println("returned: " + genericMethod.returnItem(12.45));

        genericMethod.printItems("Caleb", 52);
        String[] fruits = {"banana", "orange", "apple"};
        genericMethod.showItems(fruits);
    }
}
