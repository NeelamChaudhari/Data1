package OOPs_Concept;

public class StringCompare 
{
	public static void main(String[] args)
	{
		String str="NeelamNitinChaudhari";
		
		String ar[]=new String[2];
		ar[0]="Neelam";
		ar[1]="Neelam";
		String s1="Nilaa";
		String s2="Nil";
		String s3="Nalini";
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat(s3));
		System.out.println(s1.isEmpty());
		System.out.println(ar[0].equals(ar[1]));
		System.out.println(s1.startsWith("Ne"));
		System.out.println(s1.endsWith("am"));
		System.out.println(s1.contains(s3));
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s3.substring(2));
		System.out.println(s1.replace("Nil","Nilu"));
		
		System.out.println(str.substring(6,11));
		
	}

}
