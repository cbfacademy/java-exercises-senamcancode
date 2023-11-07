package com.cbfacademy.dogs;

public class Dog {
    String breed;
    char size;
    int age;
    String color;

    public Dog(String breed, char size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public static void eat() {
        System.out.println("The dog has eaten some pedigree");
    }

    public static void sleep() {
        System.out.println("The dog is sleeping");
    }

    public static void sit() {
        System.out.println("The dog is sitting");
    }

    public static void run() {
        System.out.println("The dog is running");
    }

}
