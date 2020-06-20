package package1;

public class RandomNumber {
	long PreviousNumber;
	int NumberLength = 4;
	
	public RandomNumber()
	{
	
		
		PreviousNumber = System.currentTimeMillis() % Integer.MAX_VALUE;
		
	}

	
	
	public RandomNumber(int seed)
	{
		PreviousNumber = seed;
		String number = Long.toString(PreviousNumber);
		NumberLength = number.length();
	}



	public int generate() {
		
		PreviousNumber++;
		PreviousNumber = PreviousNumber * PreviousNumber;
		String number = Long.toString(PreviousNumber);
		int a = (number.length()/2) - (NumberLength/2);
		StringBuilder NewNumber = new StringBuilder();
		for (int i = a; i < a+NumberLength && i >= 0;i++)
		{
			NewNumber.append(number.charAt(i));
		}
		PreviousNumber = Long.parseLong(NewNumber.toString());
		return (int) PreviousNumber;
	}
	
}















