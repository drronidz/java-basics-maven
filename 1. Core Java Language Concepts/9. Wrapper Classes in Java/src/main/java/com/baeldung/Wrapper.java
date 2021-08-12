package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 1:26 AM
*/

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main(String[] args) {

        Integer object = new Integer(1);
        Integer anotherObject = Integer.valueOf(1);

        int val = object.intValue();

        List<Integer> list = new ArrayList<>();
        list.add(1); // autoboxing

        Integer valTwo = 2; // autoboxing

        // Integer value = Integer.valueOf(3);
        Integer value = 3;

        int val1 = getSquareValue(object); // unboxing
        int val2 = object; // unboxing
    }

    public static int getSquareValue(int i) {
        return i*i;
    }
}
