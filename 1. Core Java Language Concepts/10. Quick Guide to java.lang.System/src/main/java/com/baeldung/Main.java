package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 2:14 PM
*/

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //systemErrorDemo();
        systemExitDemo(true);
        //systemOutDemo();
     }

     public static void systemErrorDemo() {
         // Print and then 'hit' return
         System.err.println("an error message having new line at the end");
         // Print without 'hitting' return ;
         System.err.print("some inline error message !");
     }

     public static void systemExitDemo(boolean error) {
        // Do something and set error value

        if(error) {
            System.exit(1); // error case exit
        } else {
            System.exit(0); // normal case exit
        }

        // Will note do anything after exit()
     }

     public static void systemOutDemo() throws FileNotFoundException {

         // Print without 'hitting' return
         System.out.print("Some inline message");

         // Print and then 'hit' return
         System.out.println("A message having new line at the end");

         // Changes output stream to send messages to file
         System.setOut(new PrintStream("file.txt"));
     }

}
