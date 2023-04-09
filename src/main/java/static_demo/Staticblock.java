package static_demo;
import java.util.Scanner;

public class Staticblock {

	public static void main(String[] args) {

    int a=10;
    int b=5;
    int c;
    c=a*b;
    System.out.println("print multiplication:"+c);
	}

	static {
		
	Scanner sc=new Scanner(System.in);
	
	int d,h,y;		
	System.out.println("enter the value of d:");
	d=sc.nextInt();
	System.out.println("enter value of h");
	h=sc.nextInt();
	y=d+h;
	System.out.println("print result:" +y);
	
	}
	static {
		System.out.println("print hello");
	}
}
