package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist_compare {

	public static void main(String[] args) {


		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("dev");
		l1.add("khan");
		l1.add("luna");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Tom");
		l2.add("Peter");
		l2.add("Jhon");
		l2.add("Jack");

		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("dev");
		l3.add("khan");
		l3.add("luna");

		// Sorting using Collection class
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		//check if these array list are equals or not
		System.out.println("check l1 & l2 are equals or not using sorting and equals: " +l1.equals(l2));
		System.out.println("check l1 & l3 are equals or not using sorting and equals: " +l1.equals(l3));
		
		//compare two list and find additional elements
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("kgf", "Jakcy","vicky", "Peter"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("kgf", "vicky", "Jackson"));
		l4.removeAll(l5);
		System.out.println("compare and find out additional element: " +l4);
		l5.removeAll(l4);
		System.out.println("compare and find out additional element: " +l5);
		
		//Compare two list - find out the common elements

		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("QA", "Dev", "IT", "HR"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("QA", "Dev", "IT", "HR", "Finance", "Admin"));
		l6.retainAll(l7);
		System.out.println("Compare two list - find out the common elements: " + l6);


 


	}

}
