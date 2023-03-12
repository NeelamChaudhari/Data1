package OOPs_Concept;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class collectionVector
{
  public static void main(String[] args)
  {
	Vector v=new Vector();
	v.add(100);
	v.add(200);
	v.add(12.25);
	v.add(v.add("Aarush"));
	v.add(v.add(15.55));
	System.out.println(v.contains(100));
	System.out.println(v.isEmpty());
	System.out.println(v.size());
	System.out.println(v.set(1, "Neel"));
	System.out.println(v.get(0));
	System.out.println(v.remove(1));
	Iterator v1=v.iterator();


while(v1.hasNext())
{
	System.out.println(v1.next());
}

	ListIterator l=v.listIterator();
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	Enumeration e1=v.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
}
}
