package com.itjob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itjob.model.User;

public class UserLoginDao {
	
	public User userLogin(Connection con, User user) throws SQLException{
		User resultUser = null;
		String sql = "select * from user where username =? and password =?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,user.getUsername());
		pst.setString(2, user.getPassword());
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			resultUser = new User();
			resultUser.setUsername(rs.getString("username"));
			resultUser.setPassword(rs.getString("password"));
		}
		
		return resultUser;
	}

}
