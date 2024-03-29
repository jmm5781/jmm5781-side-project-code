package com.shippingcompany.delivery;

public class DroneDelivery extends Delivery {
    public static final double DRONE_TOP_SPEED = 100.0;

    @Override
    public int getDuration() {
        int weight = super.getShipment().getWeight();
        double topSpeedWithWeight = DRONE_TOP_SPEED / weight;
        double decimalHours = super.getDistance() / topSpeedWithWeight;
//        int hours = (int) decimalHours;
//        int minutes = (int) Math.round((decimalHours - hours) * 60);
        return convertHoursToMinutes(decimalHours); //duration in minutes
    }

}
