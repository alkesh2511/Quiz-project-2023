package com.quizedrive.quizeexam.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizedrive.quizeexam.Model.Role;
import com.quizedrive.quizeexam.Model.User;
import com.quizedrive.quizeexam.Model.UserRole;
import com.quizedrive.quizeexam.Service.UserService;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//creating user

  @PostMapping("/")
  public User creatUser(@RequestBody User user) throws Exception
 {
    user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
    
    Set<UserRole> Roles = new HashSet<>();
    Role role = new Role();
    role.setRoleId(45L);
    role.setRoleName("normal");

    UserRole userRole = new UserRole();
    userRole.setRole(role);
    userRole.setUser(user);


    Roles.add(userRole);

    return this.userService.creatUser(user, Roles);
 }
    
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
       return this.userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delUser(@PathVariable("userId") Long userId)
    {
        this.userService.deleteUser(userId);
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }




}
