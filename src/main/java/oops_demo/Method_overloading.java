package oops_demo;

public class Method_overloading {

	public static void main(String[] args) {
		Method_overloading mo=new Method_overloading();
		Method_overloading mo1=new Method_overloading();
		mo.display();
		mo1.display(12);
		mo.display(21, 19);
		mo1.display("add", 12, 12.8);

		b obj=new b();
		obj.divide(12, 6);
		
	}

	public void display() {
		System.out.println("method overloading with no parameter");
	}
	public void display(int a) {
		System.out.println("method overloading with single parameter");
		System.out.println(a);
	}
	public void display(int a, int b) {
		System.out.println("method overloading with two parameter");
		int c;
		c=a+b;
		System.out.println(c);

	}
	public void display(String s,int c,double b) {
		System.out.println("method overloading with multiple parameter");
    System.out.println(s+ "         " +c+ "        "+b );
	}
}
class b{
	public int divide (int a, int b) {
		int div=a/b;
		System.out.println(div);
		return div;
		
		
	}
}
