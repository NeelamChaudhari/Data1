package Logic_Prog;

public class ovals 
{
	public static void main(String[] args) 
	{
		String org="HowAreYou";
		int vcount=0;
		int ccount=0;
		String s1=org.toLowerCase();
		for(int i=0;i<=s1.length()-1;i++)
		{
		if(s1.charAt(i)=='a'  ||s1.charAt(i)=='e' || s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		{
			vcount++;
		}
		else if(s1.charAt(i)>= 'a' && s1.charAt(i) <= 'z')
		{
			ccount++;
		}
		
	}
		System.out.println("Vowels "+vcount);
		System.out.println("consonant "+ccount);
	
}}


