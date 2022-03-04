package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Create an interface named Mover with a single method named move. The move method should return a number
        // representing the speed at which the thing is moving. -- should be an int move() { return //refactor
        //Make a RadarSpeedGun class. The class should have as a property a list of moving things. //refactor use Mover Type
        //BONUS: Consider how and why it was advantageous to utilize an interface in this example.
        //Could there be an alternative way? What if instead of an interface, we made a Mover class, and made
        // it the superclass of all classes (ie, in the example stated above, both Animal and Vehicle would extend Mover)?
        Cheetah cheetah = new Cheetah("Cheetah", "Tyreek", 2, "Detroit", 55);
        Cheetah cheetah1 = new Cheetah("Cheetah", "Chester", 5, "Florida", 90);
        ATV atv = new ATV("ATV", "Blue", false, "Yamaha", 3, 70);
        ATV atv1 = new ATV("ATV", "Black", true, "Ford", 8, 150);

        RadarSpeedGun radarSpeedGun = new RadarSpeedGun();

        radarSpeedGun.addMover(cheetah);
        radarSpeedGun.addMover(cheetah1);
        radarSpeedGun.addMover(atv);
        radarSpeedGun.addMover(atv1);

        System.out.println("Total speed of movers is: " + radarSpeedGun.startMoving() + " mph.");
    }
}