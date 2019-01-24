package fr.univparis8.iut.jdbccustomer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univparis8.iut.jdbccustomer.CustomerRowMapper;
import fr.univparis8.iut.jdbccustomer.JdbcCustomerApplication;
import model.Customer;

@RestController
public class JdbcCustomerController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("/customers")
	public List<Customer> getAll()
	{
		return getAllCustomers();

	}
	
	@GetMapping("/customer")
	public List<Customer> getAll(@RequestParam("id") int id)
	{
		return getById(id);

	}

	public List<Customer> getAllCustomers(){
		return jdbcTemplate.query(
				"SELECT * FROM customers", new Object[] {},
				new CustomerRowMapper());
	}
	
	public List<Customer> getById(int id){
		return jdbcTemplate.query(
				"SELECT * FROM customers WHERE id = ?", new Object[] {id},
				new CustomerRowMapper());
	}

}
