package Logic_Prog;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayCompare 
{
  public static void main(String[] args)
  {
	  int a1[]=new int[2];
	  a1[0]=100;
	  a1[1]=200;
	  System.out.println(a1[0]==a1[1]);
	  System.out.println("*********************************************");
	  int a11[]=new int[] {10,20,30};
	  
	  int a2[]=new int[] {10,20,30};
	  boolean a3=  Arrays.equals(a11, a2);
	  System.out.println(a3);
	  
	  System.out.println("**********************************************");
	  int ar[]=new int[3];
	  ar[0]=20;
	  ar[1]=10;
	  ar[2]=5;
	  Arrays.sort(ar);
	  for(int i=0;i<=2;i++)
	  {
		  System.out.println(ar[i]);
		  
	  }
	  
	System.out.println("*******************************************");
	int arr[][]=new int[2][3];
	arr[0][0]=22;
	arr[0][1]=66;
	arr[0][2]=20;
	arr[1][0]=24;
	arr[1][1]=68;
	arr[1][2]=27;
	for(int i=0;i<=1;i++)
	{
		for(int a=0;a<=2;a++)
		{
			System.out.print(" " +arr[i][a]);
		}
		System.out.println("  "+ " ");
	}
	
	System.out.println("************************************************");
	String s="Neelam";
	String s4="abbcaaffa";
	String s1="Aarush";
	String s3="Trisha";
	System.out.println(s.contains(s1));
	System.out.println(s.isEmpty());
	System.out.println(s.equals(s3));
	System.out.println(s.equalsIgnoreCase(s3));
	System.out.println(s.concat(s3));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf("e"));
	System.out.println(s.endsWith("m"));
	System.out.println(s.startsWith("Ne"));
	
	System.out.println(s4.lastIndexOf("a"));
	System.out.println(s.replace("Neelam","Chaudhari"));
	System.out.println(s.substring(0,2));
	System.out.println(s.split(s3));
	
	
	
}
}
