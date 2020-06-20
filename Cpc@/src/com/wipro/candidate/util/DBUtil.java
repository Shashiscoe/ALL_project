package com.wipro.candidate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
public static Connection getDBConn() throws ClassNotFoundException
{
	Connection con=null;
	try
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");  
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B7561320027567","B7561320027567");
		System.out.println("Connected :");
		
	}
	catch(SQLException e)
	{
	}
	return con;

}

}
