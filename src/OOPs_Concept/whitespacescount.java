package OOPs_Concept;

public class whitespacescount
{
	public static void main(String[] args) 
	{
	   	String org="N ee l am";
	   int count=0;
	   for(int i=0;i<=org.length()-1;i++)
	   {
		   char charvalue=org.charAt(i);
		   if(charvalue== ' ')
		   {
			   count++;
			   
			   
		   }
	   }
		   System.out.println(count);
	   }
	   	
	   	
	}


