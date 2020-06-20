
public class Word {
	public static void main(String[] args) {
	
		String str="kagbjiuhaidnncgu";
		char arr[]=str.toCharArray();
		int len=arr.length;
		int countVowel=0;
		int countCons=0;
		
		for(int i=0;i<=len-1;i++){
			
			if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'||arr[i]=='u')
			{
			System.out.println("it is vowel");
			countVowel++;
			}else{
				
				
				System.out.println("it is consonant");
				
			}
			
		countCons=len-countVowel;
		System.out.println(" Vowel:" +countVowel);
		System.out.println("Cons :" +countCons);
			
		}
	}

}
