package com.baeldung.inheritance.basics;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 12:29 AM
*/

public class Actress extends Person {

    public Actress(String name, String email, int age) {
        super(name, email, age);
    }

    public String readScript(String movie)  {
        return "Reading the script of " + movie;
    }

    public String performRole() {
        return "Performing a role";
    }

    // Additional methods/constructors

}
