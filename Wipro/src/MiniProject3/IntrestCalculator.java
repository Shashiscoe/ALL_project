package MiniProject3;

import java.util.Scanner;

abstract class Account {
	double intrestRate;	
	double amount;
	abstract double CalculateIntrest();
}

class FDAccount extends Account 
{
	 double intrestRate;
	 double amount;
	 int noOfDays;
	 int ageOfAcolder;
	 
	 double CalculateIntrest()
	 {
		 
		 if(ageOfAcolder<60 && ageOfAcolder>1 && amount<10000000)
		 {
			 if(noOfDays >=7 && noOfDays<=14)
			 {
				 intrestRate=(amount*4.5)/100;
			 }
			 else if(noOfDays >=15 && noOfDays<=29)
			 {
				 intrestRate=(amount*4.75)/100;
			 }
			 else if(noOfDays >=30 && noOfDays<=45)
			 {
				 intrestRate=(amount*5.5)/100;
			 }
			 else if(noOfDays >=46 && noOfDays<=60)
			 {
				 intrestRate=amount*7/100;
			 }
			 else if(noOfDays >=61 && noOfDays<=184)
			 {
				 intrestRate=amount*7.5/100;
			 }
			 else 
			 {
				 intrestRate=amount*8.0/100;
			 }
		 }
		 else
		 {
			 if(noOfDays >=7 && noOfDays<=14)
			 {
				 intrestRate=amount*5.0/100;
			 }
			 else if(noOfDays >=15 && noOfDays<=29)
			 {
				 intrestRate=amount*5.25/100;
			 }
			 else if(noOfDays >=30 && noOfDays<=45)
			 {
				 intrestRate=amount*6.0/100;
			 }
			 else if(noOfDays >=46 && noOfDays<=60)
			 {
				 intrestRate=amount*7.5/100;
			 }
			 else if(noOfDays >=61 && noOfDays<=184)
			 {
				 intrestRate=amount*8.0/100;
			 }
			 else 
			 {
				 intrestRate=amount*8.5/100;
			 }
			 
		 }
		 if(amount<10000000)
		 {
			 if(noOfDays >=7 && noOfDays<=14)
			 {
				 intrestRate=amount*6.50/100;
			 }
			 else if(noOfDays >=15 && noOfDays<=29)
			 {
				 intrestRate=amount*6.75/100;
			 }
			 else if(noOfDays >=30 && noOfDays<=45)
			 {
				 intrestRate=amount*6.75/100;
			 }
			 else if(noOfDays >=46 && noOfDays<=60)
			 {
				 intrestRate=amount*8/100;
			 }
			 else if(noOfDays >=61 && noOfDays<=184)
			 {
				 intrestRate=amount*8.5/100;
			 }
			 else 
			 {
				 intrestRate=amount*10.0/100;
			 }
			 
		 }
		 
		 return intrestRate;
	 }
	 
}
class SBAccount extends Account
{
	double intrestRate;
	 double amount;
	
