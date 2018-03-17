package com.itjob.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itjob.model.BookType;
import com.itjob.util.StringUtil;

public class BookTypeManageDao {
	
	public ResultSet findBookType(Connection con,BookType bookType) throws SQLException{
		StringBuffer sql = new StringBuffer("select * from booktype");
		if(StringUtil.isNotEmpty(bookType.getBookTypeName())){
			sql.append(" and booktypename like '%"+bookType.getBookTypeName()+"%'");
		}
		PreparedStatement pst =  con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		return pst.executeQuery();
	}
	
}
