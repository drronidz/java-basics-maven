package com.baeldung.inheritance.designpattern.inheritance;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 2:20 PM
*/

import com.baeldung.composition.Memory;
import com.baeldung.composition.Processor;
import com.baeldung.composition.SoundCard;

import java.util.Optional;

public class Computer {

    private final Processor processor;
    private final Memory memory;
    private SoundCard soundCard;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Optional<SoundCard> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }

    @Override
    public String toString() {
        return "Computer {" +
                "processor=" + processor +
                ", memory=" + memory +
                ", soundCard=" + soundCard +
                " }";
    }
}
