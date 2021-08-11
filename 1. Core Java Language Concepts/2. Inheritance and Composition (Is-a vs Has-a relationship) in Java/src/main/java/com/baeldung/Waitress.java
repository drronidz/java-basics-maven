package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 12:24 AM
*/

public class Waitress extends Person {


    public Waitress(String name, String email, int age) {
        super(name, email, age);
    }

    public String serveStarter(String starter) {
        return "Serving a " + starter;
    }

    public String serveMainCourse(String main) { return "Serving a " + main;}

    public String serveDessert(String dessert) { return "Serving a " + dessert;}

    // Additional methods/constructors

}
