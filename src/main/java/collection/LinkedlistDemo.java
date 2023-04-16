package collection;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		List<Integer> ln = new LinkedList<Integer>();
		ln.add(12);
		ln.add(45);
		ln.add(15);
		System.out.println("print:" + ln);
		Iterator it = ln.iterator();
		while (it.hasNext()) {
			System.out.println("Print list: " + it.next());
		}

		System.out.println("print size of list:" + ln.size());
		System.out.println("print particular index value:" + ln.get(2)); // array index out of bound exception
		System.out.println("demo:" + ln.indexOf(15));
		ln.add(3, null);
		ln.add(4, null);

		System.out.println(ln);
		// sSystem.out.println(ln.remove(23));
		System.out.println(ln);

		// adding exiting list into new
		LinkedList<String> kl = new LinkedList<String>();
		kl.add("Peter");
		kl.add("Kat");

		LinkedList<String> users = new LinkedList<String>();
		users.add("jony");
		users.add("monty");
		kl.addAll(users); // add two list
		System.out.println(kl);
		// Adding name at 1st position
		users.addFirst("purna");
		// Adding name at last position
		users.addLast("samy");
		System.out.println(users);
		users.remove(2);
		System.out.println(users);
		users.removeFirst();
		System.out.println(users);
		users.removeLast();
		System.out.println(users);
		kl.clear();
		System.out.println(kl);
		
		//printing list item in descending order
		LinkedList<String> item = new LinkedList<String>();
		item.add("new");
		item.add("old");
		item.add("black");
		item.add("red");
		Iterator it2=item.descendingIterator();
		while(it2.hasNext()) {
			System.out.println("print in descending oreder: " +it2.next());
		}
		//print in sorted order
		Collections.sort(item);
		System.out.println(item);

	}

}
