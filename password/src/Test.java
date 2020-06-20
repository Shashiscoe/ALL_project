public class Test {	
	public static long react(int length ,int bredth)
	{
		while(length>0 && bredth>0)
		{			
			if(length>bredth)
			{
				length=length-bredth;
				System.out.println("Squere of dimention "+bredth +" "+bredth);	
			}else
			{
				bredth=bredth-length;
				System.out.println("Squere of dimention "+length +" "+length);
			}
		}
		return 0; 
	}
	public static void main(String[] args) {
		Test.react(32,17);
	}
}