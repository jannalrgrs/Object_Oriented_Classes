package employeeClasses;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee { // we are calling the main elsewhere	
	
	private float Salary; //all variables are set to default values
	
	private String firstName;
	
	private String lastName;
	
	private String jobTitle;
	
	private String id;
	
	private LocalDateTime dateHired; //gets Null as an exception
	
	//Constructor:
	public Employee ()
	{
		Salary = 10;
		jobTitle = "Waiter";
		dateHired = LocalDateTime.now();
		firstName = lastName = "";
		
		id = "0000000000";
	}
	//Constructor that has parameters
	public Employee(String fn, String ln, String title, float sal){
	/*   Salary = sal;  //not a good way to assign, doesnt set or get the variables.
	   					//bypasses current set
	   firstName = fn;
		
	   lastName = ln;
		
	   jobTitle = title;*/
		setSalary(sal);
		setFirstName(fn);
		setLastName(ln);
		setJobTitle(title);
		//go create another object in the main
	}
	
	
	
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getDateHired() {
		return dateHired;
	}
	public void setDateHired(LocalDateTime dateHired) {
		this.dateHired = dateHired;
	}
	
	public void setFirstName (String input){
		firstName = input;
	}
	public String getFirstName() {
		return firstName; //if you don't want this seen from the outside, delete the get
	}

	
	public void printName()
	{ //method
		System.out.println(lastName + ", " + firstName + ": " + jobTitle);	
	}	

}
