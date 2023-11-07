package com.cbfacademy;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 


public class App {
    public static void main(String[] args) {

    ArrayList<String> fileNameList = new ArrayList<>(Arrays.asList("App.java", "App.txt", null, "App.md")); 
    //NB you cannot use Arrays.asList() and pass a null value so you must use Arrays.asList(); 
    HashMap<String, Integer> fileExtensionMap = new HashMap<>(); 

    FileExtension extensionChecker = new FileExtension();   

    
    for(String fileName : fileNameList){
        try{
            int result = extensionChecker.check(fileName); 
            fileExtensionMap.put(fileName, result);

        } catch(nullFileNameException e){
            fileExtensionMap.put(fileName, -1);
            // System.out.println("An exception has been thrown " + e.getMessage());
    }
    System.out.println(fileExtensionMap);
        

        }
    }
}

