package com.cbfacademy;

import java.util.HashMap;
import java.util.ArrayList; 
import java.util.List; 


public class App {
    public static void main(String[] args) {

    ArrayList<String> fileNameList = new ArrayList<>(List.of("App.java", "App.txt", null, "App.md")); 
    HashMap<String, Integer> fileExtensionMap = new HashMap<>(); 

    FileExtension extensionChecker = new FileExtension();   

    
    for(String fileName : fileNameList){
        try{
            int result = extensionChecker.check(fileName); 
            fileExtensionMap.put(fileName, result);

        } catch(nullFileNameException e){
            fileExtensionMap.put(fileName, -1);
            System.out.println("An exception has been thrown " + e.getMessage());
    }
    System.out.println(fileExtensionMap);
        

        }
    }
}

