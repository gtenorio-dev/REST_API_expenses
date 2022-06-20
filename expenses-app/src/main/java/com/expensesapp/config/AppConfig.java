package com.expensesapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.expensesapp.mapper.ExpenseMapper;

@Configuration
public class AppConfig {

	@Bean("modelMapper")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	@DependsOn("modelMapper")
	public ExpenseMapper expenseMapper() {
		return new ExpenseMapper();
	}

}
