package package1;

import java.io.*;
import java.util.Scanner;
public class Str
{
public static void main(String arg[])throws Exception
{
String res="";
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner scan=new Scanner(System.in);
System.out.println("Enter the string:");
String a=scan.next();
while(a.length()>0)
{
	int c=0;
	for(int j=0;j<a.length();j++)
	{
		if(a.charAt(0)==a.charAt(j))
		c=c+1;
	}
	res=res+a.charAt(0)+"="+c+"\n";
	String k[]=a.split(a.charAt(0)+"");
	a=new String("");
	for(int i=0;i<k.length;i++)
		a=a+k[i];
}
System.out.println(res);
}
}
