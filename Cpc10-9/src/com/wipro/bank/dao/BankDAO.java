package com.wipro.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.util.DBUtil;

public class BankDAO {

	public boolean validateAccount(String accountNumber) {
		boolean validAccountStatus = false;
		Connection con = DBUtil.getDBConnection();
		try {
			String str = "SELECT Account_Number FROM ACCOUNT_TBL where Account_Number=?";
			PreparedStatement ps = con.prepareStatement(str);
			ps.setString(1, accountNumber);
			ResultSet rs = ps.executeQuery();
			if (rs != null) {
				rs.next();
				if(rs.getString(1).equalsIgnoreCase(accountNumber))
					validAccountStatus = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return validAccountStatus;
	}

	public float findBalance(String accountNumber) {
		float balance = -1;
		Connection con=DBUtil.getDBConnection();
		try
			{
				String str="select Balance from ACCOUNT_TBL where Account_Number=?";
				PreparedStatement ps=con.prepareStatement(str);
				ps.setString(1, accountNumber);
				ResultSet rs=ps.executeQuery();
				if(rs!= null)
				{
					rs.next();
					balance=rs.getFloat(1);	
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return balance;
	}

	public boolean updateBalance(String accountNumber, float newBalance) {
		boolean status = false;
		PreparedStatement ps;
		Connection con = DBUtil.getDBConnection();
		try {
			String str = "UPDATE ACCOUNT_TBL SET Balance=?,"
					+ "where Account_Number=?";
			ps = con.prepareStatement(str);
			ps.setFloat(1, newBalance);
			ps.setString(2, accountNumber);
			int i=ps.executeUpdate();
			if(i  != 0)
			{
				status=true;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public boolean transferMoney(TransferBean transferBean) {
		boolean transferStatus = false;
		int transactionId=generateSequenceNumber();
		java.sql.Date date = new java.sql.Date( new java.util.Date().getTime());
		Connection con = DBUtil.getDBConnection();
		PreparedStatement ps;
		try {
			ps = con
					.prepareStatement("insert into TRANSFER_TBL values(?,?,?,?,?)");
			ps.setInt(1,transactionId);
			ps.setString(2, transferBean.getFromAccountNumber());
			ps.setString(3, transferBean.getToAccountNumber());
			ps.setDate(4, date);
			ps.setFloat(5, transferBean.getAmount());
			int i=ps.executeUpdate();
			if(i != 0)
			{
				transferStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return transferStatus;
	}

	public int generateSequenceNumber() {
		int seq = 0;
		Connection c = DBUtil.getDBConnection();
		
		try {
			PreparedStatement ps = c
					.prepareStatement("SELECT transactionId_seq.nextval from dual");
			ResultSet rs = ps.executeQuery();

			while(rs != null) {
				rs.next();
				seq = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq;

	}

}
