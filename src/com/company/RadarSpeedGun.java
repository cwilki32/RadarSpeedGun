package com.company;

import java.util.ArrayList;

public class RadarSpeedGun {//


    ArrayList<Object> movingThings = new ArrayList<>();
    private ATV atv;
    private ATV atv1;
    private Cheetah cheetah;
    private Cheetah cheetah1;

    public RadarSpeedGun(ATV atv, ATV atv1, Cheetah cheetah, Cheetah cheetah1) {
        this.atv = atv;
        this.atv1 = atv1;
        this.cheetah = cheetah;
        this.cheetah1 = cheetah1;
    }


    public void addCheetah(ArrayList<Object> movingThings) {
        movingThings.add(cheetah);
        movingThings.add(cheetah1);
    }

    public void addATV(ArrayList<Object> movingThings) {
        this.movingThings.add(atv);
        this.movingThings.add(atv1);
    }

    public void startMoving(ArrayList<Object> movingThings) {
//        for (int i = 0; i < movingThings.size(); i++) {
//            movingThings.get(i).move();
            cheetah.move();
            atv.move();
            cheetah1.move();
            atv1.move();
//                    }
        System.out.println("Combined mph is : " + (cheetah.getMaxSpeed() + atv.getMaxSpeed() + cheetah1.getMaxSpeed()
                + atv1.getMaxSpeed()) + " mph.");
    }
        public String toString (ArrayList<Object> movingThings) {
            return ("Arrays: " + atv.getMaxSpeed() + cheetah.getMaxSpeed());
        }


    }





