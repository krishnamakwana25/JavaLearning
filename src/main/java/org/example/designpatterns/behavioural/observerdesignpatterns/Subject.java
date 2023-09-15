package org.example.designpatterns.behavioural.observerdesignpatterns;


public interface Subject {
    public void subscribe(Observer ob);
    public void unsubscribe(Observer ob);
    public void newVideoUploaded(String videoTitle);
}
