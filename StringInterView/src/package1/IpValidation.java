package package1;

public class IpValidation {

	public static void main(String[] args) {
		String ip="155.2.120.122";
		String arr[]=ip.split("\\.");
		
		String status="Valid";
		if(arr.length!=4)
		{
			System.out.println("Invalid");
		}
		else
		{

			for(String x:arr)
			{
				//System.out.println(x);
				int y=Integer.parseInt(x);
				
					
			if((y>255 || y<0))
					status="Invalid";
			}
			System.out.println(status);
		}
	}
}
