package Employees;

public class Lawayer extends Employee {
	
	public Lawayer(String name, int id) {
		super(name, id);
		section = "Lawayer";
		holyDayWeeks = 3;
	}
	@Override
	public void file() {
		System.out.println("Mr "+name+" want HolyDay for "+holyDayWeeks+" weeks");
		System.out.println("Name:"+name+"  section :"+section+" Used 1 Blue File");
		numberOfBlueFiles--;
	}
	public void Lawsuits () {
		System.out.println("Mr "+name+" can file a lawsuit");
	}


	
}
