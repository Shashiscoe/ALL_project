package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection = null;

	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B7561320027567","B7561320027567");
		} catch (ClassNotFoundException ce) {
			System.out.println("Class incorrect");
			ce.printStackTrace();
		}
		 catch (SQLException se) {
				System.out.println("");
				se.printStackTrace();
			}
		return connection;
	}
}
