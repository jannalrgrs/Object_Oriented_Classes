package employeeClasses;

public class MainClass {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(); //create new object --now calls constructor
		//set variable through the () in new Employee.
		
		e1.printName(); //method found in employee class
		
		Employee e2 = new Employee("Steve", "Jobs", "CEO", 1); //creating object and initializing in one line
		
		e2.printName();
		e2.setSalary(100000000);
		

		
		

	}

}
