package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.Users;
import com.example.demo.repos.UserRepos;

@Service
public class UserServices implements UserDetailsService{
	
	@Autowired
	private UserRepos userRepos;
	
	@Autowired
	public UserDetails loadUserByName(String name) throws UsernameNotFoundException
	{
		Optional<Users> user= userRepos.findByName(name);
		var userObj=user.get();
		if(user.isPresent()) {
			return User.builder()
					.username("Admin")
					.password("admin")
					.roles("Admin","User")
					.build();
		}else {
			throw new UsernameNotFoundException(name);
		}
	}
	private String[] getRoles(Users usr) {
		return null;
		
	}
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
