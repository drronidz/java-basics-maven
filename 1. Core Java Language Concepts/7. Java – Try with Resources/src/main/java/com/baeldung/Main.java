package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 12:49 AM
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //orderOfClosingResources();
        firstTry_Catcher();
    }

    private static void orderOfClosingResources() throws Exception {
        try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
             AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond() ){
            af.doSomething();
            as.doSomething();
        }
    }

    private static void firstTry_Catcher() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File("test.txt"))){
            writer.println("Hello World");
        }
    }

    // Making try-catch-finally block
    private static void tryCatchFinally() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }

    // Making try-with-resources
    private static void tryWithResources () {
        try (Scanner scanner = new Scanner(new File("test.txt"))){
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Making try-with-resources with multiple resources
    private static void tryWithMultipleResources (){
        try (
                Scanner scanner = new Scanner(new File("testRead.txt"));
                PrintWriter writer = new PrintWriter(new File("testWrite.txt")))
        {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Before Java 9, we could only use fresh variables inside a try-with-resources block:
    // After that we could use final or even effectively final variables inside
    // try-wth-resources block

    private static void newStyleTryWithResources() throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("testRead.txt"));
        PrintWriter writer = new PrintWriter(new File("testWrite"));

        try (scanner;
             writer){
            // omitted
        }
    }


}
