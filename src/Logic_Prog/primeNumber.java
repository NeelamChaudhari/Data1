package Logic_Prog;

import java.util.Scanner;

public class primeNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int s=scan.nextInt();
		int count = 0;
		for(int i=2;i<s;i++)
		{	
		if(s%i == 0)
		{
			count++;
			break;
		}
		}
		if(count==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
	
}
