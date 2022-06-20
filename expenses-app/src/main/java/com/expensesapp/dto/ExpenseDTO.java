package com.expensesapp.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExpenseDTO {

	private Integer id;
	private String description;
	private Integer amount;
	private String paymentMethod;
	private Date date;

}
