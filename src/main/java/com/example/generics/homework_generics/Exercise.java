package com.example.generics.homework_generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public void runExercise() {

        // you have to implement the other classes such that the following code can run without any error

        Library<Algorithm> library = new Library<>();
        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getLast();

        while(item!=null) {
            item.execute();
            item = library.getLast();
        }
    }
}

abstract class Algorithm {
    public abstract void execute();
}

class SearchAlgorithm extends Algorithm {

    @Override
    public void execute() {
        System.out.println("executing search algorithm");
    }
}

class SortingAlgorithm extends Algorithm {

    @Override
    public void execute() {
        System.out.println("executing sorting algorithm");
    }
}

class GraphAlgorithm extends Algorithm {


    @Override
    public void execute() {
        System.out.println("executing graph algorithm");
    }
}

class Library<T extends Algorithm> {
    private List<T> list;

    public Library() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public T getLast() {
        T item = list.isEmpty() ? null : list.remove(list.size() - 1);
        return item;
    }
}
