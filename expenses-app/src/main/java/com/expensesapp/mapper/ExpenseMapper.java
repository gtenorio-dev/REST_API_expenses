package com.expensesapp.mapper;

import java.util.List;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import com.expensesapp.dto.ExpenseDTO;
import com.expensesapp.entity.Expense;

public class ExpenseMapper {

	@Autowired
	private ModelMapper modelMapper;

	@PostConstruct
	public void config() {
		System.out.println("post construct");
	}

	public ExpenseDTO convertToDTO(Expense expense) {
		return modelMapper.map(expense, ExpenseDTO.class);
	}

	public Expense convertToEntity(ExpenseDTO expenseDTO) {
		return modelMapper.map(expenseDTO, Expense.class);
	}

	public List<ExpenseDTO> convertToDTOList(List<Expense> expenses) {
		return modelMapper.map(expenses, new TypeToken<List<ExpenseDTO>>() {
		}.getType());
	}

	public List<Expense> convertToEntityList(List<ExpenseDTO> expensesDTO) {
		return null;
	}

}
