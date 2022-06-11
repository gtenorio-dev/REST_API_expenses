package com.expensesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensesapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	// @Query("SELECT u FROM User u WHERE u.id = ?1")
	public User findByEmail(String email);

}
