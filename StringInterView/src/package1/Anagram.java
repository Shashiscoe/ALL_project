package package1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String input1=scn.next();
		String input2=scn.next();
		char arr1[]=input1.toCharArray();
		char arr2[]=input2.toCharArray();
		Arrays.sort(arr1);
		String str1="";
		String str2="";

		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			str1+=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			str2+=arr2[i];
		}
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		if(str1.equals(str2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	

}
