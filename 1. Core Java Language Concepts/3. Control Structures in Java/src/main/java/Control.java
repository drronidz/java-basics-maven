/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:50 PM
*/

import java.util.Random;

public class Control {
    public static void main(String[] args) {
        Random random = new Random();

        int count = random.nextInt();

        // With if & else
        if(count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }

        // With ternary operator

        System.out.println(count > 2
                ? "Count is higher than 2"
                : "Count is lower or equal than 2");

        // With Switch (Old Style)

        switch (count) {
            case 0:
                System.out.println("Count is equal to 0");
                break;
            case 1:
                System.out.println("Count is equal to 1");
                break;
            default:
                System.out.println("Count is either negative, or higher than 1");
                break;
        }

        /* With Switch (New Style) */

        switch (count) {
            case 0 -> System.out.println("Count is equal to 0");
            case 1 -> System.out.println("Count is equal to 1");
            default -> System.out.println("Count is either negative, or higher than 1");
        }

        // Loops

        /* For Loop */
        for (int i = 1; i <= 50; i++) {
            System.out.println(" i = " + i);
        }

        /* For Loop (using a break to exit early from a loop)*/

    }

    /*
    * We are looking for a name in a list of names
    * We want to stop looking once we've found it
    * A loop would normally go to completion
    * But we've used break here to short-circuit and exit early
    * */
    public static int findFirstInstanceOfName(String name, String [] names) {
        int index = 0;
        for(;index < names.length; index ++) {
            if(names[index].equals(name)) {
                break;
            }
        }
        return index == names.length ? -1 : index;
    }

    /*
    * Here we skip appending the duplicate names into the list
    * */

    public static String makeListSkippingDuplicateName(String name, String [] names) {
        StringBuilder list = new StringBuilder();
        for (String s : names) {
            if (s.equals(name)) {
                continue;
            }
            list.append(s);
        }
        return list.toString();
    }
}
