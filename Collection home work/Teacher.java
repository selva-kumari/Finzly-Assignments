package Collection;

public class Teacher{
	private int staffId;
	private String staffName;
	private double staffSalary;
	Teacher(int id, String name,double salary) {
		staffId=id;
		staffName=name;
		staffSalary=salary;
	}
	public int getId() {
		return staffId;
	}
	public String getName() {
		return staffName;
	}
	public double getSalary() {
		return staffSalary;
	}

	
}

