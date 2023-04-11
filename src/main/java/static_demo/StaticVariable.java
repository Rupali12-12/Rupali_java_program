
package static_demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class StaticVariable {
	static int ab = 34;

	public static void main(String[] args) {
		System.out.println("print value: "+ab);
		static12.method1(12, 34);
	}
}
class static12 {
	static void method1(int a, int b) {

		System.out.println("run static method");
		//System.out.println("run static method " + " " +ab);
}
}