package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 1:18 AM
*/

public class Assertion {

    public static void main(String[] args) {
        Assertion assertion = new Assertion();
        assertion.setup();
    }

    public void setup() {
        Object connection = getConnection();
        assert connection != null : "Connection is null";
    }

    public Object getConnection() {
        return null;
    }
}
