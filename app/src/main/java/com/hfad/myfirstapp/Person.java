package com.hfad.myfirstapp;

public class Person implements AgeCategory {
    private String name;
    private  int age;

    Person(){}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    private boolean isOld(){
        return age > 50;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + (isOld() ? "is old" : "is young");
    }

    @Override
    public boolean isTeenager() {
        return age > 12 && age < 20;
    }
}
