package org.example.designpatterns.creational.prototypedesignpatterns;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public NetworkConnection() {

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

        domains.add("www.google.com");
        domains.add("www.youtube.com");
        domains.add("www.leetcode.com");
        this.data = "Data is loaded";
        Thread.sleep(3000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
