package com.wipro.candidate.service;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.rmi.CORBA.StubDelegate;

import com.wipro.candidate.bean.CandidateBean;
import com.wipro.candidate.dao.CandidateDAO;
import com.wipro.candidate.util.WrongDataException;

public class CandidateMain {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public String addCandidate(CandidateBean studBean) {
		String result = "";
		// write code here
		if (studBean == null) {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else if (studBean.getName().equals("")) {

			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else if (studBean.getName().length() < 2) {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else if (studBean.getM1() < 0 || studBean.getM1() > 100) {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else if (studBean.getM2() < 0 || studBean.getM2() > 100) {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else if (studBean.getM3() < 0 || studBean.getM3() > 100) {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = e.toString();
			}
		} else {
			CandidateDAO c = new CandidateDAO();
		
				studBean.setId(c.generateCandidateId(studBean.getName()));

				double total = studBean.getM1() + studBean.getM2() + studBean.getM3();

				if (total >= 240) {
					studBean.setGrade("Distinction");
					studBean.setResult("PASS");
				} else if (total >= 180 && total < 240) {
					studBean.setGrade("First Class");
					studBean.setResult("PASS");
				} else if (total >= 150 && total < 180) {
					studBean.setGrade("Second Class");
					studBean.setResult("PASS");
				} else if (total >= 105 && total < 150) {
					studBean.setGrade("Third Class");
					studBean.setResult("PASS");
				} else if (total < 105) {
					studBean.setGrade("No Grade");
					studBean.setResult("FAIL");
				}

				c.addCandidate(studBean);
				result = studBean.getId() + ":" + studBean.getResult();
		}
		return result;

	}

	public ArrayList<CandidateBean> displayAll(String criteria) {
		ArrayList<CandidateBean> list = null;
		if(criteria.equals("PASS") || criteria.equals("FAIL") || criteria.equals("ALL"))
		{
			list = new CandidateDAO().getByResult(criteria);
		}
			
		else {
			try {
				throw new WrongDataException();
			} catch (WrongDataException e) {
				// TODO Auto-generated catch block
				list = null;
			}
			
		}
		// write code here
		return list;
	}

	public static void main(String[] args) {

		CandidateMain cm = new CandidateMain();
		CandidateDAO cd = new CandidateDAO();
		

	}

}
