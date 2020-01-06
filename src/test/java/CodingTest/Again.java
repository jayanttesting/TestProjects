package CodingTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.checkerframework.checker.units.qual.Length;

public class Again {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<>();
		li.add("Jayant");
		li.add("Sam");
		li.add("Krish");
		li.add("Swamivandanam");

		Collections.sort(li, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

	}

}
