package com.dailycodebuffer.Springboot.service;

import java.util.List;

import com.dailycodebuffer.Springboot.entity.User;

public interface UserService {

	User saveUser(User user);

	 List<User> fetchUserList();
		
		
	

	User fetchUserById(Long userId);

	void deleteUserById(Long userId);



	User updateUser(Long userId, User user);

	User updateuser(Long userId, User user);
	

	

	

}
