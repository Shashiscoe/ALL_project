package com;

import java.util.ArrayList;

public class AppartmentDemo {
	
	String getFlatOwnerofMinElectricityBill(Appartment []obj)
	{
		ArrayList<Double> arr=new ArrayList<>();
		for(Appartment apt:obj)
		{
			arr.add(apt.getElectricityBill());
		}
		arr.sort(null);
	
		double min=arr.get(0);
		for(Appartment apt:obj)
		{
			
			if(apt.getElectricityBill()==min)
			{
				return apt.getFlatOwner();
			}
		}
		return "Not found";
		
	}
	
	double getSecondMinWaterBill(Appartment []obj)
	{
		ArrayList<Double> arr=new ArrayList<>();
		
		for(Appartment apt:obj)
		{
			arr.add(apt.getWaterBill());
		}
		arr.sort(null);
	
		double secondMin=arr.get(1);
		return secondMin;
	}

	public static void main(String[] args) {
		
		
		Appartment a1=new Appartment(101, "Ram", 400, 660);
		Appartment a2=new Appartment(102, "Krish", 420, 650);
		Appartment a3=new Appartment(103, "Vijay", 430, 630);
		Appartment a4=new Appartment(104, "Murthy", 480, 690);
		Appartment a5=new Appartment(105, "Jhon", 460, 680);
		
		Appartment []apts={a1,a2,a3,a4,a5};		
		
		AppartmentDemo demo= new AppartmentDemo();
		
		double getSecondminwaterBill=demo.getSecondMinWaterBill(apts);
		System.out.println("Second Min water  Bill :"+getSecondminwaterBill);
		System.out.println("Flat owner with min Electricity Bill :"+demo.getFlatOwnerofMinElectricityBill(apts));
				
	}

}
