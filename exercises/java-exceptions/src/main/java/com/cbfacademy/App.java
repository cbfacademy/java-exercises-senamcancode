package com.cbfacademy;

import java.util.HashMap;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import com.cbfacademy.FileExtension;

import com.cbfacademy.nullFileNameException;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> fileNameList = Arrays.asList("App.java", "App.txt", null, "App.md");

        HashMap<String, Integer> fileNameMap = new HashMap<>();

        for (String fileName : fileNameList){
            try {
                FileExtension fileExtensionChecker = new FileExtension();

                if (fileName == null || fileName.equals("")) {
                        throw new nullFileNameException("File name is null or empty");
                    }   

                    int returnValue = fileExtensionChecker.check(fileName);
                    fileNameMap.put(fileName, returnValue);
                
            } catch (nullFileNameException e) {
                fileNameMap.put(fileName, -1);
                System.out.println("Oh no!" + e.getMessage());
               
            }
        }
    }
}
