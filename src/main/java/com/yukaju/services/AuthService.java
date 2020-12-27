package com.yukaju.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukaju.models.User;
import com.yukaju.repositories.UserRepoIFace;

@Service
public class AuthService {
	
	@Autowired
	UserRepoIFace userRepo;
	
	public Optional<User> findById(int id) {
		return userRepo.findById(id);
	}

}
