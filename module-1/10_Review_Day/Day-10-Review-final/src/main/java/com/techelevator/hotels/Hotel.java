package com.techelevator.hotels;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hotel {

    private int id;
    private String name;

    // TODO
    // This is a "has-a" relationship - a hotel "has-a(n)" Address
    private Address address;

    private int stars;

    private int availableRooms;

    private int costPerNight;


    // TODO
    // This is a "has-a" relationship - a hotel "has-a" List of Reservations
    private List<Reservation> reservations = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public int getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(int costPerNight) {
        this.costPerNight = costPerNight;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation newReservation) {
        reservations.add(newReservation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id && stars == hotel.stars && availableRooms == hotel.availableRooms && costPerNight == hotel.costPerNight && Objects.equals(name, hotel.name) && Objects.equals(address, hotel.address) && Objects.equals(reservations, hotel.reservations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, stars, availableRooms, costPerNight, reservations);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", stars=" + stars +
                ", availableRooms=" + availableRooms +
                ", costPerNight=" + costPerNight +
                ", reservations=" + reservations +
                '}';
    }
}
