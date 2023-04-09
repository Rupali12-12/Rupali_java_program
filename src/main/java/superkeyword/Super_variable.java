package superkeyword;

public class Super_variable {

	public static void main(String[] args) {

		child1 ch = new child1();
		ch.display();
	}

}

class parent1 {
	int data = 123;
}

class child1 extends parent1 {
	int data = 100;

	public void display() {
		System.out.println(data);
		System.out.println(super.data);
	}
}