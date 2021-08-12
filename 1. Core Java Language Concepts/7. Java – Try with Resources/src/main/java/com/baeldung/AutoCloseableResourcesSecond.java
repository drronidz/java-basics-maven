package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 12:44 AM
*/

public class AutoCloseableResourcesSecond implements AutoCloseable {

    public AutoCloseableResourcesSecond() {
        System.out.println("Constructor -> AutoCloseableResourcesSecond");
    }

    public void doSomething() {
        System.out.println("DoSomething -> AutoCloseableResourcesSecond");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResourcesSecond");
    }
}
