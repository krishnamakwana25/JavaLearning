package org.example.designpatterns.behavioural.interator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Users> usersList = new ArrayList<>();
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new Users("Krishna", "111"));
        userManagement.addUser(new Users("Akshit", "112"));
        userManagement.addUser(new Users("Heena", "113"));
        userManagement.addUser(new Users("Disha", "114"));

        MyIterator iterator = userManagement.getIterator();

        while (iterator.hasNext()){
            Users next = (Users) iterator.next();
            System.out.println(next.toString()
                   
            );
        }
    }
}
