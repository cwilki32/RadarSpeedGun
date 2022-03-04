package com.company;

public class Animal {//need properties of animals
    private String animalType;
    private String name;
    private int age;

    public Animal(String animalType, String name, int age) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(animalType + "is eating. ");
    }
    public void drink() {
        System.out.println(animalType + "is sleeping. ");
    }

    public void sleep() {
        System.out.println(animalType + "is sleeping. ");
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }
}
