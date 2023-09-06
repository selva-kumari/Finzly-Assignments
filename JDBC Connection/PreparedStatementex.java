package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		 // Insert
        String query = "insert into student values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,2);
        ps.setString(2,"vjselva");
        ps.setString(3,"de");
        ps.executeUpdate();
        System.out.println("Inserted successfully");

        // Read
        query = "select * from student";
        ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
			System.out.println("ID: "+rs.getInt("Id"));
			System.out.println("Username: "+rs.getString("Name"));
			System.out.println("Dept "+rs.getString("Dept"));
			
		}

        //Delete
        query = "delete from student where id=?";
        ps = con.prepareStatement(query);
        ps.setInt(1,3);
        int x = ps.executeUpdate();
        System.out.println("Deleted successfully");

        //Modify
        query = "update student set name = 'vjselva' where id = 2;";
        ps = con.prepareStatement(query);
        x = ps.executeUpdate();
        System.out.println("Updated successfully");

	}

}

