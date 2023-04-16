package collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapCompare {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		System.out.println(map1);

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "A");
		map2.put(2, "B");
		map2.put(1, "C");
		System.out.println(map2);

		// As Hashmap does not contain duplicate values to 3 will be stored only once and map1 key set equals to map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(3, "C");
		map3.put(2, "B");
		map3.put(1, "A");
		map3.put(1, "D");
		map3.put(3, "E");
		System.out.println(map3);
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(3, "C");
		map4.put(2, "B");
		map4.put(1, "A");
		map4.put(1, "D");
		map4.put(10, "E");
		System.out.println(map4);
		System.out.println("***************************************");
		// 1. Compare on the key-values : use equal method
		System.out.println(map1.equals(map2));
		System.out.println("****************************************");
		System.out.println(map3.equals(map4));
	
	}

}
