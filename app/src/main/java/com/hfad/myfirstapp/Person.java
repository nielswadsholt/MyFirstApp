package com.hfad.myfirstapp;

public class Person {
    private String name;
    private  int age;

    Person(){}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isOld(){
        return age > 50;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + (isOld() ? "is old" : "is young");
    }
}
