package com.luizfilipe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfilipe.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
