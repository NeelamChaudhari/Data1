package Logic_Prog;

import java.util.HashMap;
import java.util.Map;

public class occaranceOfString
{
  public static void main(String[] args) 
  { 
	  String org="My Name Is Neelam";
	 Map<String ,Integer> mp=new HashMap<>();
	  String words[]=org.split(" ");
	  for(String word:words)
	  {
		  if(mp.containsKey(word))
		  {
			  mp.put(word,mp.get(word)+1);
		  }
		  else
		  {
			  mp.put(word, 1);
		  }
	  }
	System.out.println(mp);
}
}
