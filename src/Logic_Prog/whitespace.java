package Logic_Prog;

public class whitespace 
{
	public static void main(String[] args)
	{
		String org="Nee  l a m";
		  int count=0;
		for(int i=0;i<=org.length()-1;i++)
		{
			char charval=org.charAt(i);
			if(charval==' ')
			{
				count++;
				
			}
			
		}
		
		System.out.println(count);
	}

}
