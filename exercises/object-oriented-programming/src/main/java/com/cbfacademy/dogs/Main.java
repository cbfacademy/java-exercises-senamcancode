package com.cbfacademy.dogs;

public class Main {

    public static void main(String[] args) {

        Dog dogOne = new Dog("poodle", 'L', 4, "black");
        Dog dogTwo = new Dog("lab", 'M', 5, "white"); 
        Dog dogThree = new Dog ("bulldog", 'M', 2, "brown");


        dogOne.run();

        System.out.println(dogTwo.getAge());

        System.out.println(dogThree.getBreed());


    }

}
