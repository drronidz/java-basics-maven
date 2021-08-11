package com.baeldung.composition;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:35 PM
*/

public class StandardSoundCard implements SoundCard {

    private final String brand;

    public StandardSoundCard(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "StandardSoundCard { " +
                "brand='" + brand + '\'' +
                " }";
    }
}
