package ExceptionHandling;
import java.util.*;
      class Employee {
	    private int id;
	    private String name;
	    private int age;

	    public Employee(int id, String name, int age) {
	        this.id=id;
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("ID: " + getId());
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}

