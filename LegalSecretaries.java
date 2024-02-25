package Employees;

public class LegalSecretaries extends Employee {

	public LegalSecretaries(String name, int id) {
		super(name, id);
		annualSalary+=5000;
		section = "Legal Secretaries";
	}
	
	public void legalDocuments() {
		System.out.println("Mr "+name+" know how to write Legal documents");
	}
}
