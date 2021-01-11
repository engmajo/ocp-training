package com.majo.ocp.assignment8;

import java.time.LocalDateTime;

public class Clock implements Runnable {
    @Override
    public void run() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getMinute() + " : " + now.getSecond());

    }
}
