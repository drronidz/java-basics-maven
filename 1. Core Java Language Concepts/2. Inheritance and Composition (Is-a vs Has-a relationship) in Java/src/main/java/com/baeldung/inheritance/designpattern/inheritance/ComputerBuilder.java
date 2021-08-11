package com.baeldung.inheritance.designpattern.inheritance;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:19 PM
*/

public abstract class ComputerBuilder {

    public final void buildComputer() {
        addMemory();
        addProcessor();
    }

    public abstract void addProcessor();

    public abstract void addMemory();
}
