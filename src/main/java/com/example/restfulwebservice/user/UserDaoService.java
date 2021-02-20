package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "dudu", LocalDate.now(), "test1", "701010-1111111"));
        users.add(new User(2, "do", LocalDate.now(), "test2", "780207-1111111"));
        users.add(new User(3, "one", LocalDate.now(), "test3", "861123-1111111"));
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

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public User update(User user, int id) {
        for (User updateUser : users) {
            if (updateUser.getId() == id) {
                updateUser.setName(user.getName());
                updateUser.setJoinDate(user.getJoinDate());
                return updateUser;
            }
        }
        return null;
    }
}
