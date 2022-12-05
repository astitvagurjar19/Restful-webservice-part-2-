package com.ttn.RestfulWebServiceAssignment2.Service;

import com.ttn.RestfulWebServiceAssignment2.Entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User(1,"ABC"));
        allUsers.add(new User(2,"DEF"));
        allUsers.add(new User(3,"XYZ"));
    }

    @Override
    public List<User> getAllUsers(){
        return allUsers;
    }

    @Override
    public User addUser(User user) {
        allUsers.add(user);
        return user;
    }

    @Override
    public User getUser(long id) {
        return allUsers.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteUser(long id) {
        allUsers.removeIf(user -> user.getId() == id);
    }
}
