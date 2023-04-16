package exception;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
public class CompileTime {

	public static void main(String[] args) {
		
		//File not found exception
		System.out.println("Hello");
		File file = new File("/home/techvidvan/file.txt");
	    //FileReader fileReader = new FileReader(file);
	    System.out.println("Successful");

	    
	    //Sql exception & class not found exception
	    Connection con=null; 
	    //Class.forName("com.mysql.cj.jdbc.Driver");   //class not d=found
		//con =DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydb", "mydbuser","mydbuser"); // sql exception
	    
	}

}
