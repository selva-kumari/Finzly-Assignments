package Employeesystem;

public class Developer extends Employee {
private static String programmingLanguage;
Developer(String p){
	programmingLanguage=p;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer("java");
		d.setId(120);
		d.setName("Selva");
		System.out.println("The developer id is "+d.getId());
		System.out.println("Name "+d.getName());
		System.out.println("Progamming Language is "+programmingLanguage);

	}

}
