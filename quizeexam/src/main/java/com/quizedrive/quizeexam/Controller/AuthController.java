package com.quizedrive.quizeexam.Controller;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizedrive.quizeexam.Config.UserDetailsServiceImpl;
import com.quizedrive.quizeexam.Model.AuthRequest;
import com.quizedrive.quizeexam.Model.AuthResponse;
import com.quizedrive.quizeexam.Model.User;
import com.quizedrive.quizeexam.Service.JwtService;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    
    
    @Autowired
    private AuthenticationManager authenticationManager;
   

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
    
           Authentication authentication = authenticationManager.
           authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
            if(authentication.isAuthenticated())
            {
                String token  =jwtService.generateToken(authRequest.getUsername());
                 return ResponseEntity.ok(new AuthResponse(token));
   
          }
        
        
        else {
            throw new UsernameNotFoundException("invalid user request !");
        }

    }
    
           //return the details of current user
           @GetMapping("/current-user")
           public User getCurrentUser(Principal principal) {
           return ((User) this.userDetailsService.loadUserByUsername(principal.getName()));

          }  



}
