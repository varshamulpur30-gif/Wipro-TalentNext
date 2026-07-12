package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "AP09CD5678";
    }

    public String getOwnerName() {
        return "Varsha";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdplayer() {
        System.out.println("CD Player Available");
    }
}