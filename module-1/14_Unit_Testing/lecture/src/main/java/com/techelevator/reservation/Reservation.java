package com.techelevator.reservation;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {

    // This is static so it will be shared among all instance and can be used to generate the next id
    private static int nextId = 100;

    public Reservation() {
        this.id = getNextId();
    }

    public Reservation(String name, String phone, String email, LocalDate checkIn, LocalDate checkOut, int numberOfGuests) {
        this.id = getNextId();
        this.name = name;
        this.phone = phone;
        this.email = email;
        checkInDate = checkIn;
        checkOutDate = checkOut;
        this.numberOfGuests = numberOfGuests;
    }


    private int id;
    private String name;
    private String phone;
    private String email;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int numberOfGuests;


    public int getId() {
        return id;
    }

    // we do not let external code aet the id so there is no setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public static int getNextId() {
        // this is an instance where nextId is returned and THE incremented
        return nextId++;
    }

    /*
        make sure we can compare Reservations based on the data rather than on the
        memory address
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id && numberOfGuests == that.numberOfGuests && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email, checkInDate, checkOutDate, numberOfGuests);
    }

    /*
        make sure the code will print the actual data rather than the memory address when it is printed
     */

    @Override
    public String toString() {
        return "ReservationNew{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}
