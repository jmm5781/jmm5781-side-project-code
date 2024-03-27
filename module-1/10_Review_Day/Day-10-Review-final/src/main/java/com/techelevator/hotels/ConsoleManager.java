package com.techelevator.hotels;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ConsoleManager {

    private Scanner userInput;

    public ConsoleManager(Scanner userInput) {
        this.userInput = userInput;
    }

    public String getMainMenuChoice() {
        boolean done = false;
        String choice= "";
        while (!done) {
            System.out.println();
            System.out.println("1. View and Reserve Hotels");
            System.out.println("2. Quick reservation lookup");
            System.out.println();
            System.out.print("Enter your choice (X to exit): ");
            choice = userInput.nextLine();
            if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("2")
                    || choice.equalsIgnoreCase("X")) {
                done = true;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        return choice;
    }

    public Hotel getHotelChoice(List<Hotel> hotels) {


        boolean done = false;

        while (!done) {
            System.out.println();
            for (int hotelIndex = 0; hotelIndex < hotels.size(); hotelIndex++) {
                System.out.println((hotelIndex + 1) + ". " + hotels.get(hotelIndex).getName());
            }
            System.out.println();
            System.out.print("Enter your choice (X to exit): ");
            String choice = userInput.nextLine();
            if (choice.equalsIgnoreCase("x")) {
                done =true;
                continue;
            } else if (AppUtil.isNumber(choice)) {
                int choiceVal = Integer.parseInt(choice);
                if (choiceVal >= 1 && choiceVal <= hotels.size()) {
                    return hotels.get(choiceVal - 1);
                }
            }
            System.out.println("Invalid choice, please try again.");
        }
        return null;
    }

    public String getFunctionChoice() {
        boolean choiceMade = false;
        String choice = null;
        while(!choiceMade) {
            System.out.println();
            System.out.print("What would you like to do? (V)iew Reservations, (R)eserve or E(x)it: ");
            choice = userInput.nextLine();

            if (!choice.equalsIgnoreCase("v")
                    &&!choice.equalsIgnoreCase("r")
                    && !choice.equalsIgnoreCase("x")) {
                System.out.println("Invalid choice, try again.");
            } else {
                choiceMade = true;
            }
        }
        return choice;
    }

    public Reservation getReservation() {
        Reservation newReservation = null;
        boolean done = false;
        String name = "";
        String phone = "";
        String email = "";
        LocalDate checkIn = null;
        LocalDate checkOut = null;
        Integer guests = null;

        while(!done) {
            System.out.print("Guest name: ");
            if (!name.isBlank()) {
                System.out.print("[Enter to keep " + name +  "] ");
            }
            name = getInputKeepOrReplace(name);

            System.out.print("Guest phone: ");
            if (!phone.isBlank()) {
                System.out.print("[Enter to keep " + phone +  "] ");
            }
            phone = getInputKeepOrReplace(phone);

            System.out.print("Guest email: ");
            if (!email.isBlank()) {
                System.out.print("[Enter to keep " + email +  "] ");
            }
            email = getInputKeepOrReplace(email);

            String prompt = "Check-in date: ";
            if (checkIn != null) {
                prompt += "[Enter to keep " + AppUtil.stringFromDate(checkIn) +  "] ";
            }
            checkIn = getDateKeepOrReplace(prompt, checkIn);

            prompt = "Checkout date: ";
            if (checkOut != null) {
                prompt += "[Enter to keep " + AppUtil.stringFromDate(checkOut) +  "] ";
            }
            checkOut = getDateKeepOrReplace(prompt, checkOut);


            prompt = "Number of guests:  ";
            if (guests != null) {
                prompt += "[Enter to keep " + guests +  "] ";
            }
            guests = getNumberKeepOrReplace(prompt, guests);

            System.out.println();
            System.out.println("Guest name: " + name);
            System.out.println("Guest phone: " + phone);
            System.out.println("Guest email: " + email);
            System.out.println("Check-in (format: 3/1/24): " + (checkIn != null ? AppUtil.stringFromDate(checkIn) : "N/A"));
            System.out.println("Checkout (format: 3/1/24): " + (checkOut != null ? AppUtil.stringFromDate(checkOut) : "N/A"));
            System.out.println("Number of guests: " + guests);
            System.out.println();
            System.out.print("(S)ave, (E)dit, or E(x)it? ");
            String action = userInput.nextLine();

            if (action.equalsIgnoreCase("x")) {
                done = true;
            } else if (action.equalsIgnoreCase("s")) {
                // TODO
                // uncomment

                newReservation = new Reservation(name, phone, email, checkIn, checkOut,
                            guests != null ? guests : 0);


                done = true;

            }


        }
        return newReservation;

    }

    private String getInputKeepOrReplace(String text) {
        String input = userInput.nextLine();
        return !input.isBlank() ? input : text;
    }

    private Integer getNumberKeepOrReplace(String prompt, Integer curCount) {
        boolean done = false;
        while(!done) {
            System.out.print(prompt);
            String input = userInput.nextLine();
            if (!input.isBlank()) {
                if (AppUtil.isNumber(input)) {
                    return Integer.parseInt(input);
                } else {
                    System.out.println("Invalid number. Try again.");
                }
            } else {
                done = true;
            }
        }
        return null;
    }

    private LocalDate getDateKeepOrReplace(String prompt, LocalDate curDate) {
        boolean done = false;
        while(!done) {
            System.out.print(prompt);
            String input = userInput.nextLine();
            if (!input.isBlank()) {
                if (AppUtil.isDate(input)) {
                    return LocalDate.parse(input, AppUtil.FORMATTER);
                } else {
                    System.out.println("Invalid date. Format is 3/1/24. Try again.");
                }
            } else {
                done = true;
            }
        }
        return curDate;
    }

    public void printReservationsForHotel(Hotel hotel) {
        // TODO
        // modify this to add the name of the hotel
        System.out.println("Reservations for ");
        System.out.println("------------------------------------------------");

        /*
         TODO
         if there are reservations for the hotel, iterate through them and pass the current
         reseravtion to the printReservation metho to be printed



         it there are no reservationss for the hotel, print No current reservations.



         */

        if (hotel.getReservations().size() > 0) {
            for (Reservation reservation : hotel.getReservations()) {
                printReservation(reservation);
            }
        } else {
            System.out.println("No current reservations.");
        }






        // wait for user to push enter before going back to menu
        System.out.println();
        waitForKey();
    }

    public void printReservation(Reservation reservation) {
        System.out.println();

        // TODO
        // uncomment



        System.out.println("Reservation number: " + reservation.getId());
        System.out.println("Guest name: " + reservation.getName());
        System.out.println("Guest phone: " + reservation.getPhone());
        System.out.println("Guest email: " + reservation.getEmail());
        LocalDate checkIn = reservation.getCheckInDate();
        System.out.println("Check-in (format: 3/1/24): " + (checkIn != null ? AppUtil.stringFromDate(checkIn) : "N/A"));
        LocalDate checkOut = reservation.getCheckOutDate();
        System.out.println("Checkout (format: 3/1/24): " + (checkOut != null ? AppUtil.stringFromDate(checkOut) : "N/A"));
        System.out.println("Number of guests: " + reservation.getNumberOfGuests());
        System.out.println();


    }

    public Integer promptForReservationId() {
        boolean done = false;
        while(!done) {
            System.out.println();
            System.out.print("Enter your reservation id (X to cancel): ");
            String resId = userInput.nextLine();
            if (resId.equalsIgnoreCase("x")) {
                done = true;
            } else if (!AppUtil.isNumber(resId)) {
                System.out.println("Invalid id.");
            } else {
                return Integer.parseInt(resId);
            }
        }
        return null;
    }
    public void waitForKey() {
        System.out.println("Press enter to continue...");
        userInput.nextLine();
    }
}
