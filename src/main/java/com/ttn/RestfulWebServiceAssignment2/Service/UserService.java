package com.ttn.RestfulWebServiceAssignment2.Service;

import com.ttn.RestfulWebServiceAssignment2.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    User addUser(User user);

    User getUser(long id);

    void deleteUser(long id);
}
