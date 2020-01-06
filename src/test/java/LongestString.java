
public class LongestString {

	
	public static String getlongstring(String[] array)
	{
		int maxlength = 0;
		String longeststring = null;
		for(String s:array)
		{
			System.out.println(s.length());
			if(s.length()>maxlength)
			{
				maxlength = s.length();
				longeststring = s;
			}
		}
		return longeststring;
	}
	
	public static void main(String[] args) {
		
		String[] country = {"singapore", "Europe", "paris","Faridabad", "New york"};
		String longeststring = getlongstring(country);
		System.out.println(longeststring);
		
	}
}
