package com.pojo;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 11:56 PM
*/

import java.time.LocalDate;

public class EmployeePOJO {
    public String firstName;
    public String lastName;
    private final LocalDate startDate;

    public EmployeePOJO(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }
}
