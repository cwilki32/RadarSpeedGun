package com.company;

import java.util.ArrayList;

public class RadarSpeedGun {//

    ArrayList<Mover> movingThings = new ArrayList<>();     //use the interface type Mover in the List
    private double totalSpeed;

    public RadarSpeedGun() {
        totalSpeed = 0;
    }

    public void addMover(Mover mover) {
        movingThings.add(mover);
    }
    public double startMoving() {
        for (Mover mover : movingThings) {
            totalSpeed += mover.move();

        }
        return totalSpeed;
    }
}








