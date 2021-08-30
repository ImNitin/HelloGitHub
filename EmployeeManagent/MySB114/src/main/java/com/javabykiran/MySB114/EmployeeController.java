package com.javabykiran.MySB114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.hello.Student;

@RestController
public class EmployeeController {

	@Autowired
	Student ss; // = new Student();

	@RequestMapping("jbk")
	public ArrayList<StudentRecord> callShow() throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		System.out.println(2);
		System.out.println(55555555);
		Statement state = con.createStatement();
		String sql = "select * from studentrecord";
		ArrayList<StudentRecord> al = new ArrayList<>();
		StudentRecord ss = null;
		ResultSet rs = state.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String marks = rs.getString(3);

			ss = new StudentRecord(id, name, marks);
			al.add(ss);
		}
		return al;
	}

}
