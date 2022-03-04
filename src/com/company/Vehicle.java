package com.company;

public class Vehicle {//need proprties for a vehicle
    private String vehicleType;
    private String color;
    private boolean canFly;

    public Vehicle(String vehicleType, String color, boolean canFly) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.canFly = canFly;
    }

    public void turnOn() {
        System.out.println(vehicleType + "is on");
    }

    public void turnOff() {
        System.out.println(vehicleType + "is off");
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
