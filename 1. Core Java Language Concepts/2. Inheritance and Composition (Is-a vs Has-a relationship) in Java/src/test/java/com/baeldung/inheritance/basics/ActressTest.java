package com.baeldung.inheritance.basics;

import com.baeldung.inheritance.basics.Actress;
import com.baeldung.inheritance.basics.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 1:09 AM
*/

class ActressTest {

    private static Actress actress;

    @BeforeAll
    static void beforeAll() {
        actress = new Actress("Susan", "susan@domain.com", 30);
    }

    @Test
    public void givenActressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(actress).isInstanceOf(Person.class);
    }

    @Test
    public void givenActressInstance_whenCalledgetName_thenEqual() {
        assertThat(actress.getName()).isEqualTo("Susan");
    }

    @Test
    public void givenActressInstance_whenCalledgetEmail_thenEqual() {
        assertThat(actress.getEmail()).isEqualTo("susan@domain.com");
    }

    @Test
    public void givenActressInstance_whenCalledgetAge_thenEqual() {
        assertThat(actress.getAge()).isEqualTo(30);
    }

    @Test
    public void givenActressInstance_whenCalledreadScript_thenEqual() {
        assertThat(actress.readScript("Psycho")).isEqualTo("Reading the script of Psycho");
    }

    @Test
    public void givenActressInstance_whenCalledperfomRole_thenEqual() {
        assertThat(actress.performRole()).isEqualTo("Performing a role");
    }
}