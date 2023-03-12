package selenium1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class collection 
{
	public static void main(String[] args)
	{
		//ArrayList
   ArrayList l1=new ArrayList();
   l1.add(100);
   l1.add("NULL");
   l1.add(12.45);
   l1.add("Neel");
   System.out.println(l1);
   System.out.println(l1.isEmpty());
   System.out.println(l1.contains(100));
   System.out.println(l1.set(0, 200));
   System.out.println(l1.remove(0));
   
   Iterator itr=l1.iterator();
   while( itr.hasNext())
   {
	  System.out.println(itr.next());
   }
   for(Object o1:l1)
   {
	   System.out.println(o1);
   }
   

		System.out.println("****************ArrayList Finished******************");
		Vector v=new Vector();
		v.add(200);
		v.add("Nalin");
		v.add('A');
		v.add(5.01);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
	}

}
