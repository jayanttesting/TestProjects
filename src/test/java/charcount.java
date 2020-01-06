import java.util.HashMap;
import java.util.Map;

class charcount {
	static void enteries(String inputstring) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		char[] strArray = inputstring.toCharArray();

		for (char c : strArray) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);

			} else {
				hmap.put(c, 1);
			}
		}
		for (Map.Entry entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());
		}
	}

	public static void main(String args[]) {
	}
}
