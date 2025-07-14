package com.example.reflection.getclass;

import com.example.reflection.annotation.MyAnnotation;

import java.io.Serializable;

public class Person extends Employee implements Serializable, Cloneable {
    protected String name;
    private int age;
    public String bio;

    private String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(name = "Caleb Adoumadje")
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
