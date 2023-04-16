package collection;

import java.util.*;

public class HashMap_demo {

	public static void main(String[] args) {

		// No oder / indexing
		// Stores the values in form of Keys,Values - <K,V>
		// Can store n number of NULL values, but only one NULL key
		// If we store more then one NULL Keys, then latest will be returned
		// HashMap is not thread safe

		HashMap<Integer, String> hp1 = new HashMap<Integer, String>();
		//hp1.put(1, "QA");//can not have duplicate values
		hp1.put(13, "QA");
		hp1.put(1, "admin");
		hp1.put(null, "SA");
		hp1.put(12, "dev");
		hp1.put(null, "PO");
		System.out.println(hp1);
		
		System.out.println("return value base on value:"+hp1.get(12));
		System.out.println(hp1.get(1));
		System.out.println(hp1.get(null));
		//System.out.println(hp1.remove(12));
		System.out.println(hp1);

		// Iterator : Over the keys : by Using Keyset()
				Iterator<Integer> it= hp1.keySet().iterator();
				while(it.hasNext())
				{
					Integer key= it.next();
					String value = hp1.get(key);
					System.out.println("key  = " + key + "      "  +  "Value = " + value);
				}

	}

}
