package Employees;

public class Marketers extends Employee {

	public Marketers(String name, int id) {
		super(name, id);
		annualSalary = 50000;
		section = "Marketer";
		
	}
	public void advertisements() {
		System.out.println("Mr "+name+" Know in advertisements");
	}
}
