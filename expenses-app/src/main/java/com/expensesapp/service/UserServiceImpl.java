package com.expensesapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensesapp.entity.User;
import com.expensesapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(Integer id) {
		Optional<User> opUser = userRepository.findById(id);
		return opUser.orElse(null);
	}

	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
