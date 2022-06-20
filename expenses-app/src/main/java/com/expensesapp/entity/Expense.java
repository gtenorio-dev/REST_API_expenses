package com.expensesapp.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "expenses")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String description;

	private Integer amount;

	@Column(name = "payment_method")
	private String paymentMethod;

	private Date date;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

}
