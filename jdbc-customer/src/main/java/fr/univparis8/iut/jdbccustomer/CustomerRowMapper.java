package fr.univparis8.iut.jdbccustomer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import model.Customer;

public class CustomerRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"));
	}
	
	


}