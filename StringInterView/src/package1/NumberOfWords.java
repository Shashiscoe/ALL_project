package package1;
import java.util.StringTokenizer;
public class NumberOfWords {

	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Honesty is best policy");
		int count=0;
		while(st.hasMoreTokens())
		{
			count++;
			System.out.println(st.nextToken());
		}
		System.out.println("Number of word is..."+count);
	}
}
