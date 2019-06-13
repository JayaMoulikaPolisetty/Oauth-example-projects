package com.jaya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaya.model.User;

@Repository
public interface HelloRepository  extends JpaRepository<User, Integer>{
	
	Optional<User> findByName(String username);

	

}
