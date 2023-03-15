package com.quizedrive.quizeexam.Service.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizedrive.quizeexam.Helper.UserFoundException;
import com.quizedrive.quizeexam.Model.User;
import com.quizedrive.quizeexam.Model.UserRole;
import com.quizedrive.quizeexam.Repo.RoleRepository;
import com.quizedrive.quizeexam.Repo.UserRepository;
import com.quizedrive.quizeexam.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


   
    @Override
    public User creatUser(User user, Set<UserRole> userRoles) throws Exception {

         User local =this.userRepository.findByUsername(user.getUsername());
     if (local != null) {
         System.out.println("User is already there !!");
         throw new UserFoundException();
    } else 
    {
         //user create

         
         for (UserRole ur : userRoles) {
             roleRepository.save(ur.getRole());
         }

         user.getUserRoles().addAll(userRoles);
         local = this.userRepository.save(user);

     }

     return local;
 }


     //getting username by username
   @Override
   public User getUser(String username) {
      
      return this.userRepository.findByUsername(username);
   }

   //delete user by user id
   @Override
   public void deleteUser(Long UserId) {
      this.userRepository.deleteById(UserId);      
   }


      
   }
