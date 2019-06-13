package com.jaya.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jaya.model.CustomUserDetails;
import com.jaya.model.User;
import com.jaya.repository.HelloRepository;

public class SCUserDetailsService implements UserDetailsService {

	@Autowired
	private HelloRepository helloRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = helloRepository.findByName(username);

		optionalUser.orElseThrow(() -> new UsernameNotFoundException("User not found"));

		return optionalUser.map(CustomUserDetails::new).get();
	}

}
