package com.example.restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "dudu", LocalDate.now()));
        users.add(new User(2, "do", LocalDate.now()));
        users.add(new User(3, "one", LocalDate.now()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
