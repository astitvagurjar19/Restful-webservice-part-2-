package com.ttn.RestfulWebServiceAssignment2.Service;

import com.ttn.RestfulWebServiceAssignment2.Entity.ProtectedUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProtectedUserServiceImpl implements ProtectedUserService{
    private static ArrayList<ProtectedUser> allProtectedUsers = new ArrayList<>();

    static {
        allProtectedUsers.add(new ProtectedUser(1,"PABC","A123","A123"));
        allProtectedUsers.add(new ProtectedUser(2,"PDEF","D123","D123"));
        allProtectedUsers.add(new ProtectedUser(3,"PXYZ","X123","X123"));

    }

    @Override
    public List<ProtectedUser> getAllProtectedUsers() {
        return allProtectedUsers;
    }

    @Override
    public ProtectedUser addProtectedUser(ProtectedUser protectedUser) {
        allProtectedUsers.add(protectedUser);

        return protectedUser;
    }
}
