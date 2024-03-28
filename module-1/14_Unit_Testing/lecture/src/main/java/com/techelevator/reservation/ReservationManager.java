package com.techelevator.reservation;

import java.util.HashMap;
import java.util.Map;

public class ReservationManager {

    private Map<Integer, Reservation> reservationLookup = new HashMap<>();

    public Map<Integer, Reservation> getReservationLookup() {
        return reservationLookup;
    }

    public void addReservation(Reservation newReservation) {
        reservationLookup.put(newReservation.getId(), newReservation);
    }

    public Reservation findReservation(Integer reservationId) {
        return reservationLookup.get(reservationId);
    }
}
