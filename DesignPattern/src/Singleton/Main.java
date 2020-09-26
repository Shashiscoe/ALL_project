package Singleton;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;

import javax.jws.Oneway;

import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
       
    	
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        Map<String,String> retVal1 = new HashMap<String,String>();
        int len=array.size();
        for(int i=0;i<len;i++)
        {
        	String arr[]=array.get(i).split(",");
        	String dep=arr[2].trim();
        	String sal=arr[3].trim();
        	if(retVal1!=null && retVal1.get(dep)!=null)
        	{
        		int fromMap=Integer.parseInt(retVal1.get(dep).trim());
        		int current=Integer.parseInt(sal.trim());
        		if(current>fromMap)
        		{
        			retVal1.put(dep, ""+current);
        			retVal.put(dep, Integer.parseInt(arr[0].trim()));
        		}
        	}
        	else
        	{	  retVal1.put(dep.trim(), sal.trim());	
        		  retVal.put(dep, Integer.parseInt(arr[0].trim()));
        	}
          }
        System.out.println(retVal);
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
