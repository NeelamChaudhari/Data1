package Logic_Prog;

import java.util.Scanner;

public class pallindrom
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String org=scan.nextLine();
	String rev="";
	  
	  for(int i=org.length()-1;i>=0;i--)
	  {
		rev=rev+org.charAt(i);
	  }
		 // System.out.print(rev);
	   if(org.equals(rev))
	  {
		  System.out.println("Pallindrom");
	  }
	  else
	  {
		  System.out.println("Not");
	  }
}
  
}
