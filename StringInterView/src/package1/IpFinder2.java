package package1;

public class IpFinder2 {

	public static void main(String[] args) {
		String input = "123.45.67.89:8089:orcld" ;
		//Output = <{IpAddr=123456789},{port=8080},{server=orcl}>
		String arr[]=input.split(":");
		char arr1[]=arr[0].toCharArray();
		String ip="";
		for(char x:arr1)
		{
			if(x=='.')
			{
				;
			}
			else
			{
				ip+=x;
			}
		}
		System.out.println("<{IpAddr="+ip+"},{port="+arr[1]+"},{server="+arr[2]+"}>");
		
	}

}
