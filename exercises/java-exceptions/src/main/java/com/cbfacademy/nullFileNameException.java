package com.cbfacademy; 

public class nullFileNameException extends Exception{
    private final String message; 

    public nullFileNameException(String message){
        this.message = message; 
    }

    @Override 
    public String getMessage(){
        return String.join(" - ", super.getMessage(), this.message); 
    }
}


