import java.io.*;
import  java.util.*;

import javax.jws.soap.SOAPBinding.Use;

// Read only region start
public class UserMainCode
{

	public int countPrimesInRange(int input1,int input2){
		// Read only region end
		
        int count=0;
	for(int i=input1;i<input2;i++)
	{
		int flag=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			count++;
			System.out.print(i+" ");
		}
		
		
	}
    return count;
	}
	public static void main(String[] args) {
		UserMainCode t=new UserMainCode();
		int c=t.countPrimesInRange(1,100);
		System.out.println();
		System.out.println("number of prime number is  "+c);
	}
}