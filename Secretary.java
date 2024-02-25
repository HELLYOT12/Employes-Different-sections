package Employees;

public class Secretary extends Employee {

	public Secretary(String name , int id) {
		super(name, id);
		section = "Secretary";
	}
	
	public void reports() {
		System.out.println("Mr "+name+" know how to write report");
	}
}
