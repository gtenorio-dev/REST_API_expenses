package com.expensesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expensesapp.dto.ExpenseDTO;
import com.expensesapp.entity.Expense;
import com.expensesapp.mapper.ExpenseMapper;
import com.expensesapp.service.ExpenseService;

@RestController
@RequestMapping("expense")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	@Autowired
	private ExpenseMapper expenseMapper;

	@GetMapping
	public List<ExpenseDTO> getExpenses() {
		List<Expense> expenses = expenseService.getExpenses();
		return expenseMapper.convertToDTOList(expenses);
	}

}
