package com.cbfacademy;

//This code is used to override the typical message asscociated with the exception class

public class nullFileNameException extends Exception {
    private final String message;

    public nullFileNameException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return String.join(" - ", super.getMessage(), this.message);
    }
}
