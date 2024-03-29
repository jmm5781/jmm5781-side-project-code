package com.techelevator.reservation;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ReservationManagerTest {

    @Test
    public void addReservation_validData_addsReservation() {

        // Arrange
        ReservationManager reservationManager = new ReservationManager();

        Reservation reservation = new Reservation("linda", "455656", "myeajil", LocalDate.now(), LocalDate.now()
                , 5);

        // Act
        reservationManager.addReservation(reservation);

        Reservation result = reservationManager.getReservationLookup().get(reservation.getId());
        Assert.assertNotNull(result);
        Assert.assertEquals(reservation, result);

        /*
        double num1 = 6.0;
        double num2 = 6.0;

        Assert.assertEquals(num1, num2);
        */


    }

}
