package com.utn.guessNum;


public class Game {


    private static boolean hit = false;
    private Integer number = RandomNumber.getNumber();
    private Integer attempts = 0;

    public Integer getNumber() {
        return number;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public static boolean isHit() {
        return hit;
    }

    public boolean numberAttempt(int number) {
        int i = this.number.compareTo(number);
        if (i == 0) {
            hit = true;
        } else if (i == 1) {
            hit = false;
            System.out.println("El Numero ingresado es menor");
        } else if (i == -1) {
            hit = false;
            System.out.println("Numero ingresado es mayor");
        }
        return hit;
    }

    public boolean userAttempt(String s) {
        boolean flag = false;
        attempts++;
        try {
            Integer i = Integer.parseInt(s);
            flag = true;
            this.hit = numberAttempt(i);
        } catch (NumberFormatException e) {
            flag = false;
            e.printStackTrace();
        } finally {
        }
        return flag;
    }

}
