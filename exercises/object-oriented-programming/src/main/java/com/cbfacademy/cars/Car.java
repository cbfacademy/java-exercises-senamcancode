package com.cbfacademy.cars;

public class Car {

    // create a car class with the following fields: make, model. year
    String make;
    String model;
    int year;

    // constructor for car class
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // create the following methods: getMake(), getModel(), getYear(), which returns
    // all of these
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String updateModel(String model){
        this.model = model; 
        return this.model; 

    }


}
