package com.techelevator;

import java.util.Scanner;

public class FileReaderSimluation {

    public static void main(String[] args) {

        boolean fileDone = false;

        int i = 1;

        do {

            System.out.println("Reading from file");

            boolean hasData = false;
            if (hasData) {
                System.out.println("line " + i );
                i++;
                if (i > 25) {
                    fileDone = true;
                }
            } else {
                fileDone = true;
            }
        } while (!fileDone);
    }
}
