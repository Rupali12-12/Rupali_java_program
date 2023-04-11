package exception;

public class Exception_example {

	public static void main(String[] args) {
		 //Connection con=null; Class.forName("com.mysql.cj.jdbc.Driver"); 
		 // con =DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydb", "mydbuser","mydbuser"); // FileInputStream
		  //fs=new FileInputStream(""); //file not found exception (complie time)
		  //Thread.sleep(10); //Interrupted exception
		  int a = 12; 
		  int b = 0; 
		  int c; 
		  int array[] = new int[4];
		  array[5] = 12; 
		  // int d="pornima"; //compile time exception //
		  c=a/b; // runtime exception
		  String s = null; // System.out.println(s.length());
		  System.out.println(array[5]);
		  
		  }

		}

		// user defined exception
		//built in exception // checked exception- compiletime-filenot found, sql, interpttuedexpection 
		// unchecked exception- runtime-arrayIndexoutof bound ,airthmetic ,nullpointer
