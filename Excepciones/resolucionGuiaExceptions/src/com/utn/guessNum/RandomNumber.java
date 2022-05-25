package com.utn.guessNum;

import java.util.Random;

public class RandomNumber {

    private static final Integer MAX = 500;
    private static final Integer MIN = 0;

    public static Integer getNumber() {
        Random r = new Random();
        return r.nextInt((MAX - MIN) + 1) + MIN;
    }

}
