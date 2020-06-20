package package1;

public class RandomNumber {
	long previousNumber;
	int numberlength;
	public RandomNumber(int seed) {
	previousNumber=seed;
	String str=Long.toString(previousNumber);
	numberlength=str.length();
	}
	public int generete() {
		previousNumber++;
		previousNumber=previousNumber*previousNumber;
		String str1=Long.toString(previousNumber);
		int a=(str1.length()/2)-numberlength/2;
		StringBuilder number=new StringBuilder();
		for(int i=a; i>=0 && i<a+numberlength;i++)
		{
			number.append(str1.charAt(i));
		}
		return (int)previousNumber;
	}

}
