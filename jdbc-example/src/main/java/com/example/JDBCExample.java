package com.example;
import java.sql.*;
public class JDBCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/fsademployee";
		String user="root";
		String pwd="root";
		try {
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection established");
			Statement st=con.createStatement();
			String createDept="CREATE TABLE IF NOT EXISTS dept1("+
								"dept_id INT PRIMARY KEY, "+
								"dept_name VARCHAR(50))";
			st.executeUpdate(createDept);
			System.out.println("Dept table created");
			String createEmp="CREATE TABLE IF NOT EXISTS employee1 ("+
							"emp_id INT PRIMARY KEY,"+
							"emp_name VARCHAR(20),"+
							"salary DOUBLE,"+
							"dept_id INT,"+
							"FOREIGN KEY (dept_id) REFERENCES dept1(dept_id))";
			st.executeUpdate(createEmp);
			System.out.println("Employee table created");
			st.executeUpdate("INSERT INTO dept1 VALUES (2, 'CSE')");
			st.executeUpdate("INSERT INTO dept1 VALUES (3, 'ECE')");
			System.out.println("Dept values inserted");
			st.executeUpdate("INSERT INTO employee1 VALUES (102, 'Bob', 60000, 2)");
			st.executeUpdate("INSERT INTO employee1 VALUES (103, 'Charlie', 70000, 3)");
			System.out.println("Employee values inserted");
			//close connection
			con.close();
		}
		catch(Exception e) {
			
		}
	}

}
