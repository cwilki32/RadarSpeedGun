package com.company;

public class ATV extends Vehicle implements Mover{
    private String brand;
    private int noOfWheels;
    private int maxSpeed;

    public ATV(String vehicleType, String color, boolean canFly, String brand, int noOfWheels, int maxSpeed) {
        super(vehicleType, color, canFly);
        this.brand = brand;
        this.noOfWheels = noOfWheels;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public double move() {
        System.out.println(getBrand() + getVehicleType() + " is now moving " + maxSpeed + " mph.");
        return maxSpeed;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getBrand() {
        return brand;
    }
}
