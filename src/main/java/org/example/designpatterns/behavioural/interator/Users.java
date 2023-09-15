package org.example.designpatterns.behavioural.interator;

public class Users {
    private String name;
    private String id;

    public Users(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
