package com.techelevator.hotels;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataLoader {


    public List<Hotel> loadHotels() {

        List<Hotel> hotels = new ArrayList<>();

        Hotel newHotel = createHotel(1, "Aloft Cleveland", "1111 W 10th St", null, "Cleveland", "Ohio",
                "44113", 3, 48, 274);
        createReservationsForHotel(newHotel);
        hotels.add(newHotel);


        newHotel = createHotel(2, "Hilton Cleveland Downtown", "100 Lakeside Ave", null, "Cleveland", "Ohio",
                "44114", 4, 12, 287);
        hotels.add(newHotel);


        newHotel = createHotel(3, "Metropolitan at the 9", "2017 E 9th St", null, "Cleveland", "Ohio",
                "44115", 4, 22, 319);
        hotels.add(newHotel);


        newHotel = createHotel(4, "The Westin Pittsburgh", "1000 Penn Ave", null, "Pittsburgh", "Pennsylvania",
                "15222", 4, 60, 131);
        hotels.add(newHotel);


        newHotel = createHotel(5, "Hilton Columbus Downtown", "401 N High St", null, "Columbus", "Ohio",
                "43215", 4, 43, 190);
        hotels.add(newHotel);


        newHotel = createHotel(6, "The Summit A Dolce Hotel", "5345 Medpace Way", null, "Cincinnati", "Ohio",
                "43215", 4, 43, 218);
        hotels.add(newHotel);


        newHotel = createHotel(7, "Greektown Detroit", "1200 St Antoine St", null, "Detroit", "Michigan",
                "48226", 4, 75, 185);
        hotels.add(newHotel);


        return hotels;

    }

    private Hotel createHotel(int id, String name, String address, String address2, String city,
                              String state, String zip, int stars, int rooms, int rate) {
        Hotel newHotel = new Hotel();
        newHotel.setId(id);
        newHotel.setName(name);


        Address newAddress = new Address();
        newAddress.setAddress(address);
        newAddress.setAddress2(address2);
        newAddress.setCity(city);
        newAddress.setState(state);
        newAddress.setZip(zip);

        newHotel.setAddress(newAddress);

        newHotel.setStars(stars);
        newHotel.setAvailableRooms(rooms);
        newHotel.setCostPerNight(rate);

        return newHotel;
    }

    private void createReservationsForHotel(Hotel hotel) {
        List<Reservation> reservations = hotel.getReservations();

        Reservation yoavRes = createReservation("Yoav", "646-408-0655", "yoav@te.com",
                LocalDate.now(), LocalDate.now().plusDays(3), 2);
        reservations.add(yoavRes);

        Reservation lindaRes = createReservation("Linda", "415-408-0655", "jazzygirl7@aol.com",
                LocalDate.now().plusMonths(3).plusDays(3),
                LocalDate.now().plusMonths(3).plusDays(3).plusDays(5), 6);
        reservations.add(lindaRes);
    }

    private Reservation createReservation(String name, String phone, String email, LocalDate checkInDate,
                                             LocalDate checkOutDate, int numberOfGuests) {

        // TODO
        // uncomment

        Reservation newReservation = new Reservation(name, phone, email, checkInDate, checkOutDate, numberOfGuests);
        return newReservation;
    }

    public Map<Integer, Reservation> loadQuickLookUp(List<Hotel> hotels) {
        // TODO
        // create a map for the quick reservation. it will use the id of
        // the reservation as the key and the reservation of the value

        Map<Integer, Reservation> lookup = new HashMap<>();

        for (Hotel hotel : hotels) {
            for (Reservation reservation : hotel.getReservations()) {
                // TODO
                // add the reservation to the map
                lookup.put(reservation.getId(), reservation);


            }
        }

        // TODO
        // modify this to return the Map
        return lookup;
    }
}
