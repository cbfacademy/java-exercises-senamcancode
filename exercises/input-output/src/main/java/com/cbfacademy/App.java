package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void fileReaderMethod() {
        String filePath = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";
        // Using the "try with resources" block in the follow methods. Resources must be defined in the rounded brackets after "try". Resources put here are ones that will be automaticallly closed once the try block has been completed.
        // Resource to be autoclosed is a stream of strings containing the lines being read from the src file.
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
    }




    public static void fileWriterMethod(){
        String writerFile = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise2.txt";
        String fileName = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";

        // Getting the path for both the src file and the writing file.
        Path writerPath = Paths.get(writerFile); 
        Path readerPath = Paths.get(fileName);

        // Copy the file from src file and write in a new file
        try {
            Files.copy(readerPath, writerPath);
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
    }



    public static void invertFile() {
        String srcFile = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";
        String destinationFile = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/invertedFile.txt";

        List<String> lines = new ArrayList<String>();

        try {
            lines = Files.readAllLines(Paths.get(srcFile));
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }

        Collections.reverse(lines);

        try {
            Files.write(Paths.get(destinationFile), lines);
        } catch (IOException e) {
            System.out.println("File writing exception: " + e.getMessage());
        }

        //file reading done the old output and inputstream way
    // public static void fileReaderMethod() {
    //     String fileName = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";

    //     try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
    //         String line;
    //         while ((line = reader.readLine()) != null) {
    //             System.out.print(line);

    //         }
    //         reader.close();
    //     } catch (IOException e) {
    //         System.out.println("File reading exception: " + e.getMessage());

    //     }
    // }

    // public static void fileWriterMethod() {
    //     String writerFile = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise2.txt";
    //     String fileName = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";

    //     try (
    //             FileOutputStream fileOutputStream = new FileOutputStream(writerFile);
    //             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
    //             PrintWriter writer = new PrintWriter(outputStreamWriter);

    //             BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
    //         String line;
    //         while ((line = reader.readLine()) != null) {
    //             writer.printf(line);

    //         }
    //         outputStreamWriter.close();
    //     } catch (IOException e) {
    //         System.out.println("File writing exception: " + e.getMessage());

    //     }
    // }

    }

    public static void main(String[] args) {
        fileReaderMethod();
        fileWriterMethod();
        invertFile();

    }
}