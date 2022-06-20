package com.expensesapp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensesapp.entity.User;
import com.expensesapp.mapper.ExpenseMapper;
import com.expensesapp.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ExpenseMapper expenseMapper;

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}

	@DeleteMapping("/user")
	public boolean deleteUsers(@PathParam(value = "id") Integer id) {
		userService.deleteUser(id);
		return true;
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}

}
