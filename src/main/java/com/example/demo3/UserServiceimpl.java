package com.example.demo3;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    List<User> userList;

    public UserServiceimpl() {
        userList = new ArrayList<>();
        userList.add(new User("1", "user1", "user111@dgsw"));
        userList.add(new User("2","user2", "user222@dgsw"));
        userList.add(new User("3","user3", "user333@dgsw"));

    }

    @Override
    public List<User> List() {
        return this.userList;
    }

    @Override
    public User view(String id) {
        User found=null;
        for(int i=0; i<this.userList.size(); i++){
            found = this.userList.get(i);
            if(found.getId().equals(id)){
                return found;
            }
        }
        return null;
    }

    @Override
    public boolean add(User user) {
       return this.userList.add(user);
    }

    @Override
    public User update(User user) {
        User found = this.view(user.getId());
        if(found != null){
            found.setName(user.getName());
            found.setEmail(user.getEmail());
        }
        return found;
    }

    @Override
    public boolean delete(String id) {
        User found = this.view(id);
        return this.userList.remove(found);
    }
}
