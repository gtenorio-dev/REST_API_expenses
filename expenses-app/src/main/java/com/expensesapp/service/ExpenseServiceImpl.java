package com.expensesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensesapp.entity.Expense;
import com.expensesapp.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}

	public Expense getExpense(Integer id) {
		return expenseRepository.findById(id).orElse(null);
	}

	public void deleteExpense(Integer id) {
		expenseRepository.deleteById(id);
	}

	public List<Expense> getExpenses() {
		return expenseRepository.findAll();
	}

}
