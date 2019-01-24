package model;

public class Customer {
	
	private long id;
	private String firstName;
	private String lastName;
	
	public Customer(long id, String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}

	
	
	
	

}
