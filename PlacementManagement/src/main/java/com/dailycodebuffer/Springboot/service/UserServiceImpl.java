package com.dailycodebuffer.Springboot.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.entity.User;
import com.dailycodebuffer.Springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
	
		return userRepository.save(user);
	}

	@Override
	public User fetchUserById(Long UserId) {
		
		return userRepository.findById(UserId).get();
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	     
		
	}

	

	@Override
	public List<User> fetchUserList() {
		
		return userRepository.findAll();
	}
	
	@Override
	   public User updateUser(Long userId, User user) {
	       User users = userRepository.findById(userId).get();

	       if(Objects.nonNull(user.getName()) &&
	       !"".equalsIgnoreCase(user.getName())) {
	           users.setName(user.getName());
	       }

	       if(Objects.nonNull(user.getType()) &&
	               !"".equalsIgnoreCase(user.getType())) {
	           users.setType(user.getType());
	       }

	       if(Objects.nonNull(user.getPassword()) &&
	               !"".equalsIgnoreCase(user.getPassword())) {
	           users.setPassword(user.getPassword());
	       }

	       return userRepository.save(users);
	   }

	@Override
	public User updateuser(Long userId, User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	

	
	}





	
