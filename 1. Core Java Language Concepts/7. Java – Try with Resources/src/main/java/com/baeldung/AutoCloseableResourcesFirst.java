package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 12:48 AM
*/

public class AutoCloseableResourcesFirst implements AutoCloseable {
    public AutoCloseableResourcesFirst() {
        System.out.println("Constructor -> AutoCloseableResourcesFirst");
    }

    public void doSomething() {
        System.out.println("DoSomething -> AutoCloseableResourcesFirst");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResourcesFirst");
    }
}
