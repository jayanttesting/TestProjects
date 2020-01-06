import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Selenium.main.maininput;

public class ClassA {

	// 1,5,32,288....10 times
	// public static int powerramp(int num) {
	//
	// int i;
	// int lastnum = 0;
	// for(i=1;i<=num;i++)
	// {
	// int result = (int) Math.pow(i, i)+lastnum;
	// lastnum = result;
	// System.out.println(lastnum);
	//
	// }
	//
	// return lastnum;
	// }
	// public static void main(String[] args) {
	// ClassA.powerramp(10);
	// }
	// Reverse of String
	//
	// public static String reverse(String str)
	// {
	// String reverse = "";
	//
	// for(int i=str.length()-1;i>0;i--)
	// {
	// reverse = reverse + str.charAt(i);
	// }
	// return reverse;
	//
	// }

	// Count Number of characters in map
	//
	// public static void charcount(String str)
	// {
	//
	// Map<Character, Integer> hmap = new HashMap<>();
	// char[] strarray = str.toCharArray();
	// for(Character ch: strarray)
	// {
	// if(hmap.containsKey(ch))
	// {
	// hmap.put(ch, hmap.get(ch)+1);
	// }
	// else
	// {
	// hmap.put(ch, 1);
	// }
	// }
	// for(Map.Entry<Character, Integer> entry : hmap.entrySet())
	// {
	// System.out.println(entry.getKey()+" "+entry.getValue());
	// }
	//
	// }
	// public static void main(String[] args) {
	// String str = "My name is Jayant";
	// charcount(str);
	// }

	// reverse by splitting

	// static String reversebysplitting(String str)
	// {
	// int i;
	// String reverse = "";
	//
	// String[] stringarray = str.split("\\s");
	//
	// for(i=stringarray.length-1;i>=0;i--)
	// {
	// reverse = reverse + stringarray[i]+ " ";
	// }
	// return reverse;
	// }
	// public static void main(String[] args) {
	//
	// String reverse = reversebysplitting("My name is jayant");
	// System.out.println(reverse);

	// public static void palindrome() {
	//
	// int r, temp;
	//
	// Scanner in = new Scanner(System.in);
	// int num = in.nextInt();
	// temp =num;
	// int sum = 0;
	// while (num > 0) {
	// r = num % 10;
	// sum = (sum * 10) + r;
	// num = num / 10;
	//
	// }
	// if(temp==sum)
	// {
	// System.out.println("is a plaindrome number");
	// }
	// else
	// {
	// System.out.println("is not a plaindrome number");
	// }
	//
	// }
	// public static void main(String[] args) {
	// ClassA.palindrome();
	// }

	// public static void stringpal()
	// {
	// String orignal;
	// String reverse = "";
	// Scanner sc = new Scanner(System.in);
	// orignal = sc.nextLine();
	//
	// for(int i = orignal.length()-1;i>=0;i--)
	// {
	// reverse = reverse + orignal.charAt(i);
	// }
	// if(orignal.equals(reverse))
	// {
	// System.out.println("Is a plaindrome String");
	// }
	// else
	// {
	// System.out.println("Not a plaindrome string");
	// }
	//
	// }
	// public static void main(String[] args) {
	// ClassA.stringpal();
	// }

	public static void fabo() {
		int t1 = 0, t2 = 1;

		int n = 10;
		System.out.print("First " + n + " terms: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(t1 + " + ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}

	public static void main(String[] args) {
		ClassA.fabo();
	}
}
