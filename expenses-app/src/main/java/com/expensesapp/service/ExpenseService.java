package com.expensesapp.service;

import java.util.List;

import com.expensesapp.entity.Expense;

public interface ExpenseService {

	public Expense createExpense(Expense expense);

	public Expense updateExpense(Expense expense);

	public Expense getExpense(Integer id);

	public void deleteExpense(Integer id);

	public List<Expense> getExpenses();

}
