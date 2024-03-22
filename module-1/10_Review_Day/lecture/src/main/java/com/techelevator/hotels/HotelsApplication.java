package com.techelevator.hotels;

import java.util.List;
import java.util.Scanner;

public class HotelsApplication {

    private final Scanner userInput;
    private final ConsoleManager consoleManager;

    private final List<Hotel> hotels;

    // TODO
    // create a Map called quickReservationLookup that stores reservation using their ids as the key
    // (don't assign anything to it yet)

    public HotelsApplication() {
        this.userInput  = new Scanner(System.in);
        this.consoleManager = new ConsoleManager(userInput);

        DataLoader loader = new DataLoader();
        this.hotels = loader.loadHotels();


        // TODO
        // initialize the quickReservationLookup using loader's  loadQuickLookUp method


    }

    public void run() {

        boolean done = false;
        while(!done) {

            String choice = consoleManager.getMainMenuChoice();
            if (choice.equalsIgnoreCase("1")) {
                handleHotelsFunction();;
            } else if (choice.equalsIgnoreCase("2")) {
                handleQuickLookup();
            } else {
                done = true;
            }

        }


        System.out.println("Bye!");

    }

    public void handleHotelsFunction() {
        boolean done = false;
        while(!done) {
            Hotel selectedHotel = consoleManager.getHotelChoice(hotels);
            if (selectedHotel != null) {
                printHotelInfo(selectedHotel);

                String choice = consoleManager.getFunctionChoice();
                if (choice.equalsIgnoreCase("v")) {
                    consoleManager.printReservationsForHotel(selectedHotel);
                } else if (choice.equalsIgnoreCase("r")) {
                    Reservation newReservation = consoleManager.getReservation();
                    if (newReservation != null) {
                        // TODO
                        // add the new reservation to the list of reservations for the hotel

                        // TODO
                        // add it to the quick lookup map too

                        System.out.println();
                        System.out.println("Reservation saved.");
                    }
                }

            } else {
                done = true;
            }
        }
    }


    private void printHotelInfo(Hotel hotel) {
        System.out.println();
        System.out.println(hotel.getName());
        Address addressInfo = hotel.getAddress();
        if (addressInfo != null) {
            System.out.println(addressInfo.getAddress());
            if (addressInfo.getAddress2() != null && !addressInfo.getAddress2().isBlank()) {
                System.out.println(addressInfo.getAddress2());
            }
            System.out.println(addressInfo.getCity() + ", " + addressInfo.getState() + "  " + addressInfo.getZip());
        }
        System.out.print("Rating: " + hotel.getStars() + " star");
        if (hotel.getStars() != 1) {
            System.out.print("s");
        }
        System.out.println();
        System.out.println("Cost per night: $" + hotel.getCostPerNight());
    }

    public void handleQuickLookup() {
        Integer resId = consoleManager.promptForReservationId();
        if (resId != null) {

            // TODO
            // retrieve the reservation from the quickReservationLookup Map
            Reservation reservation = null;
            if (reservation != null) {
                consoleManager.printReservation(reservation);
            } else {
                System.out.println("Can't find reservation with id " + resId);
            }
        }
        System.out.println();
        consoleManager.waitForKey();
    }

    public static void main(String[] args) {

        HotelsApplication app = new HotelsApplication();
        app.run();



    }
}
