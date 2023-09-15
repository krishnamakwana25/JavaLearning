package org.example.designpatterns.structure.adapterdesignpattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Adapter design patterns"
        );
        AppleCharger appleCharger  = new AdapterCharger(new ChargerAndroidDK());
        Iphone14 iphone14 = new Iphone14(appleCharger);
        iphone14.chargeIphone();


    }
}
