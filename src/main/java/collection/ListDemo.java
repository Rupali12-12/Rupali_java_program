package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList<Object> ar = new ArrayList<Object>(); ar.add("100"); ar.add("KK");
		 * ar.add("QA"); ar.add("25.50"); ar.add(true);
		 * System.out.println("Size of ArrayList :::: " + ar.size());
		 * System.out.println("Values in ArrayList :::: " + ar);
		 * System.out.println("Value at second index :::: " + ar.get(0));
		 * ar.add("5000"); ar.add("Testing");
		 * System.out.println("Size of ArrayList after adding few more items :::: " +
		 * ar.size());
		 */
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Peter");
		studentList.add("Jhon");
		studentList.add("James");
for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Students names in ArrayList using for loop :::: " + studentList.get(i));
		}
for (String s : studentList) {
			System.out.println("Students names in ArrayList using for each loop :::: " + s);
		}

        //studentList.stream().forEach(kk -> System.out.println("Students names in ArrayList using Lambda funcation :::: " + kk));
	}

}
