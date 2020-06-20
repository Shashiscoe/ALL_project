package package3;
/*
1 1 1 1 2 
2 2 2 2 3 
3 3 3 3 4 
4 4 4 4 5 
5 5 5 5 6 */
public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(j==5){
					System.out.print((i+1+" "));
				}else{
					
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		
		}

	}

}
