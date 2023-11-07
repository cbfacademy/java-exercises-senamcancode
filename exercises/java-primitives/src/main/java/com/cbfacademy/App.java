package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        float operand1 = 12.0f;
        float operand2 = 20.0f;

        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.addFloat(operand1, operand2));
        System.out.println(exercises.subtractFloat(operand1, operand2));
        System.out.println(exercises.multiplyFloat(operand1, operand2));
        System.out.println(exercises.divideFloat(operand1, operand2));
        // we use exercises.addFloat because we have created a new instance 
        // of arithmeticExercises which has all of the methods attached to it 

    }
}
