package com.wipro.candidate.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.candidate.bean.CandidateBean;
import com.wipro.candidate.util.DBUtil;


public class CandidateDAO {
	public String addCandidate(CandidateBean studentBean)
	{
		int rs;
			String status="";
			try {
				Connection con=DBUtil.getDBConn();
				String str= "insert into CANDIDATE_TBL values(?,?,?,?,?,?,?)";
				PreparedStatement stmt=con.prepareStatement(str);
				stmt.setString(1,studentBean.getId());
				stmt.setString(2, studentBean.getName());
				stmt.setInt(3, studentBean.getM1());
				stmt.setInt(4, studentBean.getM2());
				stmt.setInt(5, studentBean.getM3());
				stmt.setString(6, studentBean.getResult());
				stmt.setString(7, studentBean.getGrade());
				rs=stmt.executeUpdate();
				if(rs==1)
				{
					status="SUCCESS";
				}
				else
				{
					status="FAIL";
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				status = "FAIL";
			}
			
			return status;
	}
	public ArrayList<CandidateBean> getByResult(String criteria)
	{
	
		ArrayList<CandidateBean> list=new ArrayList<CandidateBean>();
		Connection con;
		if(criteria.equalsIgnoreCase("PASS"))
		{
			try {
				con=DBUtil.getDBConn();
				PreparedStatement stmt=con.prepareStatement("Select *from CANDIDATE_TBL where Result='PASS'");
				ResultSet rs=stmt.executeQuery();
				
				while(rs.next())
				{
					CandidateBean cb=new CandidateBean();
					cb.setId(rs.getString(1));	
					cb.setName(rs.getString(2));
					cb.setM1(rs.getInt(3));
					cb.setM2(rs.getInt(4));
					cb.setM3(rs.getInt(5));
					cb.setResult(rs.getString(6));
					cb.setGrade(rs.getString(7));
					list.add(cb);
					
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		else if(criteria.equalsIgnoreCase("FAIL"))
		{
			try{
			con=DBUtil.getDBConn();
			PreparedStatement stmt=con.prepareStatement("Select *from CANDIDATE_TBL where Result='FAIL'");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				CandidateBean cb=new CandidateBean();
				cb.setId(rs.getString(1));	
				cb.setName(rs.getString(2));
				cb.setM1(rs.getInt(3));
				cb.setM2(rs.getInt(4));
				cb.setM3(rs.getInt(5));
				cb.setResult(rs.getString(6));
				cb.setGrade(rs.getString(7));
				list.add(cb);
				
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		}
		else
		{
			try{
				con=DBUtil.getDBConn();
				PreparedStatement stmt=con.prepareStatement("Select *from CANDIDATE_TBL");
				ResultSet rs=stmt.executeQuery();
				
				while(rs.next())
				{
					CandidateBean cb=new CandidateBean();
					cb.setId(rs.getString(1));	
					cb.setName(rs.getString(2));
					cb.setM1(rs.getInt(3));
					cb.setM2(rs.getInt(4));
					cb.setM3(rs.getInt(5));
					cb.setResult(rs.getString(6));
					cb.setGrade(rs.getString(7));
					list.add(cb);
					
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		//write code here
		return list;
	}
	public String generateCandidateId (String name)
	{
		Connection con;
		String id="";
		try
		{
			id=id+name.substring(0,2);
			con=DBUtil.getDBConn();
			PreparedStatement stmt=con.prepareStatement("Select CANDID_SEQ.nextval from dual");
			ResultSet rs=stmt.executeQuery();
			if(rs!=null)
			{
				id+=rs.next();
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		//write code here
		return id;
	}
}
