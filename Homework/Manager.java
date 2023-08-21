package Employeesystem;

public class Manager extends Employee{
private static String department;
Manager(String department){
	this.department=department;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager("A");
		m.setId(101);
		m.setName("vjselva");
		System.out.println("The manager id is "+m.getId());
		System.out.println("Name "+m.getName());
		System.out.println("The department is "+department);

	}

}
