package com.example.collections.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public Cache useCache() {
        Cache cache = new Cache();

        cache.search("www.facebook.com");
        cache.search("www.google.com");
        cache.search("www.amazon.com");
        cache.search("www.google.com");
        cache.search("www.facebook.com");
        cache.search("www.twitter.com");
        cache.search("www.globalsoftwaresuppot.com");
        cache.search("www.bbc.com");
        cache.search("www.cnn.com");
        cache.search("www.google.com");
        cache.search("www.amazon.com");
        cache.search("www.google.com");
        cache.search("www.facebook.com");

        // the cache remembers the recently visited URLs (in this case: facebook, google, amazon, cnn, bbc - 5 because the capacity of the cache is 5)


        cache.showCache();

        // I need it to be able to test wether your implmenetation works fine
        return cache;
    }
}

class Pair {

    // let's store the URL and a data associated with the URL (for example the content of the website)
    // we store these Pair objects in the cache
    // YOUR IMPLEMENTATION HERE !!!

    private String url;
    private String data;

    public Pair(String url, String data) {
        this.url = url;
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "url='" + url + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

class Cache {

    // we can store up to 5 items in the cache
    private static final int CAPACITY = 5;
    // let's use a list to store the items (URLs)
    private List<Pair> cache;

    // YOUR IMPLEMENTATION HERE !!!

    public Cache() {
        this.cache = new ArrayList<>(CAPACITY);
    }

    public void search(String url) {
        Pair searchedItem = null;
        for(Pair pair: cache) {
            if(pair.getUrl().equals(url)) {
                searchedItem = pair;
                break;
            }
        }

        Pair newItem;
        if(searchedItem != null) {
            cache.remove(searchedItem);
            newItem = searchedItem;
        } else {
            newItem = new Pair(url, "random data");
        }

        if(cache.isEmpty()) {
            cache.add(newItem);
        } else {
            cache.add(0, newItem);
        }
    }

    // I need it to test your implementation
    public List<Pair> getCache() {
        return this.cache;
    }

    public void showCache() {
        for(Pair pair : cache)
            System.out.println(pair);
    }
}