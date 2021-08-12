package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 2:39 PM
*/

public class EnvironmentVariables {
    public static void main(String[] args) {
        System.out.println("Environment Variables are : ");
        System.out.println(getPATH());
    }

    public static String getPATH() {
        return System.getenv("PATH");
    }
}
