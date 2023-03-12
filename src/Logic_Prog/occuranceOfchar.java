package Logic_Prog;

import java.util.HashMap;

public class occuranceOfchar 
{
  public static void main(String[] args) 
  {
	  String org1="MmyNameIs";
	  
	 String  org=org1.toLowerCase();
	 HashMap<Character , Integer> mp=new HashMap<Character , Integer>();
	 for(int i=0;i<=org.length()-1;i++)
	 {
		 char charval=org.charAt(i);
		 if(mp.containsKey(charval))
		 {
			 mp.put(charval,mp.get(charval)+1);
		 }
		 else
		 {
			 mp.put(charval, 1);
		 }
	 }
	 System.out.println(mp);
		 
	
}
}
