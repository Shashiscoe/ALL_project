package package1;

public class TestMate {

	void test(String str)
	{
		String st[]=str.split(" ");
		String sum1="";
		for(String x:st)
		{
			int sum=0;
			int sum2=0;
	
			int len=x.length();
			x=x.toUpperCase();
			
			char []ch=x.toCharArray();
			//System.out.println(x);
			for(int i=0,j=len-1;i<=j;i++,j--)
			{
				if(i!=j)
				{
					sum=ch[i]-ch[j];
//					System.out.println("before "+sum);
					if(sum<0)
					{
						sum=sum*(-1);
					}
					
				}
			else
				{
					sum=ch[i]-64;
					if(sum<0)
					{
						sum=sum*(-1);
					}
//					
				}
				
				sum2=sum2+sum;
				
			}
		
			sum1=sum1+sum2;
			
		}
		System.out.println(sum1);
		
	}
	public static void main(String[] args) {
		// 
		TestMate t =new TestMate();
		t.test("world wide web");

	}

}
