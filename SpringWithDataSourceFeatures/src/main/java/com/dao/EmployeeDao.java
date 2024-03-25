package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
DataSource ds;

public int storeEmployee() {
	try {
		Connection con=ds.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		}catch(Exception e) {
		System.err.println(e);
		return 0;
	}
}
}
