package Logic_Prog;

public class revstring 
{  
	public static void main(String[] args) 
	{
		String org="Neelam";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
		  String charval=rev+org.charAt(i);
			
		
		System.out.print(charval);
		}
		System.out.println();
	}

}
