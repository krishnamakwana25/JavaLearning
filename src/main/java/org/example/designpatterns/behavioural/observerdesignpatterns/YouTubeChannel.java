package org.example.designpatterns.behavioural.observerdesignpatterns;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);

    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void newVideoUploaded(String videoTitle) {
        for (Observer ob: this.subscribers) {
            ob.notified(videoTitle);
        }
    }
}