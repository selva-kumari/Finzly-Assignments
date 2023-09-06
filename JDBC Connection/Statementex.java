package com.jdbc;

import java.sql.*;
import java.sql.DriverManager;
public class Statementex{
public static void main(String args[]) throws ClassNotFoundException,SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	
	//Insert
	String query ="insert into student values(9,'sj','tt')";
	Statement st = con.createStatement();
	st.executeUpdate(query);
	System.out.println("Inserted successfully");
	
	//Read
	query = "select * from student";
	ResultSet rs = st.executeQuery(query);
	while (rs.next()){
		System.out.println("ID: "+rs.getInt("Id"));
		System.out.println("Username: "+rs.getString("Name"));
		System.out.println("Department: "+rs.getString("Dept"));
		
	}
	
	//Delete
	query = "delete from student where id = 2";
	int x = st.executeUpdate(query);
	System.out.println("Deleted successfully");
	
	//Modify
    query = "update student set name = 'kiddo' where id = 3;";
    x = st.executeUpdate(query);
    System.out.println("Updated successfully");

}
}
