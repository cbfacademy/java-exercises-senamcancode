package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void fileReaderMethod() {
        String fileName = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());

        }
    }

    public static void fileWriterMethod() {
        String writerFile = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise2.txt";
        String fileName = "/Users/senam/Documents/Code/entry-to-tech/java-exercises-senamcancode/exercises/input-output/src/main/resources/exercise.txt";

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(writerFile);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                PrintWriter writer = new PrintWriter(outputStreamWriter);

                BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.printf(line);

            }
            outputStreamWriter.close();
        } catch (IOException e) {
            System.out.println("File writing exception: " + e.getMessage());

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

    }

    public static void main(String[] args) {
        fileReaderMethod();
        fileWriterMethod();
        invertFile();

    }
}