package com.expensesapp.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

	private Integer id;

	private String name;

	private String lastname;

	private String email;

	private List<ExpenseDTO> expenses;

}
