package collection;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayExample {

	public static void main(String[] args) {
		// All the collections will store only the Objects not the primitive date types.
				// Default class
				// Dynamic Array
				// Default generic means we can store any kind of data in ArrayList i.e String, Integer, Float
				// if we write like :: ArrayList ar= new ArrayList(), then warning message comes :ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
				// Good to use in this way
				// Indexing start from 0
				// Negative indexing is not allowed in Java
				ArrayList<Object> ary = new ArrayList<Object>();
				ary.add("213");
				ary.add("csk");
				ary.add("dl");
				ary.add("31.20");
				ary.add(false);
				System.out.println("Size of ArrayList: " + ary.size());
				System.out.println("Values at Arraylist: "+ary);
				System.out.println("Value at second index :::: " + ary.get(3));
				ary.add("5000");
				ary.add("Testing");
				System.out.println("Size of ArrayList after adding few more items :::: " + ary.size());

				System.out.println("***************************************************************************");

				// List with other collection say as Integer 
				ArrayList<Integer> arInt = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
				System.out.println("Creating ArrayList with Integer Array :::: " + arInt);
				
				System.out.println("***************************************************************************");

				// List with other collection say as String 
				ArrayList<String> arStr = new ArrayList<String>(Arrays.asList("C", "C++","Java"));
				System.out.println("Creating ArrayList with String Array :::: " + arStr);
			


	}

}
