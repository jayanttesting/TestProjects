import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Arrayintocollection {

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		String[] str = { "jayant", "sahil", "quarter", "mobicontrol" };
//
//		Set set = new TreeSet();
//
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(Collections.min(set));
//			System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
//
//			for (int j = 0; j <= 10; i++)
//				System.out.println('-');
//			System.out.println(Collections.max(set));
//			System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));


		
		public static void main(String[] args) {
			int size;
			HashSet<String> collection = new HashSet<String>();
			String str1 = "yellow", str2 = "red", str3 = "white";
			Iterator iterator;
			
			collection.add(str1);
			collection.add(str2);
			collection.add(str3);
			
			System.out.println("collection data:");
			iterator = collection.iterator();
			
			while(iterator.hasNext());
			{
				System.out.println(iterator.next()+ " ");
			}
			size = collection.size();
			
			if(collection.isEmpty()){
				System.out.println("colection is empty");
			}
			else {
				System.out.println("collection size" + size);
			}
		}
	}

