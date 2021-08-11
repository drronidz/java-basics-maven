package com.baeldung.composition;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:30 PM
*/

public class StandardMemory implements Memory {

    private final String brand;
    private final String size;

    public StandardMemory(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "StandardMemory { " +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                " } ";
    }
}
