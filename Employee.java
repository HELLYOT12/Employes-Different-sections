package Employees;

public class Employee {
	static int numberOfBlueFiles = 100;
	static int numberOfYellowFiles = 100;
	String name;
	String section;
	int id;
	int weekHours = 40;
	int annualSalary;
	int holyDayWeeks = 2;
	
		public Employee(String name , int id) {
			this.name = name;
			this.id = id;
			this.weekHours = 40;
			this.annualSalary =40000;
			this.holyDayWeeks =2;		
			}

		

		public void file() {			
			System.out.println("Mr "+name+" want HolyDay for "+holyDayWeeks+" weeks");
			System.out.println("Name:"+name+"  section:"+section+" Used 1 Yellow File");
			numberOfYellowFiles--;
		}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", section=" + section + ", id=" + id + ", weekHours=" + weekHours
				+ ", annualSalary=" + annualSalary + ", HolyDayWeeks=" + holyDayWeeks + "]";
	}







}