package basics;
import java.util.Scanner;
public class Typecasting {

	public static void main(String[] args) {
		/*Using sacnner class
		Scanner sc= new Scanner(System.in);
		String str,str2;
		 int a,b,c;
		 System.out.println("enter 1st num");
		 str=sc.nextLine();
		 System.out.println("enter 2nd num");
		 str2=sc.nextLine();
		 a=Integer.parseInt(str);
		 b=Integer.parseInt(str2);
		 //c=Integer.parseInt(add);
		// c=str+str2;
		 
		 System.out.println();*/
		 
		 
		 
		 //without scanner class
		 //Integer to string
		 int num=1213;
		 String str=Integer.toString(num);
		 System.out.println("print number :"+str);
		 
		 //string to intrger
		 String str2="234";
		 Integer num1=Integer.parseInt(str2);
		 System.out.println("print integer: "+num1);
		 
		 //integer to double
		 int a=2324;
		 double db=(double)a;
		 System.out.println("print double: "+db);
		 
		 
		 
	}

}
