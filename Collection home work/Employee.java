package Collection;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee {
private int empId;
private String empName;
private double empSalary;
Employee(){
}
Employee(int id,String name,double salary)
{
	empId=id;
	empName=name;
	empSalary=salary;
}
public int getId() {
	return empId;
}
public String getName() {
	return empName;
}

public double getSalry() {
	return empSalary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> EmployeeList=new ArrayList<>();
	System.out.println("Welcome to Employee Management System..");
	boolean flag=true;
	while(flag) {
	
	System.out.println("1.Add Employee");
	System.out.println("2.View Employee Details");
	System.out.println("3.Searching Id");
	System.out.println("4.Exit");
	System.out.println("Enter the option");
	int option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.println("Add Employee Details");
		System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name:");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Employee salary:");
		Double salary=sc.nextDouble();
		EmployeeList.add(new Employee(id,name,salary));
		System.out.println("Employee details added sucessfully");
		break;
		
	 case 2:
		 System.out.println("Viewing Details of Employees");
		 for(Employee emp:EmployeeList) {
			System.out.println(emp);
			 
		 }
		 break;
		 
	  case 3:
		 System.out.println("Searching Id to view employee details");
		 System.out.println("Enter the Searching id");
		 int searchingId=sc.nextInt();
		 boolean idFound = false;
		 for(Employee emp:EmployeeList) {
			 if(emp.getId()==searchingId) {
			 System.out.println("Employee Id "+emp.getId()+" "+"Employee name "+emp.getName()+" "+"Employee salary "+emp.getSalry());
			 idFound=true;
			 break;
		 }}
			 if(!idFound){
				 System.out.println("Id not found");
				
			 }
		
	     
		 break;
	  case 4:
		  System.out.println("You Exit");
		  flag=false;
		  break;
	  default:
		  System.out.println("Invalid choice..");
		  break;

	
}
	}
}

}
