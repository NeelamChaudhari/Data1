package Logic_Prog;

public class fibbonacci 
{
public static void main(String[] args) 
{
	int a=1;
	int b=0;
	int c;
	
	for(int i=0;i<5;i++)
	{
		c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
}
}
