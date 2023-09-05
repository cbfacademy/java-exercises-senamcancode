package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class App {

    public static void exampleProperties() {
        try (InputStream input = new FileInputStream(
                "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/homework/input-output/src/main/resources/example.properties")) {

            Properties prop = new Properties();

            // load a propeties file
            prop.load(input);

            // prints each property and value to the screen

            // printing of the properties:
            System.out.println(prop.getProperty("db.url", "postgres://user:password@192.168.0.1:5432/db-name"));
            System.out.println(prop.getProperty("db.port", "5432"));
            System.out.println(prop.getProperty("db.user", "user"));
            System.out.println(prop.getProperty("db.password", ""));

            // printing of the properties and values:
            for (String key : prop.stringPropertyNames()) {
                String value = prop.getProperty(key);
                System.out.println("Key: " + key + ", Value: " + value);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createPropertiesFile() {
        Properties prop2 = new Properties();

        // set each property in the properties file
        prop2.setProperty("db.url", "localhost");
        prop2.setProperty("db.port", "5353");
        prop2.setProperty("db.user", "cbfacademy");
        prop2.setProperty("db.password", "password");

        // write the file to an output stream with the files path
        try (OutputStream configFile = new FileOutputStream("configuration.properties", true)) {
            prop2.store(configFile, "Configuration complete");
            System.out.println("configuration.properties file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        exampleProperties();
        createPropertiesFile();

    }

}
