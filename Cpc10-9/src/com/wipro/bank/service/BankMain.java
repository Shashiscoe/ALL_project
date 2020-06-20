package com.wipro.bank.service;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.dao.BankDAO;
import com.wipro.bank.util.DBUtil;
import com.wipro.bank.util.InsufficientFundsException;

public class BankMain {
	public static void main(String[] args) {
	DBUtil.getDBConnection();
	}

	public String checkBalance(String accountNumber) {
	
	BankDAO bdao=new BankDAO();
	boolean isValid=bdao.validateAccount(accountNumber);
	if(isValid)
	{
		float balance=bdao.findBalance(accountNumber);
		return ("BALANCE IS:"+balance);
	}
	else
	{
		return "ACCOUNT NUMBER INVALID";
	}
	}

	public String transfer(TransferBean transferBean) {
		String status = "";
	   BankDAO bdao=new BankDAO();
	if(transferBean==null)
	   {
		   return "INVALID";
	   }
	   else if(!bdao.validateAccount(transferBean.getFromAccountNumber())|| !bdao.validateAccount(transferBean.getToAccountNumber()))
	   {
		   return "INVALID ACCOUNT";
	   }
	   else if(!(bdao.findBalance(transferBean.getFromAccountNumber())>transferBean.getAmount()))
	   {
		   try {
			throw new InsufficientFundsException();
		} catch (InsufficientFundsException e) {
			status=e.toString();
		}
	   }
	   else
	   {
		   bdao.updateBalance(transferBean.getFromAccountNumber(),bdao.findBalance(transferBean.getFromAccountNumber())-transferBean.getAmount());
		   bdao.updateBalance(transferBean.getToAccountNumber(), bdao.findBalance(transferBean.getToAccountNumber()));
		   if(bdao.transferMoney(transferBean))
		   status= "SUCCESS";
	   }
	return status;
	}
}
