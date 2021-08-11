package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 12:26 AM
*/

public class SwitchStatement {
    public static void main(String[] args) {

    }

    public String exampleOfIF(String animal) {
        String result;
        if(animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }

    public String exampleOFSWITCH(String animal) {
        return
                switch (animal) {
                    case "DOG", "CAT" -> "domestic animal";
                    case "TIGER" -> "wild animal";
                    default -> "unknown animal";
        };
    }
}
