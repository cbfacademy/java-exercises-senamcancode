package com.cbfacademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void exampleProperties(){
        try(InputStream input = new FileInputStream("/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/homework/input-output/src/main/resources/example.properties")){
            Properties prop = new Properties(); 

            //load a propeties file 
            prop.load(input);
            
            //prints each proeprty and value to the screen 

            //printing of teh properties: 
            System.out.println(prop.getProperty("db.url")); 
            System.out.println(prop.getProperty("db.port")); 
            System.out.println(prop.getProperty("db.user")); 
            System.out.println(prop.getProperty("db.password")); 

            //printing of the values: 
            System.out.println(prop.getProperty("db.url")); 
            System.out.println(prop.getProperty("db.port")); 
            System.out.println(prop.getProperty("db.user")); 
            System.out.println(prop.getProperty("db.password")); 

        }catch (IOException e){
            e.printStackTrace();
        }; 

    }

        

    public static void main(String[] args) {

        exampleProperties();

    }



       //code that creates a new properties file 

    //    Properties prop = new Properties(); 

    //    //set the properties value
    //    prop.setProperty("db.url", "localhost"); 
    //    prop.setProperty("db.url", "localhost"); 
    //    prop.setProperty("db.url", "localhost"); 
    //    prop.setProperty("db.url", "localhost"); 
       
}

