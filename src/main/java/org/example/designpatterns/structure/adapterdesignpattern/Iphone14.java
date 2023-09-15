package org.example.designpatterns.structure.adapterdesignpattern;

public class Iphone14 {
    public Iphone14(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    private AppleCharger appleCharger;
    public void chargeIphone(){
        appleCharger.chargeIphone();
    }
}
