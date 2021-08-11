package com.baeldung;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Java6Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 3:44 PM
*/

class ModuloOperatorTest {
    
    @Test
    void whenIntegerDivision_thenLosesRemainder() {
        assertThat(11 / 4).isEqualTo(2);
    }

    @Test
    void whenDoubleDivision_theKeepsRemainder() {
        assertThat(11 / 4.0).isEqualTo(2.75);
    }

    @Test
    void whenModulo_thenReturnsRemainder() {
        assertThat(11 % 4).isEqualTo(3);
    }

    @Test
    public void whenDivisionByZero_thenArithmeticException(){
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    double result = 1 / 0;
                } );
    }

    @Test
    public void whenModuloByZero_thenArithmeticException(){
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    double result = 1 % 0;
                } );
    }

    @Test
    public void whenDivisorIsOddAndModulusIs2_thenResultIs1(){
        assertThat(3 % 2).isEqualTo(1);
    }

    @Test
    public void whenDivisorIsEvenAndModulusIs2_thenResultIs0(){
        assertThat(4 % 2).isEqualTo(0);
    }

    @Test
    public void whenItemsIsAddedToCircularQueue_thenNoArrayIndexOutOfBounds(){
        int QUEUE_CAPACITY= 10;
        int[] circularQueue = new int[QUEUE_CAPACITY];
        int itemsInserted = 0;
        for (int value = 0; value < 1000; value++) {
            int writeIndex = ++itemsInserted % QUEUE_CAPACITY;
            circularQueue[writeIndex] = value;
        }
    }
}