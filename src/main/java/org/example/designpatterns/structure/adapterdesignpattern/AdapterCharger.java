package org.example.designpatterns.structure.adapterdesignpattern;

public class AdapterCharger implements AppleCharger{
    private  AndroidCharger androidCharger;
    public AdapterCharger(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargeIphone() {
        androidCharger.chargeAndroid();
        System.out.println("Your phone is charging with adapter");
    }
}
