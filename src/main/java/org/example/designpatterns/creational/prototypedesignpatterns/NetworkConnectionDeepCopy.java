package org.example.designpatterns.creational.prototypedesignpatterns;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnectionDeepCopy {private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public NetworkConnectionDeepCopy(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public NetworkConnectionDeepCopy() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + this.ip + '\'' +
                ", data='" + this.data + '\'' +
                ", domains=" + this.domains +
                '}';
    }

    public void loadData() throws InterruptedException {
        Thread.sleep(3000);
        domains.add("www.google.com");
        domains.add("www.youtube.com");
        domains.add("www.leetcode.com");
        this.data = "Data is loaded";

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //logic for cloning
        NetworkConnectionDeepCopy networkConnection = new NetworkConnectionDeepCopy();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
//        networkConnection.setDomains(this.getDomains());
        for (String d:this.getDomains()) {
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}

