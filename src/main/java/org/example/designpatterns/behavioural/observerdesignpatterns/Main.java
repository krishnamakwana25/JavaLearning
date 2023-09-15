package org.example.designpatterns.behavioural.observerdesignpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        YouTubeChannel youTube = new YouTubeChannel();
        Subscriber aman = new Subscriber("Aman");
        youTube.subscribe(aman);
//        youTube.newVideoUploaded();

        Subscriber raman = new Subscriber("Raman");
        youTube.subscribe(raman);
        youTube.newVideoUploaded("Learn observer design pattern");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("press 1 to upload video");
            System.out.println("press 2 create new subscriber");
            System.out.println("press 2 unsubscribe");
            System.out.println("press 4 to exit");
            int c = Integer.parseInt(br.readLine());
            switch (c){
                case 1:
                    System.out.println("Enter video title : ");
                    String videoTitle = br.readLine();
                    youTube.newVideoUploaded(videoTitle);
                    break;
                case 2:
                    System.out.println("Enter subscriber name : ");
                    String subsriberName = br.readLine();
                    Subscriber subscriber = new Subscriber(subsriberName);
                    youTube.subscribe(subscriber);
                    break;

                case 3:
                    System.out.println("Enter subscriber name to unsubscribe: ");
                    String subsriberName1 = br.readLine();
                    Subscriber subscriber1 = new Subscriber(subsriberName1);
                    youTube.unsubscribe(subscriber1);
                    break;
                case 4:
                    System.out.println("Exit..!");
                    System.exit(0);

                    break;
            }
        }
    }
}
