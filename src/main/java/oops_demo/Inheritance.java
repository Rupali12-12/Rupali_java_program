package oops_demo;

class car {
	public void alto() {
		System.out.println("alto car");
	}
	
}
class nexon extends car{
	public void i10() {
		System.out.println("Car i10");
	}
}
public class Inheritance {

	
	public static void main(String[] args) {
		nexon n=new nexon();
		n.alto();
		n.i10();

	}

}
