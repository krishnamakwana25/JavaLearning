package org.example.designpatterns.behavioural.interator;

import java.util.ArrayList;
import java.util.List;


public class UserManagement {
    private List<Users> userList = new ArrayList<>();

    public void addUser(Users u){
        System.out.println("User added :- "+u.toString());
        userList.add(u);
    }
    public Users getUser(int index){
        return userList.get(index);
    }
    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
