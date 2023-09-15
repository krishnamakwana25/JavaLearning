package org.example.designpatterns.creational.prototypedesignpatterns;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("creating object using prototype design patterns");
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.4.4");
        networkConnection.loadData();

        System.out.println(networkConnection);

        //new object of network connection
        try{
            System.out.println("SHALLOW COPY");
            NetworkConnection clone1 =(NetworkConnection) networkConnection.clone();
            NetworkConnection clone2 =(NetworkConnection) networkConnection.clone();
            clone1.setIp("192.168.1.1");
            clone1.getDomains().remove(0);
            System.out.println(clone1);

            System.out.println(clone2);

            System.out.println("DEEP COPY");
            NetworkConnectionDeepCopy deepCopy = new NetworkConnectionDeepCopy();
            deepCopy.setIp("192.168.4.4");
            deepCopy.loadData();
            System.out.println(deepCopy);
            deepCopy.setIp("192.168.1.1");
            deepCopy.getDomains().remove(0);
            System.out.println(deepCopy);

            NetworkConnectionDeepCopy deepCopy1 = (NetworkConnectionDeepCopy) deepCopy.clone();
            System.out.println(deepCopy1);
            NetworkConnectionDeepCopy deepCopy2 = (NetworkConnectionDeepCopy) deepCopy.clone();
            System.out.println(deepCopy2);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

