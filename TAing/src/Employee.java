public class Employee {

    //add three instance variables: name, salary, and employee id
	String name;
	double salary;
	int employeeID;
    //create a constructor that initializes the name and employee id
	public Employee(String n, int id){
		name = n;
		employeeID = id;
	}
    //create a method that sets the salary
	public void setSalary(double sal){
		salary = sal;
	}
}
