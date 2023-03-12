package OOPs_Concept;

public class revString 
{
	public static void main(String[] args) 
	{
		String org="Neelama";
		String rev="";
	for(int i=6;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
		System.out.println(rev);
	}

}
