package com.quizedrive.quizeexam.Service;

import java.util.Set;


import com.quizedrive.quizeexam.Model.User;
import com.quizedrive.quizeexam.Model.UserRole;

public interface UserService {

    public User creatUser(User user, Set<UserRole> userRoles) throws Exception;
   
     //get user by username
     public User getUser(String username);

     //delete user by username
     public void deleteUser(Long UserId);
    
}
