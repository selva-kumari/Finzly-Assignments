package Entity;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();          
		cfg.configure();
		
		cfg.addAnnotatedClass(Employee.class);
	
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
	
        org.hibernate.Transaction tr = session.beginTransaction();
       
        
        //insert
       
		Employee emp = new Employee();
		emp.setempId(100);
		emp.setempName("js");
		emp.setempSalary(20000);
		emp.setempDept("ai");
		session.save(emp);
		System.out.println("Data saved successfuly");
		
		//update
		
		Employee emp2 = new Employee();
		emp.setempId(1);
		emp.setempName("js");
		emp.setempSalary(40000);
		emp.setempDept("cs");
		session.update(emp);
		System.out.println("Data updated successfuly");

		
		//delete
		
		Employee emp1 = new Employee();
		emp1.setempId(104);
		emp1.setempName("abi");
		emp1.setempSalary(67765);
		emp1.setempDept("it");
		session.delete(emp1);
		System.out.println("Data Deleted successfuly");
		
		tr.commit();
		session.close();
	}
}
