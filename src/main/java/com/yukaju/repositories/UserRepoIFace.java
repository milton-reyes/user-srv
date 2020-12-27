package com.yukaju.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yukaju.models.User;

public interface UserRepoIFace extends JpaRepository<User, Integer> {

}
