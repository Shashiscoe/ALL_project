package package2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfwords {

	public static void main(String[] args) {
		int count=0;
		StringTokenizer st=new StringTokenizer("sinhgad college of enginnering");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("Number of word is :  "+count);
	}

}
