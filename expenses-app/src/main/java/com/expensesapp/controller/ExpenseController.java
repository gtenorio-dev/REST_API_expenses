package com.expensesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensesapp.entity.Expense;
import com.expensesapp.service.ExpenseService;

@RestController
@RequestMapping("expense")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	@GetMapping
	public List<Expense> getExpenses() {
		return expenseService.getExpenses();
	}

}
