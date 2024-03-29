package com.shippingcompany.delivery;

import java.time.LocalDateTime;

public class TruckDelivery extends Delivery {
    public static final double TRUCK_TOP_SPEED = 60.0;
    @Override
    public int getDuration() {
        double decimalHours = (double) super.getDistance() / TRUCK_TOP_SPEED;
        int hours = (int) decimalHours;
        int minutes = (int) Math.round((decimalHours - hours) * 60);
        return hours * 60 + minutes; //duration in minutes
    }

}
