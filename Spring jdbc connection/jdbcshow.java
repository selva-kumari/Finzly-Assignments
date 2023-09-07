package com.selva.SpringProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jdbcshow {
	
    @RequestMapping("show")
    List<String> getInfo() throws SQLException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
            System.out.println("Connected successfully");
            
            java.sql.Statement st = con.createStatement();
            String query = "select * from student";
            ResultSet rs = st.executeQuery(query);
            
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                String dept = rs.getString("Dept");
                list.add(dept);
            }
            
            for (String dept : list) {
                System.out.println(dept);
            }
            
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; 
        }
    }
}
