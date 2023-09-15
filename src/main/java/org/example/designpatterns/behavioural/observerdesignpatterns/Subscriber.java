package org.example.designpatterns.behavioural.observerdesignpatterns;

public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name = name;
    }
//    @Override
//    public void notified() {
//        System.out.println("Hello "+this.name+" New video uploaded notification");
//    }

    @Override
    public void notified(String videoTitle) {
        System.out.println("Hello "+this.name+" New video uploaded notification for "+ videoTitle);
    }
}
