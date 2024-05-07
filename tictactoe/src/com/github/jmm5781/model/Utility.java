package com.github.jmm5781.model;

public class Utility {
    public static boolean isValidResponseXorO(String str) {
        char c = Character.toUpperCase(str.charAt(0));
        return c == 'X' || c == 'O';
    }

    public static boolean isValidResponseYorN(String str) {
        char c = Character.toUpperCase(str.charAt(0)); // TODO try/catch to check for invalid non-character input
        return (c == 'Y' || c == 'N');
    }

    public static boolean isValidResponse1to9(String str) {
        int n = Integer.parseInt(str); // TODO try/catch to check for invalid non-integer input
        return (n >= 1 && n <= 9);
    }

}
