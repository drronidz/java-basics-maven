package com.baeldung.composition;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:34 PM
*/

public class StandardProcessor implements Processor {

    private final String model;

    public StandardProcessor(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "StandardProcessor { " +
                "model='" + model + '\'' +
                " }";
    }
}
