package com.techelevator.hotels;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppUtil {

    public static final DateTimeFormatter FORMATTER= DateTimeFormatter.ofPattern("M/d/yy");

    public static boolean isNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isDate(String text) {

        try {
            LocalDate.parse(text, FORMATTER);
            return true;
        } catch (DateTimeException ex) {
            return false;
        }
    }
    public static String stringFromDate(LocalDate date) {
        if (date != null) {
            return date.format(FORMATTER);
        }
        return null;
    }
}
