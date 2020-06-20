package MileStone1;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]={'a','b','c'};
		String str=arr.toString();
		String str1=String.valueOf(arr);
		System.out.println(str);
		System.out.println(str1);
		System.out.println("Ascii Value to corrosponding value");
		int array[]=new int[250];
		int count=1;
		for(int i=0;i<250;i++)
		{
			array[i]=count;
			count++;
		}
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(array[i]+" is: "+(char) array[i]);
		}
		
	}

}
