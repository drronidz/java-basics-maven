package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 2:27 PM
*/

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserCredentials {
    public static void main(String[] args) throws IOException {
        System.out.println(readUsername(10));
        System.out.println(readUsername());
        System.out.println(readUsernameWithPrompt());
    }

    public static String readUsername(int length) throws IOException {
        byte[] name = new byte[length];
        System.in.read(name, 0, length);
        return new String (name);
    }

    public static String readUsername() throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public static String readUsernameWithPrompt() {
        Console console = System.console();

        return console == null ? null : //Console not available
                console.readLine("%s", "Enter your name: ");
    }
}
