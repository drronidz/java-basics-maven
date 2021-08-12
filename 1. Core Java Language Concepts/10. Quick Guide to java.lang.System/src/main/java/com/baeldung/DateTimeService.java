package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 2:41 PM
*/

import java.util.Date;

public class DateTimeService {
    public static void main(String[] args) {
        System.out.println(nowPlusOneHour());
        System.out.println(nowPrettyPrinted());
    }

    // One hour from now
    public static long nowPlusOneHour() {
        return System.currentTimeMillis() + 3600 * 1000L;
    }

    // Human-readable format
    public static String nowPrettyPrinted() {
        return new Date(System.currentTimeMillis()).toString();
    }
}
