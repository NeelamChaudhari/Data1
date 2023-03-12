package OOPs_Concept;

import java.util.Iterator;
import java.util.LinkedList;

public class collection_LinkList
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(100);
		l.add(200);
		l.add("Neelam");
		l.add(21.52);
		l.add("Null");
		System.out.println(l);
		Iterator i1=l.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
