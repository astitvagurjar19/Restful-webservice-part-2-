package com.ttn.RestfulWebServiceAssignment2.Service;

import com.ttn.RestfulWebServiceAssignment2.Entity.ProtectedUser;

import java.util.List;

public interface ProtectedUserService {
    public List<ProtectedUser> getAllProtectedUsers();

    public ProtectedUser addProtectedUser(ProtectedUser protectedUser);


}
