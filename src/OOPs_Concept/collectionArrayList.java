package OOPs_Concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collectionArrayList 
{
   public static void main(String[] args)
   {
	ArrayList a=new ArrayList();
	a.add(100);
	a.add(200);
	a.add("Neelam");
	a.add("Null");
	System.out.println(a);
	Iterator al=a.iterator();
	
	while(al.hasNext())
	{
		System.out.println(al.next());
	}
	
	ListIterator a2=a.listIterator();
	while(a2.hasNext())
	{
		System.out.println(a2.next());
	}
	
	
}
}
