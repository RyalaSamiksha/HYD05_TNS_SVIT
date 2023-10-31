package com.dailycodebuffer.Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.entity.User;
import com.dailycodebuffer.Springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		
		return userService.saveUser(user);
		}
		
		@GetMapping("/users")
		public List<User> fetchUserList() {
		    //LOGGER.info("Inside fetchUserList of UserController");
		    return userService.fetchUserList();
		    
		}
		
		@GetMapping("/users/{id}")
	    public User fetchuserById(@PathVariable("id") Long userId)
	            {
	        return userService.fetchUserById(userId);
	      
	    }
		

	    @DeleteMapping("/users/{id}")
	    public String deleteUserById(@PathVariable("id") Long userId) {
	        userService.deleteUserById(userId);
	        return "User deleted Successfully!!";
	    }
	    
	    @PutMapping("/users/{id}")
	    public User updateUser(@PathVariable("id") Long userId,
	                                       @RequestBody User user) {
	        return userService.updateUser(userId,user);
	    }
}
	

	

