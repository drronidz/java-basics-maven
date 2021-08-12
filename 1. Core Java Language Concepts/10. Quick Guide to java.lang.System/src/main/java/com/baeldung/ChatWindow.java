package com.baeldung;

/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 2:44 PM
*/

import java.awt.*;
import java.awt.event.WindowEvent;

public class ChatWindow {
    public static void main(String[] args) {

    }

    public static void windowStateChanged(WindowEvent event) {
        if(event.getNewState() == WindowEvent.WINDOW_DEACTIVATED) {
            System.gc(); // if it ends up running, great !
        }
    }
}
