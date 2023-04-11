package static_demo;

import java.util.Scanner;

public class Staticblock {

	private int vr = 12;

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c;
		c = a * b;
		System.out.println("print multiplication:" + c);
	}

	static {

		Scanner sc = new Scanner(System.in);
		// c=a*b; //non-static variables not access in static block
		// vr=d*h;private variables not access in static block
		int d, h, y;

		System.out.println("enter the value of d:");
		d = sc.nextInt();
		System.out.println("enter value of h");
		h = sc.nextInt();
		y = d / h;
		System.out.println("print result:" + y);

	}
	static {
		System.out.println("print hello");
	}
}
