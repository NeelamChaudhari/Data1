package OOPs_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class OccaranceOfStringUsingHashMap 
{
     public static void main(String[] args) 
     {
		String org="Neelam is great";
		Map<String ,Integer> mp=new HashMap<>();
		String words[]=org.split(" ");
		for(String word:words)
		{
		  if(mp.containsKey(word))	
		  {
			  mp.put(word, mp.get(word)+1);
		  }
		  else
		  {
			  mp.put(word,1);
			  
		  
		  }
		
		}
		System.out.println(mp);
	}
}
