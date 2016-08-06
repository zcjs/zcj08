package zcj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInfoBean {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public UserInfoBean(String name) {
	super();
	this.name = name;
}

public UserInfoBean() {
	super();
}
public  boolean isExist(String username)
{
	boolean isExist = false;
	String className = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/sakila";
	String userName = "root";
	String userPass = "1234";
	try {
		
		Class.forName(className);
		Connection conn = null;
		conn = DriverManager.getConnection(url, userName, userPass);
		Statement stmt = conn.createStatement();
		String sql = "select * from customer where first_name= '" + username + "'";
		ResultSet rs = null;
		rs = stmt.executeQuery(sql);
		if(null == rs)
		{
			System.out.println("处理出现异常");
		}
		else{
			if(rs.next())
			{
				isExist = true;
			}
			else
			{
				isExist = false;
			}
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return isExist;
}
}
