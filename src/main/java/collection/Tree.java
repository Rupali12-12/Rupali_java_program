package collection;
import java.util.Map;
import java.util.TreeMap;
public class Tree {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<>();
		 
        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
 
	}

}
