package package1;

import java.util.TreeSet;

public class StringFind {
	public static void main(String[] args) {
		String x = "The group wilp-academy only accepts messages from people on"
				+ " its allowed senders list, and your email address isn't on the list";
		String arr[]=x.split(" ");
		System.out.println("Number of word is :"+arr.length);
		System.out.println("Number of space:"+(arr.length-1));
		x.toLowerCase();
		String vowel="aeiou";
		int v=0;
		int hiphen=0;
		TreeSet<Character> t=new TreeSet<>();
		for (int i = 0; i < x.length(); i++) {
			if(vowel.contains(""+x.charAt(i)))
			{
				v++;
			}
			if(x.charAt(i)=='-')
			{
				hiphen++;
			}
			t.add(x.charAt(i));			
		}
		System.out.println("Number of vowel is :"+v);
		System.out.println("number of hyphon is:"+hiphen);
		System.out.println("UNIQUE characters available in this word is "+t.size());
	}
}
