package com.baeldung.application;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:38 PM
*/

import com.baeldung.composition.StandardMemory;
import com.baeldung.composition.StandardProcessor;
import com.baeldung.composition.StandardSoundCard;
import com.baeldung.inheritance.basics.Actress;
import com.baeldung.inheritance.basics.Person;
import com.baeldung.inheritance.basics.Waitress;
import com.baeldung.inheritance.designpattern.inheritance.Computer;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "john@domain.com", 35);
        Waitress waitress = new Waitress("Mary", "mary@domain.com", 22);

        System.out.println(waitress.serveStarter("mixed salad"));
        System.out.println(waitress.serveMainCourse("steak"));
        System.out.println(waitress.serveDessert("cup of coffee"));

        Actress actress = new Actress("Susan", "susan@domain.com", 30);
        System.out.println(actress.readScript("Psycho"));
        System.out.println(actress.performRole());

        Computer computer =
                new Computer(
                    new StandardProcessor("Intel I3"),
                    new StandardMemory("Kingston","1TB"));
        computer.setSoundCard(new StandardSoundCard("Generic Sound Card"));

        System.out.println(computer);
    }
}
