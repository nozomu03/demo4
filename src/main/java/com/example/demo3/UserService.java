package com.example.demo3;

import java.util.List;

public interface UserService {
    List<User> List();
    User view(String id);
    boolean add(User user);
    User update(User user);
    boolean delete(String id);
}
