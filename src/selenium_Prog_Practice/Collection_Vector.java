package selenium_Prog_Practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Collection_Vector 
{
	public static void main(String[] args) {
		
	Vector v=new Vector();
	
	  v.add(100);
	  v.add("data");
	  v.add(200);
	  v.add('A');
	  v.add(20.30d);
	  v.add(100);
	  v.add("NULL");
	  System.out.println(v);
	  System.out.println("********************************");
	  Iterator e=v.iterator();
	  while(e.hasNext())
	  {
		  System.out.println(e.next());
	  }
	  System.out.println(v.contains(100));
	  System.out.println(v.set(1,"Nalini"));
	  System.out.println(v.isEmpty());
	  System.out.println(v.remove(3));
	  System.out.println(v.get(4));
	//  System.out.println(v.size());
	 // System.out.println(v.indexOf(3));
	  Enumeration e1=v.elements();
	 while(e1.hasMoreElements())
	 {	  
	  System.out.println(e1.nextElement());
	}
	  

}}
