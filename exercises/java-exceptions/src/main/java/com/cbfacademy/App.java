package com.cbfacademy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        try {
            String fileName = "";
            FileExtension fileExtensionChecker = new FileExtension();
            fileExtensionChecker.check(fileName);

        } catch (nullFileNameException e) {
            System.out.println("An exception has been thrown " + e.getMessage());
        } finally {
            System.out.println("Hello");
        }

    }
}
