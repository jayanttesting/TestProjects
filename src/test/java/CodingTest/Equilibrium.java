package CodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<String> li = new ArrayList<>();
		// li.add("one");
		// li.add("Three");
		// li.add("Seventeenfour");
		// li.add("hundered");
		//
		// Collections.sort(li, new Comparator<String>() {
		//
		// @Override
		// public int compare(String o1, String o2) {
		// // TODO Auto-generated method stub
		// return o1.length() - o2.length();
		// }
		//
		// });
		//
		// for (int i = 0; i < li.size(); i++) {
		// System.out.println(li.get(i));
		// }
		//

		int inputArray[] = { 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1 };

		int n = inputArray.length;
		
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - 1; j++)
				if (inputArray[i] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;

				}
		for(int i =0;i<n;i++)
		{
			System.out.println(inputArray[i]);
		}
	}
}
