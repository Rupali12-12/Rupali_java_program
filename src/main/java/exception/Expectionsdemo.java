package exception;

public class Expectionsdemo {

	public static void main(String[] args) {
		

		try {
			int a = 12;
			int b = 0;
			int c;
			//c=a/b;
			String str="Apeksha";
			//String str2=null;
			//System.out.println(str2.length());
			//int i=Integer.parseInt(str);
			//System.out.println(c);
			int array[]=new int[3];
		    array[4]=5;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
		System.out.println(e.getMessage());	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			System.out.println("default exception");
		}
	}

}
