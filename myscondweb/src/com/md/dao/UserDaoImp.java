package com.md.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.md.entity.User;
import com.md.jdbc.util.JDBCUtils;

public class UserDaoImp implements UserDao {

	@Override
	public User getUserByUserNameAndPassword(String name, String password) throws Exception {
		User user = null;
		Connection conn = JDBCUtils.getConn();
		String sql="select* from t_emp where name=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
			
		}
		JDBCUtils.close(rs,ps,conn);
		return user;
	}

}
