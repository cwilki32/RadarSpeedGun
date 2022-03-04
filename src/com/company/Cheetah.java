package com.company;

public class Cheetah extends Animal implements Mover{
    private String origin;
    private int maxSpeed;

    public Cheetah(String animalType, String name, int age, String origin, int maxSpeed) {
        super(animalType, name, age);
        this.origin = origin;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public double move() {
        System.out.println(getName() + getAnimalType() + " is now moving " + maxSpeed + " mph.");
        return maxSpeed;

    }
}
