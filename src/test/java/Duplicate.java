import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public void duplicatechar(String str) {
		Map<Character, Integer> basemap = new HashMap<Character, Integer>();
		char[] character = str.toCharArray();

		for (char ch : character) {
			if (basemap.containsKey(ch)) {
				basemap.put(ch, basemap.get(ch) + 1);
			} else {
				basemap.put(ch, 1);
			}
			Set<Character> keys = basemap.keySet();
			for (Character ch1 : keys) {
				if (basemap.get(ch1) > 1) {
					System.out.println(ch1 + "is" + basemap.get(ch1) + "times");
				}
			}
		}
	}

	public static void main(String[] args) {
		Duplicate dup = new Duplicate();
		dup.duplicatechar("India is my country");

	}

	//Reverse of a string character to character
//	public void rstring(String str)
//	{
//		int stringlen = str.length();
//		System.out.println("length of string is" +" "+ stringlen);
//		
//		String reversestring = "";
//		for(int i=stringlen-1;i>=0;i--)
//		{
//			reversestring+= str.charAt(i);
//		}
//		System.out.println("reverse of string is"+" "+ reversestring);
//	}
//	public static void main(String[] args) {
//		Duplicate dup = new Duplicate();
//		dup.rstring("This is my name");
//	}
//}
	
	//reverse a sentence word to word
	
//	public void reversesentence(String str)
//	{
//		String[] words = str.split("\\s");
//		String reverse = "";
//		for(int i=words.length-1;i>=0;i--)
//		{
//			reverse = reverse +words[i]+" ";
//			
//		}
//		System.out.println("this is my reverse"+ " " +reverse);
//		
//		}

//	public static void main(String[] args) {
//	Duplicate dup = new Duplicate();
//	dup.reversesentence("this is my name");
//	}
		
	}