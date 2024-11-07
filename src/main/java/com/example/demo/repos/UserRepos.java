package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Users;
import java.util.List;
import java.util.Optional;


public interface UserRepos extends JpaRepository<Users, Long>{
	
	Optional<Users> findByName(String name);
}
