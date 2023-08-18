import java.util.*;
public class Student {
	private int studentId;
	private String Name;
	private static int totalStudents=0;

	public Student(String name,int id) {
		Name=name;
		studentId=id;
	}
	public void enroll() {
	System.out.println(Name+ " "+studentId);
	totalStudents++;
	}
	public static void drop() {
		totalStudents--;
	}

	public static void main(String[] args) {
	Student s=new Student("selva",101);
	s.enroll();
	System.out.println("Totalstudents count "+totalStudents);
	Student s1=new Student("vj",102);
	s1.enroll();
	System.out.println("Totalstudents count "+totalStudents);
	s.drop();
	System.out.println("After drop Totalstudents count "+totalStudents);
	
	
	}

}
