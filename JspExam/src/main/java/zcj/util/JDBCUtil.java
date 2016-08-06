package zcj.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCUtil {
	 private static Properties prop = new Properties();
	    private JDBCUtil(){}
	    
	    //将驱动在程序启动的时候，就加载并注册
	    static
	    {
	        try
	        {
	            //1- src目录中，编译器将.java文件编译成.class文件，放到bin目录中。如果是配置文件，则原样拷贝一份到bin目录中
	            //2- 使用类加载器的形式读取，默认的路径是bin目录。
	            prop.load(JDBCUtil.class.getClassLoader().getResourceAsStream("datasource.properties"));
	        }
	        catch (FileNotFoundException e1)
	        {
	            e1.printStackTrace();
	        }
	        catch (IOException e1)
	        {
	            e1.printStackTrace();
	        }
	        
	        try
	        {
	            Class.forName(prop.getProperty("driver"));//得到驱动
	        }
	        catch (ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    public static Connection getConn() throws SQLException
	    {
	        String pass=prop.getProperty("password");
	        pass=pass.equals("null")?null:pass;
	        return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), pass);
	    }
	    
	    public static void close( ResultSet rs,PreparedStatement ps,Connection con)
	    {
	        if(rs != null)
	        {
	            try
	            {
	                rs.close();
	                rs = null;
	            }
	            catch (SQLException e)
	            {
	                e.printStackTrace();
	            }
	        }
	        
	        if(ps != null)
	        {
	            try
	            {
	                ps.close();
	                ps = null;
	            }
	            catch (SQLException e)
	            {
	                e.printStackTrace();
	            }
	        }
	        
	        if(con != null)
	        {
	            try
	            {
	                con.close();
	                con = null;
	            }
	            catch (SQLException e)
	            {
	                e.printStackTrace();
	            }
	        }
	    }
}
