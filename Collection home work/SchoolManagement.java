package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SchoolManagement {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		List<Student>student=new ArrayList<>();
		List<Teacher>teacher=new ArrayList<>();
		System.out.println("Welcome to School Management System..");
		while(true) {
		System.out.println("1.Add Student");
		System.out.println("2.Add Teacher");
		System.out.println("3.Student Details");
		System.out.println("4.Teacher Details");
		System.out.println("Enter the option");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Add Student Details");
			System.out.println("Enter Student id:");
			int id=sc.nextInt();
            sc.nextLine();
			System.out.println("Enter Student name:");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Student department:");
			String department=sc.nextLine();
	        student.add(new Student(id,name,department));
			System.out.println("Student details added sucessfully");
			break;
			
		case 2:
			System.out.println("Add Teacher Details");
			System.out.println("Enter Staff id:");
			int staffId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Staff name:");
			String staffName=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Staff salary:");
			double staffSalary=sc.nextDouble();
	        teacher.add(new Teacher(staffId,staffName,staffSalary));
			System.out.println("Staff details added sucessfully");
			break;
			
		case 3:
			System.out.println("Student Details");
			for(Student s:student) {
				System.out.println("Id: "+s.getId()+" "+"Name: "+s.getName()+" "+"Department: "+s.getDepartment());
			}
			break;
			
		case 4:
			System.out.println("Staff Details");
			for(Teacher t:teacher) {
				System.out.println("Id: "+t.getId()+" "+"Name: "+t.getName()+" "+"Salary: "+t.getSalary());
			}
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
			
		
		
		
	}

}
	}
}
