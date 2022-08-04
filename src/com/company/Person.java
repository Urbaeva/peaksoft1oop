package com.company;

public class Person {
    public String name;
    public int age;

    public Laptop laptop;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", laptop=" + laptop +
                '}';
    }
}
