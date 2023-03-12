package Logic_Prog;

import java.util.Scanner;

public class armstrong 
{
    public static void main(String[] args)
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int s=scan.nextInt();
    	//int org=153;
    	int rev=0;
    	for(int i=s;i>0;i=i/10)
    	{
    		int rem=i%10;
    		rev=rev+(rem*rem*rem);
    	}
    	System.out.println(rev);
    	if(s==rev)
    	{
    		System.out.println("Armstrong");
    	}
    	else
    	{
    		System.out.println("Not Armstrong");
    	}
		
	}
}
