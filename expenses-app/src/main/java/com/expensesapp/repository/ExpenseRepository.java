package com.expensesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensesapp.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
