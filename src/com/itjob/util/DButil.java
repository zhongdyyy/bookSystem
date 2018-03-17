package com.itjob.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
	private String dbURL="jdbc:mysql://localhost:3306/student";
	
	private String dbUserName="root";
	
	private String jdbcName="com.mysql.jdbc.Driver";
	
	private String password = "root";
	
	public Connection getCon() throws ClassNotFoundException, SQLException{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbURL, dbUserName, password);
		return con;
	}
	
	public void closeCon(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}
	
	
	
//	public static void main(String[] args) {
//		DButil dbutil = new DButil();
//		try {
//			dbutil.getCon();
//			System.out.println("数据库链接成功");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}
