package OOPs_Concept;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) {
		
	int rev=0;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number");
int no=	scan.nextInt();
for (int i=no;i>0;i=i/10)
{
	int rem = i%10;
	rev=rev+(rem*rem*rem);
	

	}
System.out.println(rev);
	
	if(no==rev)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not");
	}
	

}
}