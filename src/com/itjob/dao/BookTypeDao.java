package com.itjob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itjob.model.BookType;

public class BookTypeDao {
	
	
	public int addBookType(Connection con,BookType bookType) throws SQLException{
		String sql = "insert into booktype values (?,?,'')";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(2, bookType.getBookTypeName());
		pstmt.setString(1, bookType.getBookTypeDesc());
		int result = pstmt.executeUpdate();
		return result;
		
	}

}
