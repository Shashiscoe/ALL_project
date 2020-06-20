package package3;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="honesty is the best policy";
		String arr[]=str.split(" ");
		System.out.println("Number of word  :"+arr.length);
		int len=arr.length;
		String str1="Shweta";
		String str2="Salve";
		System.out.println(str1+" "+str2);
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.charAt(2));
		char[] arr1=str1.toCharArray();
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
