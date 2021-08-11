package com.baeldung;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Java6Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Assert;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 12:34 AM
*/

class SwitchStatementTest {
    private final SwitchStatement switchStatement = new SwitchStatement();

    @Test
    void when_DOG_then_DOMESTIC_Animal() {
        String animal = "DOG";
        Assert.assertEquals("domestic animal",
                switchStatement.exampleOFSWITCH(animal));
    }


}