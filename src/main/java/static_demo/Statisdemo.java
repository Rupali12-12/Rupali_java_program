package static_demo;

public class Statisdemo {
	static int var = 21;

	public static void main(String[] args) {
		System.out.println("run static method " + "     " + var);
		static1.method1(1, 3);
	}

	static {

		System.out.println("static block..."); // run 1st
		int c = 12;
		int ad;
		ad = c / 0;
		System.out.println(ad); // excepetion handling in static block
	}

}

class static1 {
	static void method1(int a, int b) {

		System.out.println("run static method");
		// System.out.println("run static method " + " " +var);

	}
}