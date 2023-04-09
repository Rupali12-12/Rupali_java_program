package superkeyword;

public class SuperMethod {

	public static void main(String[] args) {
		child obj=new child();
		obj.display();
	}

}
class parent
{
	void message() {
	System.out.println("In parent class ...");
	}
}
class child extends parent
{
	void message() {
		System.out.println("In child class");
	}
	void display() {
		message();
		super.message();
	}
}