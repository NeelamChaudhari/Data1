package OOPs_Concept;

import java.util.Arrays;

public class Array
{
	public static void main(String[] args)
	{
		int arr[][]=new int[2][3];
		arr[0][0]=100;
		arr[0][1]=500;
		arr[0][2]=200;
		arr[1][0]=700;
		arr[1][1]=520;
		arr[1][2]=522;
		//Arrays.sort(arr);
		
		for(int i=0;i<=1;i++)
		{
			for(int a=0;a<=2;a++)
			{
			System.out.println(arr[i][a]);
		     }
	     }

	}

}
