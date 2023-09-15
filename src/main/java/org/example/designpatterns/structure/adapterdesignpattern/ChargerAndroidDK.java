package org.example.designpatterns.structure.adapterdesignpattern;

public class ChargerAndroidDK implements AndroidCharger{
    @Override
    public void chargeAndroid() {
        System.out.println("[chargeAndroid]..Your android is charged..!");
    }
}
