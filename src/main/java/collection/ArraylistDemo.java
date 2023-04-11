package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// ArrayList using Integer
		List<String> sublist = new ArrayList<>();
		sublist.add("Maths");
		sublist.add("english");
		sublist.add("Marathi");
		sublist.add("Hindi");
		Iterator it = sublist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//ArrayList using string
		ArrayList<String>datelist=new ArrayList<>();
		datelist.add("Monday");
		datelist.add("Tuesday");
		datelist.add("friday");
		datelist.add("sunday");
		Iterator it1=datelist.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

		
		
		//Adding integer list & string list
		System.out.println("***Adding two arrays***");
		//sublist.addAll(datelist);
		//System.out.println("result after addtion: "+sublist);
		
		//Use contains method 
		System.out.println("***check if particular object is present in arraylist or not***");
		System.out.println("check maths is present or not: "+sublist.contains("Maths"));
		System.out.println("check maths is present or not: "+datelist.contains("Friday"));//have to check
		
		//check index of object
		System.out.println("***checking index of object***");
		System.out.println("check index: "+datelist.indexOf("sunday"));
		System.out.println("check index: "+sublist.indexOf("hindi")); //have to check
		
		//removing object from list
		System.out.println("***removing items from list***");
        System.out.println("remove particular item from list: "+datelist.remove(2));
        System.out.println("remove particular item from list: "+sublist.remove("Maths"));
        System.out.println("Print datelist after remove object: " +datelist);
        System.out.println("Print sublist after remove object: " +sublist);
        
        //craeting arrays in different manner
        ArrayList<Integer>ar1=new ArrayList<Integer>(Arrays.asList(1,8,4,9,21,6,14,18));
        System.out.println("***create array list with diff method***:" +ar1);
        
        //clear array list
        System.out.println("***clear array list***:");
        ar1.clear();
        System.out.println("print result after clear array: "+ar1);
        
        //creating sublist from aaryalist
        ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(1,8,4,9,21,6,14,18));
        ArrayList<Integer>sublist1=new ArrayList<Integer>(list.subList(2, 3));
        System.out.println("print sublsit: "+sublist1);
        
        
	}

}
