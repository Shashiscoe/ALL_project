package package1;

public class StringSymbil {
	public static void main(String[] args) {
		String x = "123-12321-132-345-#2_45_56_3_65_76_4_4_6676_4_5$";
		String str=x.substring((x.indexOf('#')+1),x.indexOf('$'));
		System.out.println(str);
		String arr[]=str.split("_");
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			int x1=Integer.parseInt(arr[i]);
			//System.out.println(x1);
			for(int j=2;j<=x1/2;++j)
			{
				if(x1%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.println(x1);
				count++;
			}
		}
		System.out.println("Number of prime number is:"+count);

	}
}