	String category;
	double CalculateIntrest() {
		if(category.equalsIgnoreCase("normal"))
		{
			intrestRate=amount*4.0/100;
		}
		else
		{
			intrestRate=amount*6.0/100;

		}
		
		return intrestRate;
	}
	
}
class RDAccount extends Account
{
	double intrestRate;
	 double amount;
	 int noOfMonth;
	 int age;
	 double CalculateIntrest()
	 {
		 if(age<60)
		 {
			 if(noOfMonth >=1 && noOfMonth<=6)
			 {
				 intrestRate=amount*7.50/100;
			 }else if(noOfMonth >=7 && noOfMonth<=9)
			 {
				 intrestRate=amount*7.75/100;
			 }
			 else if(noOfMonth >=10 && noOfMonth<=12)
			 {
				 intrestRate=amount*8.0/100;
			 }
			 else if(noOfMonth >=13 && noOfMonth<=15)
			 {
				 intrestRate=amount*8.25/100;
				 
			 }
			 else if(noOfMonth >=16 && noOfMonth<=18)
			 {
				 intrestRate=amount*8.50/100;
			 }
			 else if(noOfMonth >=16 && noOfMonth<=18)
			 {
				 intrestRate=amount*8.75/100;
			 }
			 else
			 {
				 System.out.println("Enter correct age:::");
			 }
			 
		 }else
		 {
			 if(noOfMonth >=1 && noOfMonth<=6)
			 {
				 intrestRate=amount*8.0/100;
			 }else if(noOfMonth >=7 && noOfMonth<=9)
			 {
				 intrestRate=amount*8.25/100;
			 }
			 else if(noOfMonth >=10 && noOfMonth<=12)
			 {
				 intrestRate=amount*8.50/100;
			 }
			 else if(noOfMonth >=13 && noOfMonth<=15)
			 {
				 intrestRate=amount*8.75/100;
				 
			 }
			 else if(noOfMonth >=16 && noOfMonth<=18)
			 {
				 intrestRate=amount*9.0/100;
			 }
			 else if(noOfMonth >=16 && noOfMonth<=18)
			 {
				 intrestRate=amount*9.25/100;
			 }
			 else
			 {
				 System.out.println("Enter correct age:::");
			 }
			  
		 }
		 return intrestRate;
	 }
	 
}
public class IntrestCalculator{
	public static void main(String[] args) {
		System.out.println("");
		int choice;
		
		do
		{
			System.out.println("MENU----");
			
			System.out.println("\n1.Intrest Calculator -SB :\n2. Intrest Calculator -FD \n3. Intrest Calculator -RD\n4.Exit ");
			System.out.println("Enter your choice :");
			Scanner scan=new Scanner(System.in);
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter SB amount");
				SBAccount fs=new SBAccount();
				fs.amount=scan.nextDouble();
				if(fs.amount<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct amount");
					 System.out.println();
					 break;
				 }
				
				System.out.println("Enter category(Normal or NRI)");
				fs.category=scan.next();
				
				System.out.print("Intrest gain is:  ");
				System.out.print(fs.CalculateIntrest());
				System.out.println();
				
				
				break;
			case 2:
				System.out.println("Enter FD amount");
				FDAccount f=new FDAccount();
				f.amount=scan.nextDouble();
				if(f.amount<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct amount");
					 System.out.println();
					 break;
				 }
				System.out.println("Enter number of days: ");
				f.noOfDays=scan.nextInt();
				if(f.noOfDays<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct input(noOfDays>0)");
					 System.out.println();
					 break;
				 }
				System.out.println("Enter Your Age:");
				f.ageOfAcolder=scan.nextInt();
				if(f.ageOfAcolder<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct input(Age must Greater ZERO)");
					 System.out.println();
					 break;
				 }
				System.out.print("Intrest gain is:  ");
				System.out.print(f.CalculateIntrest());
				System.out.println();
				
				break;
			case 3:
				System.out.println("Enter RD amount");
				RDAccount fr=new RDAccount();
				fr.amount=scan.nextDouble();
				if(fr.amount<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct amount");
					 System.out.println();
					 break;
				 }
				System.out.println("Enter number of months: ");
				fr.noOfMonth=scan.nextInt();
				if(fr.noOfMonth<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct input(noOMonths>0)");
					 System.out.println();
					 break;
				 }
				
				System.out.println("Enter Your Age:");
				fr.age=scan.nextInt();
				if(fr.age<0 )
				 {
					 System.out.println("Warning!!!!!......Please enter Correct input(Age must be Greater ZERO)");
					 System.out.println();
					 break;
				 }
				
				System.out.print("Intrest gain is:  ");
				System.out.print(fr.CalculateIntrest());
				System.out.println();
				
				break;
			default:
				System.out.println("..............Enter Correct Input......");	
					
				
			}
		}while(choice!=4);
	}
	
}