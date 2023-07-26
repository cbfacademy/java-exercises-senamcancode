package com.cbfacademy;

import java.util.Arrays;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters;

        String arrayToString = Arrays.toString(characters);

        return arrayToString;

        // throw new RuntimeException("Not implemented");

    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}
        // String stringToConvert = text;

        // char[] stringToArray = stringToConvert.toCharArray();

        long totalNumOfCharType = 0;
        // the test is expecting a long not an int
        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                totalNumOfCharType += 1;
            }

            return totalNumOfCharType;
        }

    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "String Exercises";
    }
}
