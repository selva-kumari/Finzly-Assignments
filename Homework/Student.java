package Studentsystem;

public class Student {
private String name;
private int age;
private int studentId;
Student(){
	this.name="unknown";
	this.age=0;
	this.studentId=101;
	System.out.println("Name "+name);
	System.out.println("Age "+age);
	System.out.println("Id "+studentId);
}
Student(String name,int age,int studentId){
	this.name=name;
	this.age=age;
	this.studentId=studentId;
	System.out.println("Name "+name);
	System.out.println("Age "+age);
	System.out.println("Id "+studentId);
}
Student(int age){
	this.age=age;
	System.out.println("Age "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
