package org.example.designpatterns.structure.adapterdesignpattern;

public class ChargerXYZ  implements AppleCharger{
    @Override
    public void chargeIphone() {
        System.out.println("[chargeIphone]..");
        System.out.println("Your iPhone is charged..!");
    }
}
