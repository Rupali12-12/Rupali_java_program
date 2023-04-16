package oops_demo;

public class Over_ridding {

	public static void main(String[] args) {
		/*
		 * a obj1=new a(); obj1.message(10, 5); c obj2=new c(); obj2.message(12, 34);
		 */
		a obj3=new c();
		obj3.message(18, 6);
		

	}

}
class a{
	public int message(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
		
		return mul;
	}
}
class c extends a{
	public int message(int a,int b) {
		int add=a+b;
		System.out.println(add);
		return add;
		
	}
}