package org.example.designpatterns.behavioural.interator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private List<Users> usersList;
    private int length ;
    private int position = 0;
    public MyIteratorImpl(List<Users> userList) {
        this.usersList = userList;
        this.length = usersList.size();
    }

    @Override
    public boolean hasNext() {

        if(position >= length )
            return false; //|| usersList.get(position) == null
        else
            return true;
    }

    @Override
    public Object next() {
        Users users = usersList.get(position);
        position+=1;
        return users;
    }
}
