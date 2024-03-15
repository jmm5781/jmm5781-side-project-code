package com.techelevator;

import java.util.Date;
import java.util.Random;

public class GameUtils {

    public static int getRandomNumber(int max) {
        Random random = new Random(getSeed());
        return random.nextInt(max) + 1;
    }

    public static long getSeed() {
        Date now = new Date();
        return now.getTime();
    }

    public static boolean isNumber(String numString) {
        try {
            int num = Integer.parseInt(numString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
