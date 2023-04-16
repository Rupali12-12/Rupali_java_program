package collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
public class Compare_hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "A");
		map2.put(2, "B");
		map2.put(1, "C");
		//map2.put(5, "C");
		//map2.put(7, "C");
  
		//System.out.println("cmpare two map:" +map1.equals(map2));
		//System.out.println("compare two maps as keyset: "+map1.keySet().equals(map2.keySet()));
		
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		combineKeys.addAll(map2.keySet());
		System.out.println("combine keys:" +combineKeys);
		System.out.println(new ArrayList<>(map1.values()).equals(map2.values()));
//		while (it1.hasNext()) {
//			Entry<String, String> entry = it1.next();
//			System.out.println("Key :::: " + entry.getKey() + " Value :::: " + entry.getValue());
//		}
	}

}
