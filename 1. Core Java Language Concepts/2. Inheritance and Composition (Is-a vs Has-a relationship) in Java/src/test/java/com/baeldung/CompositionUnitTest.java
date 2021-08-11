package com.baeldung;

import com.baeldung.composition.*;
import com.baeldung.inheritance.basics.Person;
import com.baeldung.inheritance.basics.Waitress;
import com.baeldung.inheritance.designpattern.inheritance.Computer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:43 PM
*/

public class CompositionUnitTest {
    @Test
    public void givenComputerInstance_whenExtractedEachField_thenThreeAssertions() {

        Computer computer = new Computer(
                new StandardProcessor("Intel I3"),
                new StandardMemory("Kingston", "1TB"));
        computer.setSoundCard(new StandardSoundCard("Generic Sound Card"));

        assertThat(computer.getProcessor()).isInstanceOf(Processor.class);
        assertThat(computer.getMemory()).isInstanceOf(Memory.class);
        assertThat(computer.getSoundCard()).isInstanceOf(Optional.class);
    }
}
