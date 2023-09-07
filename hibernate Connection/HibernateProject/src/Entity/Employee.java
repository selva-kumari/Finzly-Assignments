package Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

 private int emp_Id;
 private String emp_Name;
 private double emp_Salary;
 private String emp_Dept;
public Employee(int emp_Id, String emp_Name, double emp_Salary, String emp_Dept) {
	this.emp_Id = emp_Id;
	this.emp_Name = emp_Name;
	this.emp_Salary = emp_Salary;
	this.emp_Dept = emp_Dept;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
@Id
public int getempId() {
	return emp_Id;
}
public void setempId(int empId) {
	this.emp_Id = empId;
}
public String getempName() {
	return emp_Name;
}
public void setempName(String empName) {
	this.emp_Name = empName;
}
public double getempSalary() {
	return emp_Salary;
}
public void setempSalary(double salary) {
	this.emp_Salary = salary;
}
public String getempDept() {
	return emp_Dept;
}
public void setempDept(String emp_Dept) {
	this.emp_Dept = emp_Dept;
}
@Override
public String toString() {
	return "Employee [empId=" + emp_Id + ", empName=" + emp_Name + ", empSalary=" + emp_Salary + ", empDept=" + emp_Dept
			+ "]";
}
 
}
