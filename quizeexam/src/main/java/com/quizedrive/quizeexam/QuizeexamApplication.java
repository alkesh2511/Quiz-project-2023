package com.quizedrive.quizeexam;

//import java.util.HashSet;
//import java.util.Set;

//import org.springframework.beans.factory.annotation.Autowired;

// import java.util.HashSet;
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// /import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// import com.quizedrive.quizeexam.Model.Role;
// import com.quizedrive.quizeexam.Model.User;
// import com.quizedrive.quizeexam.Model.UserRole;
//import com.quizedrive.quizeexam.Service.UserService;

// import com.quizedrive.quizeexam.Model.Role;
// import com.quizedrive.quizeexam.Model.User;
// import com.quizedrive.quizeexam.Model.UserRole;
// import com.quizedrive.quizeexam.Service.UserService;

@SpringBootApplication
public class QuizeexamApplication implements CommandLineRunner{

	// @Autowired
	// @Autowired
    // private UserService userService;

    // @Autowired
    // private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(QuizeexamApplication.class, args);
	}
 	@Override
     public void run(String... args) throws Exception {
     	try{
          System.out.println("project strated....");	
		
// 		 User user = new User();
// 		 user.setFirstName("Alkesh"); 
// 		 user.setLastName("sury");
// 		 user.setUsername("ak123");
// 		 user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
// 		 user.setEmail("alkesh@25");
// 		 user.setProfile("default.jpj");

// 		 Role role1 = new Role();
// 		 role1.setRoleId(44L);
// 		 role1.setRoleName("Admin");

// 		 Set<UserRole> userRolesSet= new HashSet<>();
// 		 UserRole userRole = new UserRole();
// 		 userRole.setRole(role1);
// 		 userRole.setUser(user);
// 		 userRolesSet.add(userRole);
		 
// 		User user1 = this.userService.creatUser(user,userRolesSet);
// 		  System.out.println(user1.getUsername());


	}catch (Exception e) {
		e.printStackTrace();

   }
	}
}
