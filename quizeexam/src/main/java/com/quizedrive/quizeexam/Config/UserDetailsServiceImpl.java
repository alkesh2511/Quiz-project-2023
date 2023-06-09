package com.quizedrive.quizeexam.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.quizedrive.quizeexam.Model.User;
import com.quizedrive.quizeexam.Repo.UserRepository;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
               
       User user = userRepository.findByUsername(username);
       if(user==null)
       {
         System.out.println("User nOt found");
         throw new UsernameNotFoundException("username not found");
       }
      // CostomeUserInfo costomeUserInfo =new CostomeUserInfo(user);
       
       return user;
    }
    
}
