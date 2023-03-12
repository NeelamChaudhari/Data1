package selenium_Prog_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class collection
{
  public static void main(String[] args)
  {
	//collection
	  ArrayList a=new ArrayList();
	  a.add(100);
	  a.add("data");
	  a.add(200);
	  a.add('A');
	  a.add(20.30d);
	  a.add(100);
	  a.add("NULL");
	  System.out.println(a);
	  System.out.println("********************************");
	  Iterator e=a.iterator();
	  while(e.hasNext())
	  {
		  System.out.println(e.next());
	  }
	  System.out.println(a.contains(100));
	  System.out.println(a.set(1,"Nalini"));
	  System.out.println(a.isEmpty());
	  System.out.println(a.remove(3));
	  System.out.println(a.get(4));
	  System.out.println(a.size());
	  System.out.println(a.indexOf(a));
	  
	  
	  
}
}
