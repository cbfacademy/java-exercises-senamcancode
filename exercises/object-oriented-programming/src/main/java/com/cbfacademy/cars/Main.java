package com.cbfacademy.cars;

public class Main {

    public static void main(String[] args) {
        // instantiate 3 car objects
        Car carOne = new Car("Volvo", "V40", 2012);
        Car carTwo = new Car("Porsche", "panamera", 2009);
        Car carThree = new Car("Audi", "A3", 2018);

        System.out.println(carOne.getYear());
        System.out.println(carOne.getModel());
        carOne.updateModel("V60");
        System.out.println(carOne.getModel());

        System.out.println(carTwo.getMake());

        System.out.println(carThree.getYear());
    }
}
