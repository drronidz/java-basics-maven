package com.baeldung;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 1:13 AM
*/

class WaitressTest {

    private static Waitress waitress;


    @BeforeAll
    static void beforeAll() {
        waitress = new Waitress("Mary", "mary@domain.com", 22);
    }

    @Test
    public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(waitress).isInstanceOf(Person.class);
    }

    @Test
    public void givenWaitressInstance_whenCalledgetName_thenOneAssertion() {
        assertThat(waitress.getName()).isEqualTo("Mary");
    }

    @Test
    public void givenWaitressInstance_whenCalledgetEmail_thenOneAssertion() {
        assertThat(waitress.getEmail()).isEqualTo("mary@domain.com");
    }

    @Test
    public void givenWaitressInstance_whenCalledgetAge_thenOneAssertion() {
        assertThat(waitress.getAge()).isEqualTo(22);
    }

    @Test
    public void givenWaitressInstance_whenCalledserveStarter_thenOneAssertion() {
        assertThat(waitress.serveStarter("mixed salad")).isEqualTo("Serving a mixed salad");
    }

    @Test
    public void givenWaitressInstance_whenCalledserveMainCourse_thenOneAssertion() {
        assertThat(waitress.serveMainCourse("steak")).isEqualTo("Serving a steak");
    }

    @Test
    public void givenWaitressInstance_whenCalledserveDessert_thenOneAssertion() {
        assertThat(waitress.serveDessert("cup of coffee")).isEqualTo("Serving a cup of coffee");
    }
}