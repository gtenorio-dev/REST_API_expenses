package com.expensesapp.service;

import java.util.List;

import com.expensesapp.entity.User;

public interface UserService {

	public User createUser(User user);

	public User updateUser(User user);

	public User getUser(Integer id);

	public void deleteUser(Integer id);

	public List<User> getUsers();

}
